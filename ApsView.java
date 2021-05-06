package aps.view;

import aps.modelo.ModeloTabelas;
import com.google.common.io.Files;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.internal.NonNull;
import com.google.gson.Gson;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

public class ApsView extends javax.swing.JFrame {

    private String colunas[ ] = {"Fauna/Flora", "Grupo", "Família", "Espécie (Simplificada)", "Nome Comum", "Categoria", "Sigla Categoria", "Bioma", "Principais Ameaças", "Presença em Áreas Protegidas", "Plano de Ação Nacional para Conservação (PAN)", "Ordenamento Pesqueiro", "Nível de Proteção na Estratégia Nacional", "Espécie exclusiva do Brasil", "Estados de Ocorrência"};
    private ArrayList<ModeloTabelas> lista = new ArrayList<ModeloTabelas>( );
    private ArrayList<ModeloTabelas> listaConsulta = new ArrayList<ModeloTabelas>( );
    private ApsTabelasModelo tabela;
    private DatabaseReference apsFirebase = FirebaseDatabase.getInstance( ).getReference( ).child("especies");

    public ApsView() {
        initComponents();

        this.setPreferredSize(new Dimension(850, 650));
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel_Titulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_Botoes = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        btnSincronizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jTP_FiltroConsulta = new javax.swing.JTabbedPane();
        painelConsulta = new javax.swing.JPanel();
        jPanel_Filtro = new javax.swing.JPanel();
        lblCons_FaunaFlora = new javax.swing.JLabel();
        edtCons_Grupo = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCons_Especie = new javax.swing.JLabel();
        edtCons_Especie = new javax.swing.JTextField();
        lblCons_Familia = new javax.swing.JLabel();
        edtCons_Familia = new javax.swing.JTextField();
        lblCons_Grupo = new javax.swing.JLabel();
        lblCons_Bioma = new javax.swing.JLabel();
        edtCons_PrincAmeacas = new javax.swing.JTextField();
        lblCons_CatAmeaca = new javax.swing.JLabel();
        edtCons_Bioma = new javax.swing.JTextField();
        edtCons_CatAmeaca = new javax.swing.JTextField();
        lblCons_PrincAmeacas = new javax.swing.JLabel();
        edtCons_EstadoOcorr = new javax.swing.JTextField();
        lblCons_NomeComum = new javax.swing.JLabel();
        edtCons_NomeComum = new javax.swing.JTextField();
        lblCon_EstadoOcorr = new javax.swing.JLabel();
        cBox_FaunaFlora = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel_Titulo.setToolTipText("");

        jLabel_Titulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Titulo.setText("INTEGRAÇÃO JAVA COM GOOGLE FIREBASE");

        jPanel_Botoes.setAutoscrolls(true);
        jPanel_Botoes.setPreferredSize(new java.awt.Dimension(853, 51));

        btnConectar.setBackground(new java.awt.Color(255, 255, 255));
        btnConectar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnConectar.setForeground(new java.awt.Color(51, 51, 51));
        btnConectar.setMnemonic('0');
        btnConectar.setText("Conectar");
        btnConectar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConectar.setFocusPainted(false);
        btnConectar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConectar.setMaximumSize(new java.awt.Dimension(128, 30));
        btnConectar.setMinimumSize(new java.awt.Dimension(128, 30));
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        btnSincronizar.setBackground(new java.awt.Color(255, 255, 255));
        btnSincronizar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnSincronizar.setForeground(new java.awt.Color(51, 51, 51));
        btnSincronizar.setMnemonic('0');
        btnSincronizar.setText("Sincronizar");
        btnSincronizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnSincronizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSincronizar.setFocusPainted(false);
        btnSincronizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSincronizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSincronizarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BotoesLayout = new javax.swing.GroupLayout(jPanel_Botoes);
        jPanel_Botoes.setLayout(jPanel_BotoesLayout);
        jPanel_BotoesLayout.setHorizontalGroup(
            jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(btnSincronizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel_BotoesLayout.setVerticalGroup(
            jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                        .addGroup(jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSincronizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_TituloLayout = new javax.swing.GroupLayout(jPanel_Titulo);
        jPanel_Titulo.setLayout(jPanel_TituloLayout);
        jPanel_TituloLayout.setHorizontalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TituloLayout.setVerticalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTP_FiltroConsulta.setToolTipText("Opções de Pesquisa ");

        jPanel_Filtro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCons_FaunaFlora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_FaunaFlora.setText("Fauna/Flora");

        edtCons_Grupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCons_Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCons_GrupoActionPerformed(evt);
            }
        });

        btnConsulta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblCons_Especie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_Especie.setText("Espécie");

        edtCons_Especie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCons_Familia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_Familia.setText("Família");

        edtCons_Familia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCons_Familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCons_FamiliaActionPerformed(evt);
            }
        });

        lblCons_Grupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_Grupo.setText("Grupo");

        lblCons_Bioma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_Bioma.setText("Bioma");

        edtCons_PrincAmeacas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCons_CatAmeaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_CatAmeaca.setText("Categoria Ameaça");

        edtCons_Bioma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtCons_CatAmeaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCons_PrincAmeacas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_PrincAmeacas.setText("Principais Ameaças");

        edtCons_EstadoOcorr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCons_NomeComum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_NomeComum.setText("Nome Comum");

        edtCons_NomeComum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCon_EstadoOcorr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCon_EstadoOcorr.setText("Estados de Ocorrência");

        cBox_FaunaFlora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBox_FaunaFlora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox_FaunaFloraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FiltroLayout = new javax.swing.GroupLayout(jPanel_Filtro);
        jPanel_Filtro.setLayout(jPanel_FiltroLayout);
        jPanel_FiltroLayout.setHorizontalGroup(
            jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addComponent(edtCons_CatAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                                .addComponent(lblCons_CatAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCons_FaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cBox_FaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCons_Grupo)
                                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                                        .addComponent(edtCons_Grupo)
                                        .addGap(17, 17, 17)))))
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtCons_Familia, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(lblCons_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtCons_PrincAmeacas))
                            .addComponent(lblCons_PrincAmeacas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                                .addComponent(lblCons_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(lblCons_Bioma, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(edtCons_NomeComum, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(edtCons_Especie)
                                    .addComponent(lblCons_NomeComum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtCons_EstadoOcorr, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtCons_Bioma, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCon_EstadoOcorr, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel_FiltroLayout.setVerticalGroup(
            jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCons_FaunaFlora)
                            .addComponent(lblCons_Grupo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edtCons_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtCons_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtCons_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtCons_Bioma, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cBox_FaunaFlora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCons_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCons_Especie)
                        .addComponent(lblCons_Bioma)))
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCons_CatAmeaca)
                            .addComponent(lblCons_PrincAmeacas)))
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCon_EstadoOcorr)
                            .addComponent(lblCons_NomeComum))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCons_CatAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCons_PrincAmeacas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCons_NomeComum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCons_EstadoOcorr, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FiltroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(20, 20, 20))
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelConsultaLayout = new javax.swing.GroupLayout(painelConsulta);
        painelConsulta.setLayout(painelConsultaLayout);
        painelConsultaLayout.setHorizontalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addGroup(painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelConsultaLayout.setVerticalGroup(
            painelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTP_FiltroConsulta.addTab("Opções de Pesquisa ", painelConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTP_FiltroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 479, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jTP_FiltroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        conectar();
    }                                           

    private void btnSincronizarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        sincronizar();
    }                                              

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       

    private void edtCons_GrupoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                            
                filtroPesquisa();
    }                                           

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {                                          
        edtCons_Grupo.setText("");
        edtCons_Familia.setText("");
        edtCons_Especie.setText("");
        edtCons_Bioma.setText("");
        edtCons_CatAmeaca.setText("");
        edtCons_PrincAmeacas.setText("");
        edtCons_NomeComum.setText("");
        edtCons_EstadoOcorr.setText("");
        
        conectar( );
    }                                         

    private void edtCons_FamiliaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void cBox_FaunaFloraActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void conectar() {

        try {
            apsFirebase.addValueEventListener(new ValueEventListener() {

                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    lista.clear( );

                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        ModeloTabelas dado = ds.getValue(ModeloTabelas.class);
                        lista.add(dado);
                    }
                    tabela = new ApsTabelasModelo(lista, colunas);
                    tblConsulta.setModel((TableModel) tabela);
                    tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                }

                @Override
                public void onCancelled(DatabaseError e) {
                    JOptionPane.showMessageDialog(null, "Operação Cancelada \n" + e.getMessage());

                }

            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Operação \n" + e.getMessage());
        }
    }

    private void sincronizar() {
        String csvArquivo = "C:\\Users\\ranie\\Documents\\lista-de-especies-ameacas-2020-separador.csv";

        BufferedReader conteudoCSV = null;

        String linha = " ";

        String csvSeparador = ";";
        
        try {
            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            while ((linha = conteudoCSV.readLine()) != null) {

                String[] x = linha.split(csvSeparador);

                ModeloTabelas teste = new ModeloTabelas();

                teste.setFaunaFlora(x[0]);
                teste.setGrupo(x[1]);
                teste.setFamilia(x[2]);
                teste.setEspecie(x[3]);
                teste.setNomeComum(x[4]);
                teste.setCategoria(x[5]);
                teste.setSiglaCategoria(x[6]);
                teste.setBioma(x[7]);
                teste.setPrincipaisAmeacas(x[8]);
                teste.setAreaProtegida(x[9]);
                teste.setPlanoAcaoConservacao(x[10]);
                teste.setOrdenamentoPesqueiro(x[11]);
                teste.setNivelProtecao(x[12]);
                teste.setEspecieExclusivaBrasil(x[13]);
                teste.setEstadoOcorrencia(x[14]);

                lista.add(teste);
            }
            
            Gson gson = new Gson(); // conversor
//            gson.f

            apsFirebase.setValue(lista, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError de, DatabaseReference dr) {
//                        lista.add(teste);
//                        gson.toJson(lista);
                        JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso no Firebase!");
                }
            });

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: \n" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" IndexOutOfBounds: \n" + e.getMessage());
        } catch (IOException e) {
            System.out.println(" IO Erro: \n" + e.getMessage());
        } finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println(" IO Erro: \n" + e.getMessage());
                }
            }
        }
    }
    

    private void filtroPesquisa() {
        listaConsulta.clear();
        String grupo = edtCons_Grupo.getText().toLowerCase().trim();
        String familia = edtCons_Familia.getText().toLowerCase().trim();
        String especie = edtCons_Especie.getText().toLowerCase().trim();
        String bioma = edtCons_Bioma.getText().toLowerCase().trim();
        String categoriaAmeaca = edtCons_CatAmeaca.getText().toLowerCase().trim();
        String principaisAmeacas = edtCons_PrincAmeacas.getText().toLowerCase().trim();
        String nomeComum = edtCons_NomeComum.getText().toLowerCase().trim();
        String estado = edtCons_EstadoOcorr.getText().toLowerCase().trim();

        String faunaFlora = (String) cBox_FaunaFlora.getSelectedItem();

        boolean testeFiltro = true;

        for (int i = 0; i < lista.size(); i++) {
            testeFiltro = true;

            if (!grupo.equals(" ")) {
                if (!lista.get(i).getGrupo().trim().toLowerCase().equals(grupo)) {
                    testeFiltro = false;
                }
            }
            if (!familia.equals(" ")) {
                if (!lista.get(i).getFamilia().trim().toLowerCase().equals(familia)) {
                    testeFiltro = false;
                }
            }
            if (!especie.equals(" ")) {
                if (!lista.get(i).getEspecie().trim().toLowerCase().equals(especie)) {
                    testeFiltro = false;
                }
            }
            if (!bioma.equals(" ")) {
                if (!lista.get(i).getBioma().trim().toLowerCase().equals(bioma)) {
                    testeFiltro = false;
                }
            }
            if (!categoriaAmeaca.equals(" ")) {
                if (!lista.get(i).getCategoria().trim().toLowerCase().equals(categoriaAmeaca)) {
                    testeFiltro = false;
                }
            }
            if (!principaisAmeacas.equals(" ")) {
                if (!lista.get(i).getPrincipaisAmeacas().trim().toLowerCase().equals(principaisAmeacas)) {
                    testeFiltro = false;
                }
            }
            if (!nomeComum.equals(" ")) {
                if (!lista.get(i).getNomeComum().trim().toLowerCase().equals(nomeComum)) {
                    testeFiltro = false;
                }
            }
            if (!estado.equals(" ")) {
                if (!lista.get(i).getEstadoOcorrencia().trim().toLowerCase().equals(estado)) {
                    testeFiltro = false;
                }
            }
            if (!faunaFlora.equals("Selecionar")) {
                if (!lista.get(i).getFaunaFlora().equals(faunaFlora)) {
                    testeFiltro = false;
                }
            }

            if (testeFiltro) {
                listaConsulta.add(lista.get(i));
            }
        }

        tabela = new ApsTabelasModelo(listaConsulta, colunas);
        tblConsulta.setModel(tabela);
        tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSincronizar;
    private javax.swing.JComboBox<String> cBox_FaunaFlora;
    private javax.swing.JTextField edtCons_Bioma;
    private javax.swing.JTextField edtCons_CatAmeaca;
    private javax.swing.JTextField edtCons_Especie;
    private javax.swing.JTextField edtCons_EstadoOcorr;
    private javax.swing.JTextField edtCons_Familia;
    private javax.swing.JTextField edtCons_Grupo;
    private javax.swing.JTextField edtCons_NomeComum;
    private javax.swing.JTextField edtCons_PrincAmeacas;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_Botoes;
    private javax.swing.JPanel jPanel_Filtro;
    private javax.swing.JPanel jPanel_Titulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTP_FiltroConsulta;
    private javax.swing.JLabel lblCon_EstadoOcorr;
    private javax.swing.JLabel lblCons_Bioma;
    private javax.swing.JLabel lblCons_CatAmeaca;
    private javax.swing.JLabel lblCons_Especie;
    private javax.swing.JLabel lblCons_Familia;
    private javax.swing.JLabel lblCons_FaunaFlora;
    private javax.swing.JLabel lblCons_Grupo;
    private javax.swing.JLabel lblCons_NomeComum;
    private javax.swing.JLabel lblCons_PrincAmeacas;
    private javax.swing.JPanel painelConsulta;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration                   
}
