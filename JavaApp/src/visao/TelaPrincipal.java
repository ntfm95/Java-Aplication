/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloConection.ConexaoBD;

/**
 *
 * @author tntsa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    
    FormMedico tela = new FormMedico();
    FormUsuario telaUsu = new FormUsuario();

    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jButtonAgenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCadPacientes = new javax.swing.JButton();
        jButtonCadEnfermeiras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonCadMed = new javax.swing.JButton();
        jLabelPainelFundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadMed = new javax.swing.JMenuItem();
        jMenuItemCadPacientes = new javax.swing.JMenuItem();
        jMenuItemCadEnfermeiras = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBenVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agendamento");
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(80, 180, 110, 150);

        jLabel2.setText("Cadastros -");
        jPanelInternal.add(jLabel2);
        jLabel2.setBounds(0, 10, 80, 14);

        jButtonCadPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        jButtonCadPacientes.setToolTipText("Cadastro de Pacientes");
        jButtonCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPacientesActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadPacientes);
        jButtonCadPacientes.setBounds(310, 10, 120, 150);

        jButtonCadEnfermeiras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon-infermeira.png"))); // NOI18N
        jButtonCadEnfermeiras.setToolTipText("Cadastro de Enfermeiras");
        jPanelInternal.add(jButtonCadEnfermeiras);
        jButtonCadEnfermeiras.setBounds(190, 10, 120, 150);

        jLabel3.setText("Agenda -");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(0, 180, 50, 14);

        jButtonCadMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CadMedicos.png"))); // NOI18N
        jButtonCadMed.setToolTipText("Cadastro de Médicos");
        jButtonCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadMedActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCadMed);
        jButtonCadMed.setBounds(80, 10, 110, 150);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/internalframe.png"))); // NOI18N
        jPanelInternal.add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(0, -20, 1240, 580);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(0, 50, 1240, 580);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamento:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 230, 50);

        jButtonFecharBemVindo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonFecharBemVindo.setToolTipText("Fechar Tela Bem-Vindo");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(1190, 0, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(160, 20, 970, 470);

        jLabel4.setText("Usuário: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 490, 50, 20);
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 490, 110, 20);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/to.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 1770, 780);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadMed.setText("Médicos");
        jMenuItemCadMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadMedActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadMed);

        jMenuItemCadPacientes.setText("Pacientes");
        jMenuCadastro.add(jMenuItemCadPacientes);

        jMenuItemCadEnfermeiras.setText("Enfermeiras");
        jMenuCadastro.add(jMenuItemCadEnfermeiras);

        jMenuItemCadUsuarios.setText("Usuários");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuarios);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBenVindo.setText("Tela Bem-Vindo");
        jMenuItemTelaBenVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBenVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBenVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1936, 1119));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadPacientesActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBenVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBenVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBenVindoActionPerformed

    private void jMenuItemCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadMedActionPerformed
        try {
            conecta.executaSQL("select * from usuarios where usu_nome ='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_tipo").equals("Administrador")) {
               // FormMedico tela = new FormMedico();
               // tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar\n Contate o administrador do sistema" + ex);
        }

    }//GEN-LAST:event_jMenuItemCadMedActionPerformed

    private void jButtonCadMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadMedActionPerformed
        try {
            conecta.executaSQL("select * from usuarios where usu_nome ='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_tipo").equals("Administrador")) {
               // FormMedico tela = new FormMedico();
               // tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar\n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jButtonCadMedActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
        try {
            conecta.executaSQL("select * from usuarios where usu_nome ='" + jLabelUsuario.getText() + "'");
            conecta.rs.first();
            if (conecta.rs.getString("usu_tipo").equals("Administrador")) {
                FormUsuario tela = new FormUsuario();
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar\n Contate o administrador do sistema");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para acessar\n Contate o administrador do sistema" + ex);
        }
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonCadEnfermeiras;
    private javax.swing.JButton jButtonCadMed;
    private javax.swing.JButton jButtonCadPacientes;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemCadEnfermeiras;
    private javax.swing.JMenuItem jMenuItemCadMed;
    private javax.swing.JMenuItem jMenuItemCadPacientes;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemTelaBenVindo;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
