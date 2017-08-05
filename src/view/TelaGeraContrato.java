/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.SiGCLI;
import javax.swing.JOptionPane;
import model.Contrato;
import model.Endereco;
import model.Locador;
import model.Locatario;

/**
 *
 * @author Gutenberg
 */
public class TelaGeraContrato extends javax.swing.JFrame {

    /**
     * Creates new form TelaGeraContrato
     */
    public TelaGeraContrato() {
        initComponents();
        setSize(777,705);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtStCivilLocatario = new javax.swing.JTextField();
        txtProfissaoLocatario = new javax.swing.JTextField();
        txtNomeLocatario = new javax.swing.JTextField();
        txtNacionalidadeLocatario = new javax.swing.JTextField();
        txtCpfLocatario = new javax.swing.JFormattedTextField();
        txtRgLocatario = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        intNum = new javax.swing.JTextField();
        doubleValor = new javax.swing.JTextField();
        txtDtInicio = new javax.swing.JFormattedTextField();
        txtDtFim = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtCpfLocador = new javax.swing.JFormattedTextField();
        txtRgLocador = new javax.swing.JTextField();
        txtNacionalidadeLocador = new javax.swing.JTextField();
        txtNomeLocador = new javax.swing.JTextField();
        txtProfissaoLocador = new javax.swing.JTextField();
        txtStCivilLocador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiGCLI | Gera Contrato");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(633, 633, 110, 30);
        getContentPane().add(txtStCivilLocatario);
        txtStCivilLocatario.setBounds(140, 400, 120, 30);
        getContentPane().add(txtProfissaoLocatario);
        txtProfissaoLocatario.setBounds(140, 360, 120, 30);
        getContentPane().add(txtNomeLocatario);
        txtNomeLocatario.setBounds(140, 310, 260, 30);

        txtNacionalidadeLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadeLocatarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNacionalidadeLocatario);
        txtNacionalidadeLocatario.setBounds(480, 400, 160, 30);

        try {
            txtCpfLocatario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCpfLocatario);
        txtCpfLocatario.setBounds(440, 360, 200, 30);
        getContentPane().add(txtRgLocatario);
        txtRgLocatario.setBounds(440, 310, 200, 30);
        getContentPane().add(txtRua);
        txtRua.setBounds(130, 510, 220, 30);
        getContentPane().add(txtBairro);
        txtBairro.setBounds(130, 550, 120, 30);
        getContentPane().add(txtCidade);
        txtCidade.setBounds(130, 590, 120, 20);
        getContentPane().add(txtEstado);
        txtEstado.setBounds(430, 550, 40, 30);
        getContentPane().add(intNum);
        intNum.setBounds(430, 510, 40, 30);
        getContentPane().add(doubleValor);
        doubleValor.setBounds(650, 590, 90, 20);

        try {
            txtDtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDtInicio);
        txtDtInicio.setBounds(650, 510, 90, 30);

        try {
            txtDtFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtDtFim);
        txtDtFim.setBounds(650, 550, 90, 30);

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCep);
        txtCep.setBounds(430, 590, 110, 20);

        try {
            txtCpfLocador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCpfLocador);
        txtCpfLocador.setBounds(440, 190, 210, 30);
        getContentPane().add(txtRgLocador);
        txtRgLocador.setBounds(440, 140, 210, 30);
        getContentPane().add(txtNacionalidadeLocador);
        txtNacionalidadeLocador.setBounds(480, 230, 170, 30);
        getContentPane().add(txtNomeLocador);
        txtNomeLocador.setBounds(140, 140, 260, 30);
        getContentPane().add(txtProfissaoLocador);
        txtProfissaoLocador.setBounds(140, 190, 110, 30);
        getContentPane().add(txtStCivilLocador);
        txtStCivilLocador.setBounds(140, 230, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fundo_TelaFormulario.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-260, -180, 1050, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNacionalidadeLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadeLocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadeLocatarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // CRIAR LOCADOR
        Locador locador = new Locador(txtNomeLocador.getText(),txtNacionalidadeLocador.getText(),txtStCivilLocador.getText(),txtProfissaoLocador.getText(),
            txtRgLocador.getText(),txtCpfLocador.getText());

        // CRIAR LOCATARIO
        Locatario locatario = new Locatario(txtNomeLocatario.getText(),txtNacionalidadeLocatario.getText(),txtStCivilLocatario.getText(),txtProfissaoLocatario.getText(),
            txtRgLocatario.getText(),txtCpfLocatario.getText());

        // CRIAR CONTRATO
        Endereco endereco = new Endereco(txtRua.getText(),txtCidade.getText(),txtBairro.getText(),
            txtEstado.getText(),txtCep.getText(),Integer.parseInt(intNum.getText()));

        Contrato contrato = new Contrato(endereco,txtDtInicio.getText(),
            txtDtFim.getText(),Double.parseDouble(doubleValor.getText()));
        // PROCESSA DOCUMENTO
        if(txtNomeLocador.getText().trim().equals("") || txtEstado.getText().length()>2 || intNum.getText().equals("")){ // CHECAR ERROS
            JOptionPane.showMessageDialog(null, "Apenas a sigla do Estado");
        }else{
            if(JOptionPane.showConfirmDialog(rootPane, "Confirma os dados?")==0){
                SiGCLI.processaDocumento(locador, locatario,contrato);
                JOptionPane.showMessageDialog(null, "Contrato criado em: #aqui fica o destino# | Deseja gerar um novo contrato? ");

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGeraContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGeraContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGeraContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGeraContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeraContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doubleValor;
    private javax.swing.JTextField intNum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpfLocador;
    private javax.swing.JFormattedTextField txtCpfLocatario;
    private javax.swing.JFormattedTextField txtDtFim;
    private javax.swing.JFormattedTextField txtDtInicio;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNacionalidadeLocador;
    private javax.swing.JTextField txtNacionalidadeLocatario;
    private javax.swing.JTextField txtNomeLocador;
    private javax.swing.JTextField txtNomeLocatario;
    private javax.swing.JTextField txtProfissaoLocador;
    private javax.swing.JTextField txtProfissaoLocatario;
    private javax.swing.JTextField txtRgLocador;
    private javax.swing.JTextField txtRgLocatario;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtStCivilLocador;
    private javax.swing.JTextField txtStCivilLocatario;
    // End of variables declaration//GEN-END:variables
}
