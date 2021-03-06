/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansPacientes;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoPaciente;

public class FormPaciente extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    BeansPacientes mod = new BeansPacientes();
    DaoPaciente dao = new DaoPaciente();

    int flag = 0;

    public FormPaciente() {
        initComponents();
        preencherBairros();
        preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldDtNasc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jComboBoxBairros = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(664, 343));

        jLabel2.setText("Nome :");

        jLabel3.setText("Nascimento :");

        jLabel4.setText("RG :");

        jLabel5.setText("Telefone :");

        jTextFieldNome.setEnabled(false);

        jFormattedTextFieldDtNasc.setEnabled(false);

        jFormattedTextFieldRG.setEnabled(false);

        jFormattedTextFieldTelefone.setEnabled(false);
        jFormattedTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefoneActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Rua :");

        jLabel8.setText("CEP :");

        jLabel9.setText("Complemento :");

        jLabel10.setText("Bairro :");

        jTextFieldRua.setEnabled(false);

        jFormattedTextFieldCep.setEnabled(false);

        jTextFieldComplemento.setEnabled(false);

        jComboBoxBairros.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldRua)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxBairros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBairros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Endereço");

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel11.setText("Pesquisa :");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel12.setText("Código:");

        jTextFieldCod.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jButtonNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalvar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNovo)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel1.setText("Formulário de Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        setSize(new java.awt.Dimension(766, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherBairros() {
        conex.conexao();
        conex.executaSQL("select * from bairro order by bainome");
        try {
            conex.rs.first();
            jComboBoxBairros.removeAllItems();
            do {
                jComboBoxBairros.addItem(conex.rs.getString("bainome"));
            } while (conex.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher bairros" + ex);
        }
        conex.desconecta();
    }

    private void jFormattedTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefoneActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (jTextFieldNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome");
            jTextFieldNome.requestFocus();
        } else if (jFormattedTextFieldCep.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo CEP");
            jFormattedTextFieldCep.requestFocus();
        } else if (jTextFieldComplemento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo complemento");
            jTextFieldComplemento.requestFocus();
        } else if (jFormattedTextFieldDtNasc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo data de nascimento");
            jFormattedTextFieldDtNasc.requestFocus();
        } else if (jFormattedTextFieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo telefone");
            jFormattedTextFieldTelefone.requestFocus();
        } else if (jFormattedTextFieldRG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo RG");
            jFormattedTextFieldRG.requestFocus();
        } else if (jTextFieldRua.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo rua");
            jTextFieldRua.requestFocus();
        } else if (flag == 1)/*salvar*/ {
            mod.setNomePac(jTextFieldNome.getText());
            mod.setCep(jFormattedTextFieldCep.getText());
            mod.setComplemento(jTextFieldComplemento.getText());
            mod.setNasc(jFormattedTextFieldDtNasc.getText());
            mod.setNomeBairro((String) jComboBoxBairros.getSelectedItem());
            mod.setTelefone(jFormattedTextFieldTelefone.getText());
            mod.setRg(jFormattedTextFieldRG.getText());
            mod.setRua(jTextFieldRua.getText());
            dao.Salvar(mod);
            //Limpando os campos
            jTextFieldNome.setText("");
            jFormattedTextFieldCep.setText("");
            jTextFieldComplemento.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jComboBoxBairros.setSelectedItem("");
            jFormattedTextFieldRG.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldTelefone.setText("");
            //Bloqueando campos
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCep.setEnabled(false);
            jTextFieldComplemento.setEnabled(false);
            jFormattedTextFieldDtNasc.setEnabled(false);
            jComboBoxBairros.setEnabled(false);
            jFormattedTextFieldRG.setEnabled(false);
            jTextFieldRua.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
//bloqueando botões
            jButtonAlterar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            //ativando botões
            jButtonNovo.setEnabled(true);
            jButtonBuscar.setEnabled(true);
            //ativando campo
            jTextFieldPesquisa.setEnabled(true);
            //atualizando tabela
            preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome");

        } else /*editar*/ {
            mod.setNomePac(jTextFieldNome.getText());
            mod.setCep(jFormattedTextFieldCep.getText());
            mod.setComplemento(jTextFieldComplemento.getText());
            mod.setNasc(jFormattedTextFieldDtNasc.getText());
            mod.setNomeBairro((String) jComboBoxBairros.getSelectedItem());
            mod.setTelefone(jFormattedTextFieldTelefone.getText());
            mod.setRg(jFormattedTextFieldRG.getText());
            mod.setRua(jTextFieldRua.getText());
            mod.setCodPac(Integer.parseInt(jTextFieldCod.getText()));
            dao.Editar(mod);
            //Bloqueando campos
            jTextFieldNome.setEnabled(false);
            jFormattedTextFieldCep.setEnabled(false);
            jTextFieldComplemento.setEnabled(false);
            jFormattedTextFieldDtNasc.setEnabled(false);
            jComboBoxBairros.setEnabled(false);
            jFormattedTextFieldRG.setEnabled(false);
            jTextFieldRua.setEnabled(false);
            jFormattedTextFieldTelefone.setEnabled(false);
//Limpando os campos
            jTextFieldNome.setText("");
            jFormattedTextFieldCep.setText("");
            jTextFieldComplemento.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jComboBoxBairros.setSelectedItem("");
            jFormattedTextFieldRG.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldTelefone.setText("");
//bloqueando botões
            jButtonAlterar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            //ativando botões
            jButtonNovo.setEnabled(true);
            jButtonBuscar.setEnabled(true);
            //ativando campo
            jTextFieldPesquisa.setEnabled(true);
            //atualizando tabela
            preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        flag = 2;
//Bloqueando campos
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCep.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jFormattedTextFieldDtNasc.setEnabled(true);
        jComboBoxBairros.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
//ativando botões
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
//desativando botões
        jButtonExcluir.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
//desativando campos
        jTextFieldPesquisa.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        //ativando os campos
        jTextFieldNome.setEnabled(true);
        jFormattedTextFieldCep.setEnabled(true);
        jTextFieldComplemento.setEnabled(true);
        jFormattedTextFieldDtNasc.setEnabled(true);
        jComboBoxBairros.setEnabled(true);
        jFormattedTextFieldRG.setEnabled(true);
        jTextFieldRua.setEnabled(true);
        jFormattedTextFieldTelefone.setEnabled(true);
        //limpando os campos
        jTextFieldNome.setText("");
        jFormattedTextFieldCep.setText("");
        jTextFieldComplemento.setText("");
        jFormattedTextFieldDtNasc.setText("");
        jComboBoxBairros.setSelectedItem("");
        jFormattedTextFieldRG.setText("");
        jTextFieldRua.setText("");
        jFormattedTextFieldTelefone.setText("");
        //botões habilitar
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
//botões desabilitando
        jButtonAlterar.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        mod.setPesquisar(jTextFieldPesquisa.getText());
        BeansPacientes pac1 = dao.buscaPacientes(mod);
        jTextFieldNome.setText(pac1.getNomePac());
        jTextFieldCod.setText(String.valueOf(pac1.getCodPac()));
        jFormattedTextFieldDtNasc.setText(pac1.getNasc());
        jFormattedTextFieldRG.setText(pac1.getRg());
        jFormattedTextFieldTelefone.setText(pac1.getRg());
        jTextFieldRua.setText(pac1.getRua());
        jFormattedTextFieldCep.setText(pac1.getCep());
        jTextFieldComplemento.setText(pac1.getComplemento());
        jComboBoxBairros.setSelectedItem(pac1.getNomeBairro());
        //ativando botões
        jButtonAlterar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        //desativando botões
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir ?");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCodPac(Integer.parseInt(jTextFieldCod.getText()));
            dao.Excluir(mod);
            //limpando campos
            jTextFieldCod.setText("");
            jTextFieldNome.setText("");
            jTextFieldComplemento.setText("");
            jTextFieldPesquisa.setText("");
            jTextFieldRua.setText("");
            jFormattedTextFieldCep.setText("");
            jFormattedTextFieldDtNasc.setText("");
            jFormattedTextFieldRG.setText("");
            jFormattedTextFieldTelefone.setText("");
            jComboBoxBairros.setSelectedItem("");
            //bloqueando botões
            jButtonAlterar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            //ativando botões
            jButtonNovo.setEnabled(true);
            //atualizando tabela
            preencherTabela("select paci_codigo, paci_nome, paci_telefone, paci_rg, bainome from pacientes inner join bairro on paci_baicodigo = baicodigo order by paci_nome");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "Telefone", "RG", "Bairro"};
        conex.conexao();
        conex.executaSQL(Sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getInt("paci_codigo"), conex.rs.getString("paci_nome"), conex.rs.getString("paci_telefone"), conex.rs.getString("paci_rg"), conex.rs.getString("bainome")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao buscar pacientes");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTablePacientes.setModel(modelo);
        //ID
        jTablePacientes.getColumnModel().getColumn(0).setPreferredWidth(23);
        jTablePacientes.getColumnModel().getColumn(0).setResizable(false);
        //NOME
        jTablePacientes.getColumnModel().getColumn(1).setPreferredWidth(220);
        jTablePacientes.getColumnModel().getColumn(1).setResizable(false);
        //ESPECIALIDADE
        jTablePacientes.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTablePacientes.getColumnModel().getColumn(2).setResizable(false);
        //CRM
        jTablePacientes.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTablePacientes.getColumnModel().getColumn(3).setResizable(false);

        jTablePacientes.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTablePacientes.getColumnModel().getColumn(4).setResizable(false);
        //Impedir a reodernação do cabeçalho
        jTablePacientes.getTableHeader().setReorderingAllowed(false);
        jTablePacientes.setAutoResizeMode(jTablePacientes.AUTO_RESIZE_OFF);
        jTablePacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        //limpando campos
        jTextFieldCod.setText("");
        jTextFieldNome.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldPesquisa.setText("");
        jTextFieldRua.setText("");
        jFormattedTextFieldCep.setText("");
        jFormattedTextFieldDtNasc.setText("");
        jFormattedTextFieldRG.setText("");
        jFormattedTextFieldTelefone.setText("");
        jComboBoxBairros.setSelectedItem("");
        //bloqueando botões
        jButtonAlterar.setEnabled(false);
        jButtonBuscar.setEnabled(true);
        jButtonCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        String nome_paciente = "" + jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSQL("select * from pacientes where paci_nome ='"+ nome_paciente +"'");
        try{
            conex.rs.first();
            jTextFieldCod.setText(String.valueOf(conex.rs.getInt("paci_codigo")));
            jTextFieldNome.setText(conex.rs.getString("paci_nome"));
            jTextFieldComplemento.setText(conex.rs.getString("paci_complemento"));
            jTextFieldRua.setText(conex.rs.getString("paci_rua"));
            jFormattedTextFieldCep.setText(conex.rs.getString("paci_cep"));
            jFormattedTextFieldRG.setText(conex.rs.getString("paci_rg"));
            jFormattedTextFieldDtNasc.setText(conex.rs.getString("paci_nasc"));
            jFormattedTextFieldTelefone.setText(conex.rs.getString("paci_telefone"));
            
           /* ConexaoBD conexPesquisa = new ConexaoBD();
            conexPesquisa.conexao();
            conexPesquisa.executaSQL("select * from bairro where baicodigo ="+ conex.rs.getInt("paci_baicodigo"));
            jComboBoxBairros.setSelectedItem(conexPesquisa.rs.getString("bainome"));
            conexPesquisa.desconecta();*/
           
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao trazer paciente" + ex);
        }
        conex.desconecta();
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTablePacientesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxBairros;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldDtNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
