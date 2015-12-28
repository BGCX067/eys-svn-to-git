package ui;

import VariablesAleatorias.Erlang_K;
import VariablesAleatorias.Gamma;
import VariablesAleatorias.Normal;
import VariablesAleatorias.PoissonModificada;
import VariablesAleatorias.TransformadaInversaDiscreta;
import VariablesAleatorias.TransformadaInversaEmpirica;
import VariablesAleatorias.TransformadaInversaExponencial;
import VariablesAleatorias.TransformadaInversaGeometrica;
import VariablesAleatorias.TransformadaInversaTriangular;
import VariablesAleatorias.TransformadaInversaUniforme;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        erlangKEtapasMedia_Frame = new javax.swing.JFrame();
        media_TextField = new javax.swing.JTextField();
        erlangKHistograma_Button = new javax.swing.JButton();
        media_Label = new javax.swing.JLabel();
        etapas_TextField = new javax.swing.JTextField();
        etapas_Label = new javax.swing.JLabel();
        muestrasErlang_Label = new javax.swing.JLabel();
        muestrasErlang_TextField = new javax.swing.JTextField();
        erlangKLambda_Frame = new javax.swing.JFrame();
        muestrasErlangLambda_TextField = new javax.swing.JTextField();
        erlangLambdaHistograma_Button = new javax.swing.JButton();
        muestrasErlangLambda_Label = new javax.swing.JLabel();
        lambdaErlang_TextField = new javax.swing.JTextField();
        lambdaErlang_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etapasErlangLambda_TextField = new javax.swing.JTextField();
        gammaMediaDesTipica_Frame = new javax.swing.JFrame();
        mediaGamma_Label = new javax.swing.JLabel();
        mediaGamma_TextField = new javax.swing.JTextField();
        desTipicaGamma_TextField = new javax.swing.JTextField();
        desTipicaGamma_Label = new javax.swing.JLabel();
        gammaMediaHistograma_Button = new javax.swing.JButton();
        muestrasMediaGamma_Label = new javax.swing.JLabel();
        muestrasMediaGamma_TextField = new javax.swing.JTextField();
        gammaBetaTeta_Frame = new javax.swing.JFrame();
        betaGamma_TextField = new javax.swing.JTextField();
        betaGamma_Label = new javax.swing.JLabel();
        muestrasBetaGamma_TextField = new javax.swing.JTextField();
        gammaBetaHistograma_Button = new javax.swing.JButton();
        muestrasBetaGamma_Label = new javax.swing.JLabel();
        tettaGamma_TextField = new javax.swing.JTextField();
        tettaGamma_Label = new javax.swing.JLabel();
        normalGauss_Frame = new javax.swing.JFrame();
        gaussHistograma_Button = new javax.swing.JButton();
        muestrasGauss_Label = new javax.swing.JLabel();
        muestrasGauss_TextField = new javax.swing.JTextField();
        normalSchemeiser_Frame = new javax.swing.JFrame();
        muestrasSchemeiser_TextField = new javax.swing.JTextField();
        muestrasSchemeiser_Label = new javax.swing.JLabel();
        schemeiserHistograma_Button = new javax.swing.JButton();
        poisson_Frame = new javax.swing.JFrame();
        alphaPoisson_Label = new javax.swing.JLabel();
        alphaPoisson_TextField = new javax.swing.JTextField();
        muestrasPoisson_Label = new javax.swing.JLabel();
        poissonHistograma_Button = new javax.swing.JButton();
        muestrasPoisson_TextField = new javax.swing.JTextField();
        discreta_Frame = new javax.swing.JFrame();
        intervalosDiscreta_Label = new javax.swing.JLabel();
        intervalosDiscreta_TextField = new javax.swing.JTextField();
        muestrasDiscreta_Label = new javax.swing.JLabel();
        muestrasDiscreta_TextField = new javax.swing.JTextField();
        discreta_Button = new javax.swing.JButton();
        empirica_Frame = new javax.swing.JFrame();
        muestrasEmpirica_TextField = new javax.swing.JTextField();
        empirica_Button = new javax.swing.JButton();
        intervalosEmpirica_Label = new javax.swing.JLabel();
        intervalosEmpirica_TextField = new javax.swing.JTextField();
        muestrasEmpirica_Label = new javax.swing.JLabel();
        exponencial_Frame = new javax.swing.JFrame();
        mediaExponencial_Label = new javax.swing.JLabel();
        mediaExponencial_TextField = new javax.swing.JTextField();
        muestrasExponencial_Label = new javax.swing.JLabel();
        muestrasExponencial_TextField = new javax.swing.JTextField();
        exponencialHistograma_Button = new javax.swing.JButton();
        geometrica_Frame = new javax.swing.JFrame();
        probabilidadGeometrica_Label = new javax.swing.JLabel();
        probabilidadGeometrica_TextField = new javax.swing.JTextField();
        muestrasGeometrica_Label = new javax.swing.JLabel();
        muestrasGeometrica_TextField = new javax.swing.JTextField();
        geometricaHistograma_Button = new javax.swing.JButton();
        triangularInicioFin_Frame = new javax.swing.JFrame();
        inicioTriangularSimple_Label = new javax.swing.JLabel();
        muestrasTriangularSimple_TextField = new javax.swing.JTextField();
        inicioTriangularSimple_TextField = new javax.swing.JTextField();
        finTriangularSimple_Label = new javax.swing.JLabel();
        finTriangularSimple_TextField = new javax.swing.JTextField();
        triangularSimpleHistograma_Button = new javax.swing.JButton();
        muestrasTriangularSimple_Label = new javax.swing.JLabel();
        triangularInicioAlturaFin_Frame = new javax.swing.JFrame();
        inicioTriangular_Label = new javax.swing.JLabel();
        muestrasTriangular_Label = new javax.swing.JLabel();
        triangularHistograma_Button = new javax.swing.JButton();
        finTriangular_TextField = new javax.swing.JTextField();
        finTriangular_Label = new javax.swing.JLabel();
        inicioTriangular_TextField = new javax.swing.JTextField();
        muestrasTriangular_TextField = new javax.swing.JTextField();
        alturaTriangular_Label = new javax.swing.JLabel();
        alturaTriangular_TextField = new javax.swing.JTextField();
        uniforme_Frame = new javax.swing.JFrame();
        inicioUniforme_Label = new javax.swing.JLabel();
        muestrasUniforme_Label = new javax.swing.JLabel();
        uniformeHistograma_Button = new javax.swing.JButton();
        finUniforme_TextField = new javax.swing.JTextField();
        finUniforme_Label = new javax.swing.JLabel();
        inicioUniforme_TextField = new javax.swing.JTextField();
        muestrasUniforme_TextField = new javax.swing.JTextField();
        rellenarTablaDiscreta = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDiscreta = new javax.swing.JTable();
        discretaHistograma_Button = new javax.swing.JButton();
        rellenarTablaEmpirica = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpirica = new javax.swing.JTable();
        empiricaHistograma_Button = new javax.swing.JButton();
        erlangKEtapasMedia_JButton = new javax.swing.JButton();
        erlangKLambda_JButton = new javax.swing.JButton();
        gammaMediaDesTipica_JButton = new javax.swing.JButton();
        gammaBetaTeta_JButton = new javax.swing.JButton();
        normalGauss_JButton = new javax.swing.JButton();
        normalSchemeiser_JButton = new javax.swing.JButton();
        poisson_JButton = new javax.swing.JButton();
        discreta_JButton = new javax.swing.JButton();
        empirica_JButton = new javax.swing.JButton();
        exponencial_JButton = new javax.swing.JButton();
        geometrica_JButton = new javax.swing.JButton();
        triangularInicioFin_JButton = new javax.swing.JButton();
        triangularInicioAlturaFin_JButton = new javax.swing.JButton();
        uniforme_JButton = new javax.swing.JButton();

        erlangKEtapasMedia_Frame.setMinimumSize(new java.awt.Dimension(300, 180));
        erlangKEtapasMedia_Frame.setResizable(false);

        erlangKHistograma_Button.setText("Generar Histograma");
        erlangKHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erlangKHistograma_ButtonActionPerformed(evt);
            }
        });

        media_Label.setText("Media:");

        etapas_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etapas_TextFieldActionPerformed(evt);
            }
        });

        etapas_Label.setText("Etapas:");

        muestrasErlang_Label.setText("Muestras:");

        muestrasErlang_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestrasErlang_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout erlangKEtapasMedia_FrameLayout = new javax.swing.GroupLayout(erlangKEtapasMedia_Frame.getContentPane());
        erlangKEtapasMedia_Frame.getContentPane().setLayout(erlangKEtapasMedia_FrameLayout);
        erlangKEtapasMedia_FrameLayout.setHorizontalGroup(
            erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erlangKEtapasMedia_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(erlangKEtapasMedia_FrameLayout.createSequentialGroup()
                        .addComponent(erlangKHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(erlangKEtapasMedia_FrameLayout.createSequentialGroup()
                        .addGroup(erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(muestrasErlang_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(media_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etapas_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(media_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(muestrasErlang_TextField)
                            .addComponent(etapas_TextField))
                        .addGap(10, 10, 10))))
        );
        erlangKEtapasMedia_FrameLayout.setVerticalGroup(
            erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erlangKEtapasMedia_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etapas_Label)
                    .addComponent(etapas_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(media_Label)
                    .addComponent(media_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(erlangKEtapasMedia_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasErlang_Label)
                    .addComponent(muestrasErlang_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(erlangKHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        erlangKLambda_Frame.setMinimumSize(new java.awt.Dimension(300, 170));
        erlangKLambda_Frame.setResizable(false);

        erlangLambdaHistograma_Button.setText("Generar Histograma");
        erlangLambdaHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erlangLambdaHistograma_ButtonActionPerformed(evt);
            }
        });

        muestrasErlangLambda_Label.setText("Muestras:");

        lambdaErlang_Label.setText("Lambda:");

        jLabel1.setText("Etapas:");

        javax.swing.GroupLayout erlangKLambda_FrameLayout = new javax.swing.GroupLayout(erlangKLambda_Frame.getContentPane());
        erlangKLambda_Frame.getContentPane().setLayout(erlangKLambda_FrameLayout);
        erlangKLambda_FrameLayout.setHorizontalGroup(
            erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erlangKLambda_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erlangLambdaHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(erlangKLambda_FrameLayout.createSequentialGroup()
                        .addGroup(erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lambdaErlang_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestrasErlangLambda_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(muestrasErlangLambda_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(lambdaErlang_TextField)
                            .addComponent(etapasErlangLambda_TextField))))
                .addContainerGap())
        );
        erlangKLambda_FrameLayout.setVerticalGroup(
            erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erlangKLambda_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lambdaErlang_Label)
                    .addComponent(lambdaErlang_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etapasErlangLambda_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(erlangKLambda_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasErlangLambda_Label)
                    .addComponent(muestrasErlangLambda_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erlangLambdaHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gammaMediaDesTipica_Frame.setMinimumSize(new java.awt.Dimension(300, 180));
        gammaMediaDesTipica_Frame.setResizable(false);

        mediaGamma_Label.setText("Media:");

        desTipicaGamma_Label.setText("Desviación Típica:");

        gammaMediaHistograma_Button.setText("Generar Histograma");
        gammaMediaHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gammaMediaHistograma_ButtonActionPerformed(evt);
            }
        });

        muestrasMediaGamma_Label.setText("Muestras:");

        javax.swing.GroupLayout gammaMediaDesTipica_FrameLayout = new javax.swing.GroupLayout(gammaMediaDesTipica_Frame.getContentPane());
        gammaMediaDesTipica_Frame.getContentPane().setLayout(gammaMediaDesTipica_FrameLayout);
        gammaMediaDesTipica_FrameLayout.setHorizontalGroup(
            gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gammaMediaDesTipica_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gammaMediaHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gammaMediaDesTipica_FrameLayout.createSequentialGroup()
                        .addGroup(gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(muestrasMediaGamma_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desTipicaGamma_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mediaGamma_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mediaGamma_TextField)
                            .addComponent(desTipicaGamma_TextField)
                            .addComponent(muestrasMediaGamma_TextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        gammaMediaDesTipica_FrameLayout.setVerticalGroup(
            gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gammaMediaDesTipica_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaGamma_Label)
                    .addComponent(mediaGamma_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desTipicaGamma_Label)
                    .addComponent(desTipicaGamma_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gammaMediaDesTipica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasMediaGamma_Label)
                    .addComponent(muestrasMediaGamma_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gammaMediaHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gammaBetaTeta_Frame.setMinimumSize(new java.awt.Dimension(300, 200));

        betaGamma_Label.setText("Beta:");

        gammaBetaHistograma_Button.setText("Generar Histograma");
        gammaBetaHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gammaBetaHistograma_ButtonActionPerformed(evt);
            }
        });

        muestrasBetaGamma_Label.setText("Muestras:");

        tettaGamma_Label.setText("Tetta:");

        javax.swing.GroupLayout gammaBetaTeta_FrameLayout = new javax.swing.GroupLayout(gammaBetaTeta_Frame.getContentPane());
        gammaBetaTeta_Frame.getContentPane().setLayout(gammaBetaTeta_FrameLayout);
        gammaBetaTeta_FrameLayout.setHorizontalGroup(
            gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gammaBetaTeta_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gammaBetaHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gammaBetaTeta_FrameLayout.createSequentialGroup()
                        .addGroup(gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(muestrasBetaGamma_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tettaGamma_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(betaGamma_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(betaGamma_TextField)
                            .addComponent(tettaGamma_TextField)
                            .addComponent(muestrasBetaGamma_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        gammaBetaTeta_FrameLayout.setVerticalGroup(
            gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gammaBetaTeta_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betaGamma_Label)
                    .addComponent(betaGamma_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tettaGamma_Label)
                    .addComponent(tettaGamma_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gammaBetaTeta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasBetaGamma_Label)
                    .addComponent(muestrasBetaGamma_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gammaBetaHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        normalGauss_Frame.setMinimumSize(new java.awt.Dimension(300, 130));

        gaussHistograma_Button.setText("Generar Histograma");
        gaussHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaussHistograma_ButtonActionPerformed(evt);
            }
        });

        muestrasGauss_Label.setText("Muestras:");

        javax.swing.GroupLayout normalGauss_FrameLayout = new javax.swing.GroupLayout(normalGauss_Frame.getContentPane());
        normalGauss_Frame.getContentPane().setLayout(normalGauss_FrameLayout);
        normalGauss_FrameLayout.setHorizontalGroup(
            normalGauss_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalGauss_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(normalGauss_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gaussHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addGroup(normalGauss_FrameLayout.createSequentialGroup()
                        .addComponent(muestrasGauss_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(muestrasGauss_TextField)))
                .addContainerGap())
        );
        normalGauss_FrameLayout.setVerticalGroup(
            normalGauss_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalGauss_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(normalGauss_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasGauss_Label)
                    .addComponent(muestrasGauss_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gaussHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        normalSchemeiser_Frame.setMinimumSize(new java.awt.Dimension(300, 130));

        muestrasSchemeiser_Label.setText("Muestras:");

        schemeiserHistograma_Button.setText("Generar Histograma");
        schemeiserHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schemeiserHistograma_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout normalSchemeiser_FrameLayout = new javax.swing.GroupLayout(normalSchemeiser_Frame.getContentPane());
        normalSchemeiser_Frame.getContentPane().setLayout(normalSchemeiser_FrameLayout);
        normalSchemeiser_FrameLayout.setHorizontalGroup(
            normalSchemeiser_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalSchemeiser_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(normalSchemeiser_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(schemeiserHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addGroup(normalSchemeiser_FrameLayout.createSequentialGroup()
                        .addComponent(muestrasSchemeiser_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(muestrasSchemeiser_TextField)))
                .addContainerGap())
        );
        normalSchemeiser_FrameLayout.setVerticalGroup(
            normalSchemeiser_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalSchemeiser_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(normalSchemeiser_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasSchemeiser_Label)
                    .addComponent(muestrasSchemeiser_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(schemeiserHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        poisson_Frame.setMinimumSize(new java.awt.Dimension(300, 160));

        alphaPoisson_Label.setText("Alpha:");

        muestrasPoisson_Label.setText("Muestras:");

        poissonHistograma_Button.setText("Generar Histograma");
        poissonHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poissonHistograma_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout poisson_FrameLayout = new javax.swing.GroupLayout(poisson_Frame.getContentPane());
        poisson_Frame.getContentPane().setLayout(poisson_FrameLayout);
        poisson_FrameLayout.setHorizontalGroup(
            poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poisson_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poissonHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(poisson_FrameLayout.createSequentialGroup()
                        .addGroup(poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(alphaPoisson_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestrasPoisson_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alphaPoisson_TextField)
                            .addComponent(muestrasPoisson_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        poisson_FrameLayout.setVerticalGroup(
            poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(poisson_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alphaPoisson_Label)
                    .addComponent(alphaPoisson_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(poisson_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasPoisson_Label)
                    .addComponent(muestrasPoisson_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(poissonHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        discreta_Frame.setMinimumSize(new java.awt.Dimension(300, 160));
        discreta_Frame.setResizable(false);

        intervalosDiscreta_Label.setText("Intervalos:");

        intervalosDiscreta_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalosDiscreta_TextFieldActionPerformed(evt);
            }
        });

        muestrasDiscreta_Label.setText("Muestras:");

        discreta_Button.setText("Insertar Datos");
        discreta_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discreta_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout discreta_FrameLayout = new javax.swing.GroupLayout(discreta_Frame.getContentPane());
        discreta_Frame.getContentPane().setLayout(discreta_FrameLayout);
        discreta_FrameLayout.setHorizontalGroup(
            discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discreta_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discreta_FrameLayout.createSequentialGroup()
                        .addComponent(discreta_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(discreta_FrameLayout.createSequentialGroup()
                        .addGroup(discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(muestrasDiscreta_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(intervalosDiscreta_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intervalosDiscreta_TextField)
                            .addComponent(muestrasDiscreta_TextField))
                        .addGap(10, 10, 10))))
        );
        discreta_FrameLayout.setVerticalGroup(
            discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discreta_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intervalosDiscreta_Label)
                    .addComponent(intervalosDiscreta_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(discreta_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasDiscreta_Label)
                    .addComponent(muestrasDiscreta_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(discreta_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        empirica_Frame.setMinimumSize(new java.awt.Dimension(300, 160));
        empirica_Frame.setResizable(false);

        empirica_Button.setText("Insertar Datos");
        empirica_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empirica_ButtonActionPerformed(evt);
            }
        });

        intervalosEmpirica_Label.setText("Intervalos:");

        intervalosEmpirica_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalosEmpirica_TextFieldActionPerformed(evt);
            }
        });

        muestrasEmpirica_Label.setText("Muestras:");

        javax.swing.GroupLayout empirica_FrameLayout = new javax.swing.GroupLayout(empirica_Frame.getContentPane());
        empirica_Frame.getContentPane().setLayout(empirica_FrameLayout);
        empirica_FrameLayout.setHorizontalGroup(
            empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empirica_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empirica_FrameLayout.createSequentialGroup()
                        .addComponent(empirica_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(empirica_FrameLayout.createSequentialGroup()
                        .addGroup(empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(muestrasEmpirica_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(intervalosEmpirica_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intervalosEmpirica_TextField)
                            .addComponent(muestrasEmpirica_TextField))
                        .addGap(10, 10, 10))))
        );
        empirica_FrameLayout.setVerticalGroup(
            empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empirica_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intervalosEmpirica_Label)
                    .addComponent(intervalosEmpirica_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(empirica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasEmpirica_Label)
                    .addComponent(muestrasEmpirica_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empirica_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exponencial_Frame.setMinimumSize(new java.awt.Dimension(300, 160));

        mediaExponencial_Label.setText("Media:");

        muestrasExponencial_Label.setText("Muestras:");

        exponencialHistograma_Button.setText("Generar Histograma");
        exponencialHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponencialHistograma_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exponencial_FrameLayout = new javax.swing.GroupLayout(exponencial_Frame.getContentPane());
        exponencial_Frame.getContentPane().setLayout(exponencial_FrameLayout);
        exponencial_FrameLayout.setHorizontalGroup(
            exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exponencial_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exponencialHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(exponencial_FrameLayout.createSequentialGroup()
                        .addGroup(exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mediaExponencial_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestrasExponencial_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mediaExponencial_TextField)
                            .addComponent(muestrasExponencial_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        exponencial_FrameLayout.setVerticalGroup(
            exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exponencial_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaExponencial_Label)
                    .addComponent(mediaExponencial_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(exponencial_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasExponencial_Label)
                    .addComponent(muestrasExponencial_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exponencialHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        geometrica_Frame.setMinimumSize(new java.awt.Dimension(300, 160));

        probabilidadGeometrica_Label.setText("Probabilidad:");

        muestrasGeometrica_Label.setText("Muestras:");

        geometricaHistograma_Button.setText("Generar Histograma");
        geometricaHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geometricaHistograma_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout geometrica_FrameLayout = new javax.swing.GroupLayout(geometrica_Frame.getContentPane());
        geometrica_Frame.getContentPane().setLayout(geometrica_FrameLayout);
        geometrica_FrameLayout.setHorizontalGroup(
            geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geometrica_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geometricaHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(geometrica_FrameLayout.createSequentialGroup()
                        .addGroup(geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(probabilidadGeometrica_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestrasGeometrica_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(probabilidadGeometrica_TextField)
                            .addComponent(muestrasGeometrica_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        geometrica_FrameLayout.setVerticalGroup(
            geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geometrica_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(probabilidadGeometrica_Label)
                    .addComponent(probabilidadGeometrica_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geometrica_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasGeometrica_Label)
                    .addComponent(muestrasGeometrica_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(geometricaHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        triangularInicioFin_Frame.setMinimumSize(new java.awt.Dimension(300, 190));

        inicioTriangularSimple_Label.setText("Inicio:");

        finTriangularSimple_Label.setText("Fin:");

        finTriangularSimple_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finTriangularSimple_TextFieldActionPerformed(evt);
            }
        });

        triangularSimpleHistograma_Button.setText("Generar Histograma");
        triangularSimpleHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangularSimpleHistograma_ButtonActionPerformed(evt);
            }
        });

        muestrasTriangularSimple_Label.setText("Muestras:");

        javax.swing.GroupLayout triangularInicioFin_FrameLayout = new javax.swing.GroupLayout(triangularInicioFin_Frame.getContentPane());
        triangularInicioFin_Frame.getContentPane().setLayout(triangularInicioFin_FrameLayout);
        triangularInicioFin_FrameLayout.setHorizontalGroup(
            triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triangularInicioFin_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(triangularSimpleHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(triangularInicioFin_FrameLayout.createSequentialGroup()
                        .addGroup(triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(muestrasTriangularSimple_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finTriangularSimple_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicioTriangularSimple_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inicioTriangularSimple_TextField)
                            .addComponent(finTriangularSimple_TextField)
                            .addComponent(muestrasTriangularSimple_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        triangularInicioFin_FrameLayout.setVerticalGroup(
            triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triangularInicioFin_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioTriangularSimple_Label)
                    .addComponent(inicioTriangularSimple_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finTriangularSimple_Label)
                    .addComponent(finTriangularSimple_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(triangularInicioFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasTriangularSimple_Label)
                    .addComponent(muestrasTriangularSimple_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(triangularSimpleHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        triangularInicioAlturaFin_Frame.setMinimumSize(new java.awt.Dimension(300, 225));

        inicioTriangular_Label.setText("Inicio:");

        muestrasTriangular_Label.setText("Muestras:");

        triangularHistograma_Button.setText("Generar Histograma");
        triangularHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangularHistograma_ButtonActionPerformed(evt);
            }
        });

        finTriangular_Label.setText("Fin:");

        alturaTriangular_Label.setText("Altura:");

        javax.swing.GroupLayout triangularInicioAlturaFin_FrameLayout = new javax.swing.GroupLayout(triangularInicioAlturaFin_Frame.getContentPane());
        triangularInicioAlturaFin_Frame.getContentPane().setLayout(triangularInicioAlturaFin_FrameLayout);
        triangularInicioAlturaFin_FrameLayout.setHorizontalGroup(
            triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triangularInicioAlturaFin_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(triangularHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addGroup(triangularInicioAlturaFin_FrameLayout.createSequentialGroup()
                        .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(alturaTriangular_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestrasTriangular_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finTriangular_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicioTriangular_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inicioTriangular_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(finTriangular_TextField)
                            .addComponent(muestrasTriangular_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(alturaTriangular_TextField))))
                .addContainerGap())
        );
        triangularInicioAlturaFin_FrameLayout.setVerticalGroup(
            triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(triangularInicioAlturaFin_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioTriangular_Label)
                    .addComponent(inicioTriangular_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaTriangular_Label)
                    .addComponent(alturaTriangular_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finTriangular_Label)
                    .addComponent(finTriangular_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(triangularInicioAlturaFin_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasTriangular_Label)
                    .addComponent(muestrasTriangular_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(triangularHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        uniforme_Frame.setMinimumSize(new java.awt.Dimension(300, 190));

        inicioUniforme_Label.setText("Inicio:");

        muestrasUniforme_Label.setText("Muestras:");

        uniformeHistograma_Button.setText("Generar Histograma");
        uniformeHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniformeHistograma_ButtonActionPerformed(evt);
            }
        });

        finUniforme_Label.setText("Fin:");

        muestrasUniforme_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestrasUniforme_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uniforme_FrameLayout = new javax.swing.GroupLayout(uniforme_Frame.getContentPane());
        uniforme_Frame.getContentPane().setLayout(uniforme_FrameLayout);
        uniforme_FrameLayout.setHorizontalGroup(
            uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uniforme_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uniformeHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(uniforme_FrameLayout.createSequentialGroup()
                        .addGroup(uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(muestrasUniforme_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finUniforme_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicioUniforme_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inicioUniforme_TextField)
                            .addComponent(finUniforme_TextField)
                            .addComponent(muestrasUniforme_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap())
        );
        uniforme_FrameLayout.setVerticalGroup(
            uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uniforme_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioUniforme_Label)
                    .addComponent(inicioUniforme_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finUniforme_Label)
                    .addComponent(finUniforme_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uniforme_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestrasUniforme_Label)
                    .addComponent(muestrasUniforme_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uniformeHistograma_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rellenarTablaDiscreta.setMinimumSize(new java.awt.Dimension(400, 400));
        rellenarTablaDiscreta.setResizable(false);

        tablaDiscreta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion (Entero)", "Frecuencia (Flotante)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDiscreta);

        discretaHistograma_Button.setText("Generar Histograma");
        discretaHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discretaHistograma_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rellenarTablaDiscretaLayout = new javax.swing.GroupLayout(rellenarTablaDiscreta.getContentPane());
        rellenarTablaDiscreta.getContentPane().setLayout(rellenarTablaDiscretaLayout);
        rellenarTablaDiscretaLayout.setHorizontalGroup(
            rellenarTablaDiscretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rellenarTablaDiscretaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rellenarTablaDiscretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(discretaHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rellenarTablaDiscretaLayout.setVerticalGroup(
            rellenarTablaDiscretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rellenarTablaDiscretaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discretaHistograma_Button)
                .addContainerGap())
        );

        rellenarTablaEmpirica.setMinimumSize(new java.awt.Dimension(400, 400));
        rellenarTablaEmpirica.setResizable(false);

        tablaEmpirica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Intervalo Menor (Flotante)", "Intervalo Mayor (Flotante)", "Cantidad (Flotante)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaEmpirica);

        empiricaHistograma_Button.setText("Generar Histograma");
        empiricaHistograma_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empiricaHistograma_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rellenarTablaEmpiricaLayout = new javax.swing.GroupLayout(rellenarTablaEmpirica.getContentPane());
        rellenarTablaEmpirica.getContentPane().setLayout(rellenarTablaEmpiricaLayout);
        rellenarTablaEmpiricaLayout.setHorizontalGroup(
            rellenarTablaEmpiricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rellenarTablaEmpiricaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rellenarTablaEmpiricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(empiricaHistograma_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rellenarTablaEmpiricaLayout.setVerticalGroup(
            rellenarTablaEmpiricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rellenarTablaEmpiricaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empiricaHistograma_Button)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Variables Aleatorias");

        erlangKEtapasMedia_JButton.setText("Erlang_K (Con etapas y media)");
        erlangKEtapasMedia_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erlangKEtapasMedia_JButtonActionPerformed(evt);
            }
        });

        erlangKLambda_JButton.setText("Erlang_K (Con lambda)");
        erlangKLambda_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erlangKLambda_JButtonActionPerformed(evt);
            }
        });

        gammaMediaDesTipica_JButton.setText("Gamma (Con media y desviación típica)");
        gammaMediaDesTipica_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gammaMediaDesTipica_JButtonActionPerformed(evt);
            }
        });

        gammaBetaTeta_JButton.setText("Gamma (Con beta y teta)");
        gammaBetaTeta_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gammaBetaTeta_JButtonActionPerformed(evt);
            }
        });

        normalGauss_JButton.setText("Normal (Gauss)");
        normalGauss_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalGauss_JButtonActionPerformed(evt);
            }
        });

        normalSchemeiser_JButton.setText("Normal (Schemeiser)");
        normalSchemeiser_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalSchemeiser_JButtonActionPerformed(evt);
            }
        });

        poisson_JButton.setText("Poisson");
        poisson_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poisson_JButtonActionPerformed(evt);
            }
        });

        discreta_JButton.setText("Discreta");
        discreta_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discreta_JButtonActionPerformed(evt);
            }
        });

        empirica_JButton.setText("Empírica");
        empirica_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empirica_JButtonActionPerformed(evt);
            }
        });

        exponencial_JButton.setText("Exponencial");
        exponencial_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponencial_JButtonActionPerformed(evt);
            }
        });

        geometrica_JButton.setText("Geométrica");
        geometrica_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geometrica_JButtonActionPerformed(evt);
            }
        });

        triangularInicioFin_JButton.setText("Triangular (Con inicio y fin del intervalo)");
        triangularInicioFin_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangularInicioFin_JButtonActionPerformed(evt);
            }
        });

        triangularInicioAlturaFin_JButton.setText("Triangular (Con inicio, altura y fin del intervalo)");
        triangularInicioAlturaFin_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangularInicioAlturaFin_JButtonActionPerformed(evt);
            }
        });

        uniforme_JButton.setText("Uniforme");
        uniforme_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniforme_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(triangularInicioAlturaFin_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uniforme_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(triangularInicioFin_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(geometrica_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exponencial_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empirica_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discreta_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poisson_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(normalSchemeiser_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(normalGauss_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gammaBetaTeta_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gammaMediaDesTipica_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(erlangKLambda_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(erlangKEtapasMedia_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(erlangKEtapasMedia_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erlangKLambda_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gammaMediaDesTipica_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gammaBetaTeta_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalGauss_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalSchemeiser_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poisson_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discreta_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empirica_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exponencial_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geometrica_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(triangularInicioFin_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(triangularInicioAlturaFin_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uniforme_JButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void erlangKEtapasMedia_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erlangKEtapasMedia_JButtonActionPerformed
        erlangKEtapasMedia_Frame.setVisible(true);
    }//GEN-LAST:event_erlangKEtapasMedia_JButtonActionPerformed

    private void erlangKLambda_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erlangKLambda_JButtonActionPerformed
        erlangKLambda_Frame.setVisible(true);
    }//GEN-LAST:event_erlangKLambda_JButtonActionPerformed

    private void gammaMediaDesTipica_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gammaMediaDesTipica_JButtonActionPerformed
        gammaMediaDesTipica_Frame.setVisible(true);
    }//GEN-LAST:event_gammaMediaDesTipica_JButtonActionPerformed

    private void gammaBetaTeta_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gammaBetaTeta_JButtonActionPerformed
        gammaBetaTeta_Frame.setVisible(true);
    }//GEN-LAST:event_gammaBetaTeta_JButtonActionPerformed

    private void normalGauss_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalGauss_JButtonActionPerformed
        normalGauss_Frame.setVisible(true);
    }//GEN-LAST:event_normalGauss_JButtonActionPerformed

    private void normalSchemeiser_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalSchemeiser_JButtonActionPerformed
        normalSchemeiser_Frame.setVisible(true);
    }//GEN-LAST:event_normalSchemeiser_JButtonActionPerformed

    private void poisson_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poisson_JButtonActionPerformed
        poisson_Frame.setVisible(true);
    }//GEN-LAST:event_poisson_JButtonActionPerformed

    private void discreta_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discreta_JButtonActionPerformed
        discreta_Frame.setVisible(true);
    }//GEN-LAST:event_discreta_JButtonActionPerformed

    private void empirica_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empirica_JButtonActionPerformed
        empirica_Frame.setVisible(true);
    }//GEN-LAST:event_empirica_JButtonActionPerformed

    private void exponencial_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponencial_JButtonActionPerformed
        exponencial_Frame.setVisible(true);
    }//GEN-LAST:event_exponencial_JButtonActionPerformed

    private void geometrica_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geometrica_JButtonActionPerformed
        geometrica_Frame.setVisible(true);
    }//GEN-LAST:event_geometrica_JButtonActionPerformed

    private void triangularInicioFin_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangularInicioFin_JButtonActionPerformed
        triangularInicioFin_Frame.setVisible(true);
    }//GEN-LAST:event_triangularInicioFin_JButtonActionPerformed

    private void triangularInicioAlturaFin_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangularInicioAlturaFin_JButtonActionPerformed
        triangularInicioAlturaFin_Frame.setVisible(true);
    }//GEN-LAST:event_triangularInicioAlturaFin_JButtonActionPerformed

    private void uniforme_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniforme_JButtonActionPerformed
        uniforme_Frame.setVisible(true);
    }//GEN-LAST:event_uniforme_JButtonActionPerformed

    private void etapas_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etapas_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etapas_TextFieldActionPerformed

    private void muestrasErlang_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muestrasErlang_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muestrasErlang_TextFieldActionPerformed

    private void finTriangularSimple_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finTriangularSimple_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finTriangularSimple_TextFieldActionPerformed

    private void muestrasUniforme_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muestrasUniforme_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muestrasUniforme_TextFieldActionPerformed

    private void intervalosDiscreta_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalosDiscreta_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intervalosDiscreta_TextFieldActionPerformed

    private void intervalosEmpirica_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalosEmpirica_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intervalosEmpirica_TextFieldActionPerformed

    private void discretaHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discretaHistograma_ButtonActionPerformed
        int intervalos = Integer.parseInt(intervalosDiscreta_TextField.getText());
        int muestras = Integer.parseInt(muestrasDiscreta_TextField.getText());
        TransformadaInversaDiscreta discreta = new TransformadaInversaDiscreta(muestras, intervalos);
        double[][] datos = new double[intervalos][3];
        System.out.println("Columnas: " + tablaDiscreta.getColumnCount());
        System.out.println("Filas: " + tablaDiscreta.getRowCount());
        System.out.println(tablaDiscreta.getValueAt(2, 1));
        for (int i = 0; i < intervalos; i++) { //filas
            for (int j = 0; j < 2; j++) { //columnas
                if (j == 0) {
                    datos[i][j] = (int) tablaDiscreta.getValueAt(i, j);
                } else {
                    datos[i][j] = (double) tablaDiscreta.getValueAt(i, j);
                }
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
        discreta.setDatosDistribucion(datos);
        Histograma histogramaDiscreta = new Histograma("Discreta", discreta.calcularDiscreta(), intervalos);
        histogramaDiscreta.execute();
    }//GEN-LAST:event_discretaHistograma_ButtonActionPerformed

    private void discreta_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discreta_ButtonActionPerformed
        int intervalos = Integer.parseInt(intervalosDiscreta_TextField.getText());
        DefaultTableModel model = (DefaultTableModel) tablaDiscreta.getModel();
        model.setNumRows(intervalos);
        tablaDiscreta = new JTable(model);
        rellenarTablaDiscreta.setVisible(true);
    }//GEN-LAST:event_discreta_ButtonActionPerformed

    private void empirica_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empirica_ButtonActionPerformed
        int intervalos = Integer.parseInt(intervalosEmpirica_TextField.getText());
        DefaultTableModel model = (DefaultTableModel) tablaEmpirica.getModel();
        model.setNumRows(intervalos);
        tablaEmpirica = new JTable(model);
        rellenarTablaEmpirica.setVisible(true);
    }//GEN-LAST:event_empirica_ButtonActionPerformed

    private void erlangKHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erlangKHistograma_ButtonActionPerformed
        int etapas = Integer.parseInt(etapas_TextField.getText());
        double media = Double.parseDouble(media_TextField.getText());
        int muestras = Integer.parseInt(muestrasErlang_TextField.getText());
        Erlang_K erlang = new Erlang_K(etapas, media, muestras);
        Histograma histogramaErlang = new Histograma("Erlang K", erlang.calcularDistribucionErlangK());
        histogramaErlang.execute();
    }//GEN-LAST:event_erlangKHistograma_ButtonActionPerformed

    private void erlangLambdaHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erlangLambdaHistograma_ButtonActionPerformed
        double lambda = Double.parseDouble(lambdaErlang_TextField.getText());
        int muestras = Integer.parseInt(muestrasErlangLambda_TextField.getText());
        int etapas = Integer.parseInt(etapasErlangLambda_TextField.getText());
        Erlang_K erlang = new Erlang_K(lambda, muestras, etapas);
        Histograma histogramaErlangLambda = new Histograma("Erlang Lambda", erlang.calcularDistribucionErlangK());
        histogramaErlangLambda.execute();
    }//GEN-LAST:event_erlangLambdaHistograma_ButtonActionPerformed

    private void gammaMediaHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gammaMediaHistograma_ButtonActionPerformed
        double media = Double.parseDouble(mediaGamma_TextField.getText());
        double desviacionTipica = Double.parseDouble(desTipicaGamma_TextField.getText());
        int muestras = Integer.parseInt(muestrasMediaGamma_TextField.getText());
        Gamma gamma = new Gamma(media, desviacionTipica, muestras);
        Histograma histogramaGammaMedia = new Histograma("Gamma", gamma.calcularGamma());
        histogramaGammaMedia.execute();
    }//GEN-LAST:event_gammaMediaHistograma_ButtonActionPerformed

    private void gammaBetaHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gammaBetaHistograma_ButtonActionPerformed
        double beta = Double.parseDouble(betaGamma_TextField.getText());
        double tetta = Double.parseDouble(tettaGamma_TextField.getText());
        int muestras = Integer.parseInt(muestrasBetaGamma_TextField.getText());
        Gamma gamma = new Gamma(muestras, beta, tetta);
        Histograma histogramaGammaMedia = new Histograma("Gamma", gamma.calcularGamma());
        histogramaGammaMedia.execute();
    }//GEN-LAST:event_gammaBetaHistograma_ButtonActionPerformed

    private void gaussHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaussHistograma_ButtonActionPerformed
        int muestras = Integer.parseInt(muestrasGauss_TextField.getText());
        Normal gauss = new Normal(muestras);
        Histograma histogramaGauss = new Histograma("Normal-Gauss", gauss.calcularNormal_Gauss());
        histogramaGauss.execute();
    }//GEN-LAST:event_gaussHistograma_ButtonActionPerformed

    private void schemeiserHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schemeiserHistograma_ButtonActionPerformed
        int muestras = Integer.parseInt(muestrasSchemeiser_TextField.getText());
        Normal schemeiser = new Normal(muestras);
        Histograma histogramaSchemeiser = new Histograma("Normal-Schemeiser", schemeiser.calcularNormal_Schemeiser());
        histogramaSchemeiser.execute();
    }//GEN-LAST:event_schemeiserHistograma_ButtonActionPerformed

    private void poissonHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poissonHistograma_ButtonActionPerformed
        double alpha = Double.parseDouble(alphaPoisson_TextField.getText());
        int muestras = Integer.parseInt(muestrasPoisson_TextField.getText());
        PoissonModificada poisson = new PoissonModificada(alpha, muestras);
        Histograma histogramaPoisson = new Histograma("Poisson", poisson.calcularPoisson());
        histogramaPoisson.execute();
    }//GEN-LAST:event_poissonHistograma_ButtonActionPerformed

    private void exponencialHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponencialHistograma_ButtonActionPerformed
        double media = Double.parseDouble(mediaExponencial_TextField.getText());
        int muestras = Integer.parseInt(muestrasExponencial_TextField.getText());
        TransformadaInversaExponencial exponencial = new TransformadaInversaExponencial(muestras, media);
        Histograma histogramaExponencial = new Histograma("Exponencial", exponencial.calcularDistribuciónExponencial());
        histogramaExponencial.execute();
    }//GEN-LAST:event_exponencialHistograma_ButtonActionPerformed

    private void geometricaHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geometricaHistograma_ButtonActionPerformed
        double probabilidad = Double.parseDouble(probabilidadGeometrica_TextField.getText());
        int muestras = Integer.parseInt(muestrasGeometrica_TextField.getText());
        TransformadaInversaGeometrica geometrica = new TransformadaInversaGeometrica(probabilidad, muestras);
        Histograma histogramaGeometrica = new Histograma("Geométrica", geometrica.calcularDistribucionGeometrica());
        histogramaGeometrica.execute();
    }//GEN-LAST:event_geometricaHistograma_ButtonActionPerformed

    private void triangularSimpleHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangularSimpleHistograma_ButtonActionPerformed
        double inicio = Double.parseDouble(inicioTriangularSimple_TextField.getText());
        double fin = Double.parseDouble(finTriangularSimple_TextField.getText());
        int muestras = Integer.parseInt(muestrasTriangularSimple_TextField.getText());
        TransformadaInversaTriangular triangularSimple = new TransformadaInversaTriangular(inicio, fin, muestras);
        Histograma histogramaTriangularSimple = new Histograma("Triangular Simple", triangularSimple.calcularDistribuciónTriangular());
        histogramaTriangularSimple.execute();
    }//GEN-LAST:event_triangularSimpleHistograma_ButtonActionPerformed

    private void triangularHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangularHistograma_ButtonActionPerformed
        double inicio = Double.parseDouble(inicioTriangular_TextField.getText());
        double centro = Double.parseDouble(alturaTriangular_TextField.getText());
        double fin = Double.parseDouble(finTriangular_TextField.getText());
        int muestras = Integer.parseInt(muestrasTriangular_TextField.getText());
        TransformadaInversaTriangular triangular = new TransformadaInversaTriangular(inicio, centro, fin, muestras);
        Histograma histogramaTriangular = new Histograma("Triangular", triangular.calcularDistribuciónTriangular());
        histogramaTriangular.execute();
    }//GEN-LAST:event_triangularHistograma_ButtonActionPerformed

    private void uniformeHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniformeHistograma_ButtonActionPerformed
        double inicio = Double.parseDouble(inicioUniforme_TextField.getText());
        double fin = Double.parseDouble(finUniforme_TextField.getText());
        int muestras = Integer.parseInt(muestrasUniforme_TextField.getText());
        TransformadaInversaUniforme uniforme = new TransformadaInversaUniforme(inicio, fin, muestras);
        Histograma histogramaUniforme = new Histograma("Uniforme", uniforme.calcularDistribucionUniforme());
        histogramaUniforme.execute();
    }//GEN-LAST:event_uniformeHistograma_ButtonActionPerformed

    private void empiricaHistograma_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empiricaHistograma_ButtonActionPerformed
        int intervalos = Integer.parseInt(intervalosEmpirica_TextField.getText());
        int muestras = Integer.parseInt(muestrasEmpirica_TextField.getText());
        TransformadaInversaEmpirica empirica = new TransformadaInversaEmpirica(muestras, intervalos);
        double[][] datos = new double[intervalos][5];
        System.out.println("Columnas: " + tablaEmpirica.getColumnCount());
        System.out.println("Filas: " + tablaEmpirica.getRowCount());
        for (int i = 0; i < intervalos; i++) { //filas
            for (int j = 0; j < 3; j++) { //columnas
                datos[i][j] = (double) tablaEmpirica.getValueAt(i, j);
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
        empirica.setDatosDistribucion(datos);
        //Histograma histogramaEmpirica = new Histograma("Empírica", empirica.calcularDistribucionEmpirica(), intervalos);
        empirica.calcularDistribucionEmpirica();
        Histograma histogramaEmpirica = new Histograma("Empírica", empirica.getCantidadIntervalos(), intervalos, empirica.getDatosDistribucion());
        histogramaEmpirica.execute();
    }//GEN-LAST:event_empiricaHistograma_ButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alphaPoisson_Label;
    private javax.swing.JTextField alphaPoisson_TextField;
    private javax.swing.JLabel alturaTriangular_Label;
    private javax.swing.JTextField alturaTriangular_TextField;
    private javax.swing.JLabel betaGamma_Label;
    private javax.swing.JTextField betaGamma_TextField;
    private javax.swing.JLabel desTipicaGamma_Label;
    private javax.swing.JTextField desTipicaGamma_TextField;
    private javax.swing.JButton discretaHistograma_Button;
    private javax.swing.JButton discreta_Button;
    private javax.swing.JFrame discreta_Frame;
    private javax.swing.JButton discreta_JButton;
    private javax.swing.JButton empiricaHistograma_Button;
    private javax.swing.JButton empirica_Button;
    private javax.swing.JFrame empirica_Frame;
    private javax.swing.JButton empirica_JButton;
    private javax.swing.JFrame erlangKEtapasMedia_Frame;
    private javax.swing.JButton erlangKEtapasMedia_JButton;
    private javax.swing.JButton erlangKHistograma_Button;
    private javax.swing.JFrame erlangKLambda_Frame;
    private javax.swing.JButton erlangKLambda_JButton;
    private javax.swing.JButton erlangLambdaHistograma_Button;
    private javax.swing.JTextField etapasErlangLambda_TextField;
    private javax.swing.JLabel etapas_Label;
    private javax.swing.JTextField etapas_TextField;
    private javax.swing.JButton exponencialHistograma_Button;
    private javax.swing.JFrame exponencial_Frame;
    private javax.swing.JButton exponencial_JButton;
    private javax.swing.JLabel finTriangularSimple_Label;
    private javax.swing.JTextField finTriangularSimple_TextField;
    private javax.swing.JLabel finTriangular_Label;
    private javax.swing.JTextField finTriangular_TextField;
    private javax.swing.JLabel finUniforme_Label;
    private javax.swing.JTextField finUniforme_TextField;
    private javax.swing.JButton gammaBetaHistograma_Button;
    private javax.swing.JFrame gammaBetaTeta_Frame;
    private javax.swing.JButton gammaBetaTeta_JButton;
    private javax.swing.JFrame gammaMediaDesTipica_Frame;
    private javax.swing.JButton gammaMediaDesTipica_JButton;
    private javax.swing.JButton gammaMediaHistograma_Button;
    private javax.swing.JButton gaussHistograma_Button;
    private javax.swing.JButton geometricaHistograma_Button;
    private javax.swing.JFrame geometrica_Frame;
    private javax.swing.JButton geometrica_JButton;
    private javax.swing.JLabel inicioTriangularSimple_Label;
    private javax.swing.JTextField inicioTriangularSimple_TextField;
    private javax.swing.JLabel inicioTriangular_Label;
    private javax.swing.JTextField inicioTriangular_TextField;
    private javax.swing.JLabel inicioUniforme_Label;
    private javax.swing.JTextField inicioUniforme_TextField;
    private javax.swing.JLabel intervalosDiscreta_Label;
    private javax.swing.JTextField intervalosDiscreta_TextField;
    private javax.swing.JLabel intervalosEmpirica_Label;
    private javax.swing.JTextField intervalosEmpirica_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lambdaErlang_Label;
    private javax.swing.JTextField lambdaErlang_TextField;
    private javax.swing.JLabel mediaExponencial_Label;
    private javax.swing.JTextField mediaExponencial_TextField;
    private javax.swing.JLabel mediaGamma_Label;
    private javax.swing.JTextField mediaGamma_TextField;
    private javax.swing.JLabel media_Label;
    private javax.swing.JTextField media_TextField;
    private javax.swing.JLabel muestrasBetaGamma_Label;
    private javax.swing.JTextField muestrasBetaGamma_TextField;
    private javax.swing.JLabel muestrasDiscreta_Label;
    private javax.swing.JTextField muestrasDiscreta_TextField;
    private javax.swing.JLabel muestrasEmpirica_Label;
    private javax.swing.JTextField muestrasEmpirica_TextField;
    private javax.swing.JLabel muestrasErlangLambda_Label;
    private javax.swing.JTextField muestrasErlangLambda_TextField;
    private javax.swing.JLabel muestrasErlang_Label;
    private javax.swing.JTextField muestrasErlang_TextField;
    private javax.swing.JLabel muestrasExponencial_Label;
    private javax.swing.JTextField muestrasExponencial_TextField;
    private javax.swing.JLabel muestrasGauss_Label;
    private javax.swing.JTextField muestrasGauss_TextField;
    private javax.swing.JLabel muestrasGeometrica_Label;
    private javax.swing.JTextField muestrasGeometrica_TextField;
    private javax.swing.JLabel muestrasMediaGamma_Label;
    private javax.swing.JTextField muestrasMediaGamma_TextField;
    private javax.swing.JLabel muestrasPoisson_Label;
    private javax.swing.JTextField muestrasPoisson_TextField;
    private javax.swing.JLabel muestrasSchemeiser_Label;
    private javax.swing.JTextField muestrasSchemeiser_TextField;
    private javax.swing.JLabel muestrasTriangularSimple_Label;
    private javax.swing.JTextField muestrasTriangularSimple_TextField;
    private javax.swing.JLabel muestrasTriangular_Label;
    private javax.swing.JTextField muestrasTriangular_TextField;
    private javax.swing.JLabel muestrasUniforme_Label;
    private javax.swing.JTextField muestrasUniforme_TextField;
    private javax.swing.JFrame normalGauss_Frame;
    private javax.swing.JButton normalGauss_JButton;
    private javax.swing.JFrame normalSchemeiser_Frame;
    private javax.swing.JButton normalSchemeiser_JButton;
    private javax.swing.JButton poissonHistograma_Button;
    private javax.swing.JFrame poisson_Frame;
    private javax.swing.JButton poisson_JButton;
    private javax.swing.JLabel probabilidadGeometrica_Label;
    private javax.swing.JTextField probabilidadGeometrica_TextField;
    private javax.swing.JFrame rellenarTablaDiscreta;
    private javax.swing.JFrame rellenarTablaEmpirica;
    private javax.swing.JButton schemeiserHistograma_Button;
    private javax.swing.JTable tablaDiscreta;
    private javax.swing.JTable tablaEmpirica;
    private javax.swing.JLabel tettaGamma_Label;
    private javax.swing.JTextField tettaGamma_TextField;
    private javax.swing.JButton triangularHistograma_Button;
    private javax.swing.JFrame triangularInicioAlturaFin_Frame;
    private javax.swing.JButton triangularInicioAlturaFin_JButton;
    private javax.swing.JFrame triangularInicioFin_Frame;
    private javax.swing.JButton triangularInicioFin_JButton;
    private javax.swing.JButton triangularSimpleHistograma_Button;
    private javax.swing.JButton uniformeHistograma_Button;
    private javax.swing.JFrame uniforme_Frame;
    private javax.swing.JButton uniforme_JButton;
    // End of variables declaration//GEN-END:variables
}
