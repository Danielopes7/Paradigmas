/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva_passagens_completo;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Silva
 */
public class JF_telalogin_sucess extends javax.swing.JFrame {
      
       
    /**
     * Creates new form JF_telalogin_sucess
     */
    public JF_telalogin_sucess() {
        initComponents();
        setSize(790,500);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sair_login_sucess = new javax.swing.JButton();
        btn_reservarpol = new javax.swing.JButton();
        btn_cancelar_pol = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_recebenome_cliente = new javax.swing.JLabel();
        recebe_cpf = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_sair_login_sucess.setBackground(new java.awt.Color(102, 102, 102));
        btn_sair_login_sucess.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_sair_login_sucess.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair_login_sucess.setText("SAIR");
        btn_sair_login_sucess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sair_login_sucessActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair_login_sucess);
        btn_sair_login_sucess.setBounds(380, 290, 80, 30);

        btn_reservarpol.setBackground(new java.awt.Color(255, 51, 0));
        btn_reservarpol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_reservarpol.setForeground(new java.awt.Color(255, 255, 255));
        btn_reservarpol.setText("RESERVAR POLTRONA");
        btn_reservarpol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarpolActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reservarpol);
        btn_reservarpol.setBounds(330, 110, 180, 30);

        btn_cancelar_pol.setBackground(new java.awt.Color(255, 51, 0));
        btn_cancelar_pol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar_pol.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_pol.setText("CANCELAR POLTRONA");
        btn_cancelar_pol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_polActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar_pol);
        btn_cancelar_pol.setBounds(330, 150, 180, 30);

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("COMPRAR DEFINITIVO");
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 190, 180, 30);

        jButton5.setBackground(new java.awt.Color(255, 51, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIBIR CARTÃO DE VÔO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(330, 230, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OLÁ,");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 350, 30, 14);

        lbl_recebenome_cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_recebenome_cliente.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_recebenome_cliente);
        lbl_recebenome_cliente.setBounds(70, 350, 220, 14);

        recebe_cpf.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        recebe_cpf.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(recebe_cpf);
        recebe_cpf.setBounds(0, 30, 150, 20);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/CAPA_LOGIN_SUCESS.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 30, 800, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reservarpolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarpolActionPerformed
        Voo_Reservado v= new Voo_Reservado();
        int i;
        boolean ok=true;
        for(i=0; i<Voo_Reservado.voos.size();i++){
            System.out.println(lbl_recebenome_cliente.getText());
        System.out.println(Voo_Reservado.voos.get(0).getNome());
            if(Voo_Reservado.voos.get(i).getNome().equals(lbl_recebenome_cliente.getText())){
                JOptionPane.showMessageDialog(null, "ERRO VOCE JA RESERVOU!");
                ok=false;
                i=Voo_Reservado.voos.size();
                
                
            }
        }
        if(ok){
                JF_tela_reservar tel= new JF_tela_reservar();
                tel.recebeNome(lbl_recebenome_cliente.getText());
                tel.recebeCpf(recebe_cpf.getText());
                tel.setVisible(true);
                dispose();
                
            }
        
        
    }//GEN-LAST:event_btn_reservarpolActionPerformed

    private void btn_cancelar_polActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_polActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_polActionPerformed

    private void btn_sair_login_sucessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sair_login_sucessActionPerformed
        Interface inter3= new Interface();
        inter3.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_sair_login_sucessActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_telalogin_sucess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_telalogin_sucess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_telalogin_sucess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_telalogin_sucess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_telalogin_sucess().setVisible(true);
            }
        });
    }

    
    public void recebeNome(String nome){
        lbl_recebenome_cliente.setText(nome);
    }
    public void recebeCpf(String cpf){
        recebe_cpf.setText(cpf);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_cancelar_pol;
    private javax.swing.JButton btn_reservarpol;
    private javax.swing.JButton btn_sair_login_sucess;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_recebenome_cliente;
    private javax.swing.JLabel recebe_cpf;
    // End of variables declaration//GEN-END:variables
}
