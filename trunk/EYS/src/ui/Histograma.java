package ui;

import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public final class Histograma extends ApplicationFrame {

    public Histograma(String title, double[] vector) {
        super(title);
        JPanel chartPanel = crearPanel(title, vector);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        setContentPane(chartPanel);
    }

    public Histograma(String title, double[] vector, int intervalos) {
        super(title);
        JPanel chartPanel = crearPanel(title, vector, intervalos);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        setContentPane(chartPanel);
    }

    public Histograma(String title, double[] vector, int intervalos, double[][] datos) {
        super(title);
        JPanel chartPanel = crearPanel(title, vector, intervalos, datos);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        setContentPane(chartPanel);
    }

    private IntervalXYDataset crearDataset(double[] vector) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Intervalos", vector, calcularCantidadIntervalos(vector.length));
        return dataset;
    }

    private IntervalXYDataset crearDataset(double[] vector, int intervalos) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("Intervalos", vector, intervalos);
        return dataset;
    }

    private IntervalXYDataset crearDataset(double[] vector, int intervalos, double[][] datos) {
        HistogramDataset dataset = new HistogramDataset();
        for (int i = 0; i < intervalos; i++) {
            double[] vectorVacio = new double[(int) vector[i]];
            dataset.addSeries("Intervalo " + (i + 1), vectorVacio, 1, datos[i][0], datos[i][1]);
        }

        return dataset;
    }

    private JFreeChart crearChart(String nombre, IntervalXYDataset dataset) {
        JFreeChart chart = ChartFactory.createHistogram(
                nombre,
                null,
                null,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        XYPlot plot = (XYPlot) chart.getPlot();
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        try {
            ChartUtilities.saveChartAsJPEG(new File("histograma.jpg"), chart, 500, 475);
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }
        return chart;
    }

    public JPanel crearPanel(String nombre, double[] vector) {
        JFreeChart chart = crearChart(nombre, crearDataset(vector));
        return new ChartPanel(chart);
    }

    public JPanel crearPanel(String nombre, double[] vector, int intervalos) {
        JFreeChart chart = crearChart(nombre, crearDataset(vector, intervalos));
        return new ChartPanel(chart);
    }

    public JPanel crearPanel(String nombre, double[] vector, int intervalos, double[][] datos) {
        JFreeChart chart = crearChart(nombre, crearDataset(vector, intervalos, datos));
        return new ChartPanel(chart);
    }

    /*public static void main(String[] args) throws IOException {
     Histograma histo = new Histograma("Histograma");
     histo.pack();
     RefineryUtilities.centerFrameOnScreen(histo);
     histo.setVisible(true);
     }*/
    public void execute() {
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);
    }

    private int calcularCantidadIntervalos(int cantidadNumeros) {
        int intervalos;
        //Regla de Sturges para calcular el número de clases ideal de un histograma
        intervalos = (int) (1 + (3.32 * Math.log(cantidadNumeros)));
        System.out.println("Intervalos: " + intervalos);
        intervalos = intervalos * 2;
        return intervalos;
    }
}
