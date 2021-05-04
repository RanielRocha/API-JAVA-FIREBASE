
package aps.view;

import aps.modelo.ModeloTabelas;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

public class ApsView extends javax.swing.JFrame {
    private String colunas[ ] = {"Fauna/Flora", "Grupo", "Família", "Espécie (Simplificada)", "Nome Comum", "Categoria","Sigla Categoria", "Bioma", "Principais Ameaças", "Presença em Áreas Protegidas", "Plano de Ação Nacional para Conservação (PAN)", "Ordenamento Pesqueiro", "Nível de Proteção na Estratégia Nacional", "Espécie exclusiva do Brasil", "Estados de Ocorrência"};
    // esse objeto será vinculado com a tabela
    // selecione o objeto tabela, clique em PROPRIEDADES e encontre MODEL
    // no combo "Definir Propriedades" escolha "Código Personalizado"
    // digite o objeto DefaultTableModel, neste exemplo a tabela(criado logo abaixo)
    private ArrayList<ModeloTabelas> lista = new ArrayList<ModeloTabelas>( );
    private ApsTabelasModelo tabela;
    private DatabaseReference apsFirebase = FirebaseDatabase.getInstance( ).getReference("server/saving-data/fireblog").child("users");
    
    public ApsView() {
        initComponents();
        
        this.setPreferredSize(new Dimension(850, 650));
        initComponents();
//        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);

        // adiciona evento para qdo navegar no JTable, atualizar os dados nos JTextFieldÂ´s
//        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//
//            @Override
//            public void valueChanged(ListSelectionEvent evt) {
//                if (evt.getValueIsAdjusting()) {
//                    return;
//                }
//                int selecionado = tblConsulta.getSelectedRow();
//                if (selecionado >= 0) {
//                    mostrar(lista.get(selecionado));
//                }
//            }
//        });
//        setVisible(true);
//        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Titulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_Botoes = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        btnSincronizar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel_Pesquisa = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        painelCONSULTA = new javax.swing.JPanel();
        jPanel_Filtro = new javax.swing.JPanel();
        lblCons_FaunaFlora = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCons_Especie = new javax.swing.JLabel();
        edtCons_Especie = new javax.swing.JTextField();
        lblCons_Familia = new javax.swing.JLabel();
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
        cBox_Grupo = new javax.swing.JComboBox<>();
        cBox_Familia = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1119, 677));

        jPanel_Titulo.setToolTipText("");

        jLabel_Titulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel_BotoesLayout = new javax.swing.GroupLayout(jPanel_Botoes);
        jPanel_Botoes.setLayout(jPanel_BotoesLayout);
        jPanel_BotoesLayout.setHorizontalGroup(
            jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(btnSincronizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel_BotoesLayout.setVerticalGroup(
            jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSincronizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_TituloLayout = new javax.swing.GroupLayout(jPanel_Titulo);
        jPanel_Titulo.setLayout(jPanel_TituloLayout);
        jPanel_TituloLayout.setHorizontalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TituloLayout.setVerticalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_Pesquisa.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_Pesquisa.setMaximumSize(new java.awt.Dimension(32867, 32767));

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane2.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane2.setToolTipText("Opções de Pesquisa ");

        jPanel_Filtro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCons_FaunaFlora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCons_FaunaFlora.setText("Fauna/Flora");

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
        edtCons_NomeComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCons_NomeComumActionPerformed(evt);
            }
        });

        lblCon_EstadoOcorr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCon_EstadoOcorr.setText("Estados de Ocorrência");

        cBox_FaunaFlora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fauna", "Flora" }));

        cBox_Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox_GrupoActionPerformed(evt);
            }
        });

        cBox_Familia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox_FamiliaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FiltroLayout = new javax.swing.GroupLayout(jPanel_Filtro);
        jPanel_Filtro.setLayout(jPanel_FiltroLayout);
        jPanel_FiltroLayout.setHorizontalGroup(
            jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCons_CatAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCons_FaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBox_FaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCons_Grupo)
                            .addComponent(cBox_Grupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(edtCons_CatAmeaca, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtCons_PrincAmeacas, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(lblCons_PrincAmeacas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCons_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBox_Familia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel_FiltroLayout.setVerticalGroup(
            jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCons_Especie)
                        .addComponent(lblCons_Bioma))
                    .addGroup(jPanel_FiltroLayout.createSequentialGroup()
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCons_FaunaFlora)
                            .addComponent(lblCons_Grupo)
                            .addComponent(lblCons_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCons_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCons_Bioma, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBox_FaunaFlora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBox_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBox_Familia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FiltroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(20, 20, 20))
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout painelCONSULTALayout = new javax.swing.GroupLayout(painelCONSULTA);
        painelCONSULTA.setLayout(painelCONSULTALayout);
        painelCONSULTALayout.setHorizontalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addGroup(painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCONSULTALayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCONSULTALayout.setVerticalGroup(
            painelCONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCONSULTALayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Opções de Pesquisa ", painelCONSULTA);

        javax.swing.GroupLayout jPanel_PesquisaLayout = new javax.swing.GroupLayout(jPanel_Pesquisa);
        jPanel_Pesquisa.setLayout(jPanel_PesquisaLayout);
        jPanel_PesquisaLayout.setHorizontalGroup(
            jPanel_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_PesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_PesquisaLayout.setVerticalGroup(
            jPanel_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_PesquisaLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 575, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jPanel_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        conectar( );             
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        filtroPesquisa( );
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCons_Especie.setText("");
        edtCons_Bioma.setText("");
        edtCons_CatAmeaca.setText("");
        edtCons_PrincAmeacas.setText("");
        edtCons_NomeComum.setText("");
        edtCons_EstadoOcorr.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSincronizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSincronizarActionPerformed
        sincronizar( );
    }//GEN-LAST:event_btnSincronizarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void edtCons_NomeComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCons_NomeComumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCons_NomeComumActionPerformed

    private void cBox_GrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBox_GrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBox_GrupoActionPerformed

    private void cBox_FamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBox_FamiliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBox_FamiliaActionPerformed
        

    private void conectar( ) {
//        lblMensagem.setText("Por favor aguarde, consultando dados...");

        try {
            apsFirebase.addValueEventListener(new ValueEventListener() {

                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    lista.clear( );

                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        ModeloTabelas user = ds.getValue(ModeloTabelas.class);
                        lista.add(user);
                    }
                    tabela = new ApsTabelasModelo(lista, colunas);
                    tblConsulta.setModel((TableModel) tabela);
                    tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//                    lblMensagem.setText("");
                }

                @Override
                public void onCancelled(DatabaseError e) {
                    JOptionPane.showMessageDialog(null, "Consulta Cancelada \n" + e.getMessage());

                }

            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + e.getMessage());
        }
    }
    
    private void sincronizar( ) {
           String csvArquivo = "C:\\Users\\ranie\\Desktop\\testesAPS.csv";

           BufferedReader conteudoCSV = null;
           
           String linha = " ";
           
           String csvSeparador = ";";
                      
           try {
               
               conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
               
               ModeloTabelas teste = new ModeloTabelas( );
               Gson gson = new Gson( );

               while ((linha = conteudoCSV.readLine( )) != null) {
                   
                   String [ ] x = linha.split(csvSeparador);
                   
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
//                    Gson gson = new Gson( );
//                   String arquivoJson = gson.toJson(teste);
//                    gson.toJson(teste);

                }
               
//                    List<Gson> gson = new ArrayList<Gson( )>; // conversor
//                    gson.add(teste);
//                    String arquivoJson = gson.toJson(teste);

                    
//                    apsFirebase.child("especie").setValueAsync(teste);
                    Map<String, ModeloTabelas> users = new HashMap<>();
                    users.put("especie", teste);
                    gson.toJson(users);
                    
                    apsFirebase.setValueAsync(gson);


//                            setValue(gson, new DatabaseReference.CompletionListener( ) {
//                        @Override
//                        public void onComplete(DatabaseError de, DatabaseReference dr) {
////                            gson.toJson(teste);
////                            lista.add(teste);
////                            JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso");
//    //                        lblMensagem.setText("");
//                        }
//                    });

                    // exibindo o JSON
//                    System.out.println(arquivoJson + "\n");
               
           } catch (FileNotFoundException e) {
               System.out.println("Arquivo não encontrado: \n" + e.getMessage( ));
           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println(" IndexOutOfBounds: \n" + e.getMessage( ));
           } catch (IOException e) {
               System.out.println(" IO Erro: \n" + e.getMessage( ));
           } finally {
               if(conteudoCSV != null) {
                   try {
                       conteudoCSV.close( );
                   } catch(IOException e) {
                       System.out.println(" IO Erro: \n" + e.getMessage( ));
                   }
               }
               
           }
    }
    
    private void filtroPesquisa( ) {
//        lista aqui .clear( );
        String especie = edtCons_Especie.getText( ).toLowerCase( ).trim( );
        String bioma = edtCons_Bioma.getText( ).toLowerCase( ).trim( );
        String categoriaAmeaca = edtCons_CatAmeaca.getText( ).toLowerCase( ).trim( );
        String principaisAmeacas = edtCons_PrincAmeacas.getText( ).toLowerCase( ).trim( );
        String nomeComum = edtCons_NomeComum.getText( ).toLowerCase( ).trim( );
        String estado = edtCons_EstadoOcorr.getText( ).toLowerCase( ).trim( );
        
        String faunaFlora = (String) cBox_FaunaFlora.getSelectedItem( );
        String grupo = (String) cBox_Grupo.getSelectedItem( );
        String familia = (String) cBox_Familia.getSelectedItem( );
        grupo = grupo.replace("i", "i");
        boolean testeFiltro = true;
        
        for(int i = 0; i < lista.size( ); i++) {
            testeFiltro = true;
            
//            if(!familia.equals(" ")) {
//                if(!lista.get(i).getFamilia( ).trim( ).toLowerCase( ).equals(familia)) {
//                    testeFiltro = false;
//                }
//            } 
            if(!especie.equals(" ")) {
                if(!lista.get(i).getEspecie( ).trim( ).toLowerCase( ).equals(especie)) {
                    testeFiltro = false;
                }
            }
            if(!bioma.equals(" ")) {
                if(!lista.get(i).getBioma( ).trim( ).toLowerCase( ).equals(bioma)) {
                    testeFiltro = false;
                }
            }
            if(!categoriaAmeaca.equals(" ")) {
                if(!lista.get(i).getCategoria( ).trim( ).toLowerCase( ).equals(categoriaAmeaca)) {
                    testeFiltro = false;
                }
            }
            if(!principaisAmeacas.equals(" ")) {
                if(!lista.get(i).getPrincipaisAmeacas( ).trim( ).toLowerCase( ).equals(principaisAmeacas)) {
                    testeFiltro = false;
                }
            }
            if(!nomeComum.equals(" ")) {
                if(!lista.get(i).getNomeComum( ).trim( ).toLowerCase( ).equals(nomeComum)) {
                    testeFiltro = false;
                }
            }
            if(!estado.equals(" ")) {
                if(!lista.get(i).getEstadoOcorrencia( ).trim( ).toLowerCase( ).equals(estado)) {
                    testeFiltro = false;
                }
            }
        }
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[ ]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable( ) {
            public void run( ) {
                new ApsView( ).setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSincronizar;
    private javax.swing.JComboBox<String> cBox_Familia;
    private javax.swing.JComboBox<String> cBox_FaunaFlora;
    private javax.swing.JComboBox<String> cBox_Grupo;
    private javax.swing.JTextField edtCons_Bioma;
    private javax.swing.JTextField edtCons_CatAmeaca;
    private javax.swing.JTextField edtCons_Especie;
    private javax.swing.JTextField edtCons_EstadoOcorr;
    private javax.swing.JTextField edtCons_NomeComum;
    private javax.swing.JTextField edtCons_PrincAmeacas;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_Botoes;
    private javax.swing.JPanel jPanel_Filtro;
    private javax.swing.JPanel jPanel_Pesquisa;
    private javax.swing.JPanel jPanel_Titulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCon_EstadoOcorr;
    private javax.swing.JLabel lblCons_Bioma;
    private javax.swing.JLabel lblCons_CatAmeaca;
    private javax.swing.JLabel lblCons_Especie;
    private javax.swing.JLabel lblCons_Familia;
    private javax.swing.JLabel lblCons_FaunaFlora;
    private javax.swing.JLabel lblCons_Grupo;
    private javax.swing.JLabel lblCons_NomeComum;
    private javax.swing.JLabel lblCons_PrincAmeacas;
    private javax.swing.JPanel painelCONSULTA;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
