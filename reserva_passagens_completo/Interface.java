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
public class Interface extends javax.swing.JFrame{
     
     Arquivo arq= new Arquivo();
     ClasseA map= new ClasseA();
      String nome_arquivo= "banco_cadastro.txt";
      String test=Arquivo.Read(nome_arquivo);
      String nome_arquivo1= "voos.txt";
      String test1=Arquivo.Read(nome_arquivo1);
      int cont1=0,cont2=0,i=0,j;
      
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        setSize(775,500);
        setLocationRelativeTo(null);   
     
      while (!test.split(";")[cont1].equals("&") && !test.equals("&;") && test.isEmpty()==false){
                    Cadastro p= new Cadastro();
                     p.setNome( test.split(";")[cont1]);
                     cont1++;
                     
                     p.setCpf(test.split(";")[cont1]);
                     cont1++;
                     

                     p.setCartaocredito(test.split(";")[cont1]);
                     cont1++;

                     p.setTel(test.split(";")[cont1]);
                     cont1++;

                     p.setIdade(test.split(";")[cont1]);
                     cont1++;
                     
                     p.setSenha(test.split(";")[cont1]);
                     cont1++;
                     
                     p.adiciona(p);
                     
        }
       for(i=0; i<Cadastro.getPessoas().size();i++){
        System.out.println(Cadastro.getPessoas().get(i).getNome()+"|"+
                     Cadastro.getPessoas().get(i).getCpf()+"|"+Cadastro.getPessoas().get(i).getCartaocredito()+"|"+
                     Cadastro.getPessoas().get(i).getTel()+"|"+Cadastro.getPessoas().get(i).getIdade()+"|"+
                     Cadastro.getPessoas().get(i).getSenha());        
                     
    }
       
      
     
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cadastro = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_cadastro.setBackground(new java.awt.Color(255, 51, 0));
        btn_cadastro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastro.setText("REALIZAR CADASTRO");
        btn_cadastro.setBorder(null);
        btn_cadastro.setBorderPainted(false);
        btn_cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastro.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro);
        btn_cadastro.setBounds(300, 160, 180, 44);

        btn_sair.setBackground(new java.awt.Color(102, 102, 102));
        btn_sair.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        btn_sair.setText("SAIR");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sair);
        btn_sair.setBounds(350, 290, 77, 31);

        btn_login.setBackground(new java.awt.Color(255, 51, 0));
        btn_login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("FAZER LOGIN");
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(300, 230, 180, 44);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/loginns.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 230, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/icon22.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 160, 40, 50);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/CAPA.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(-20, -10, 820, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed
        JF_telacadastro obj= new JF_telacadastro();
        obj.setVisible(true);
        obj.setResizable(false);
        dispose();
        
    }//GEN-LAST:event_btn_cadastroActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        JF_telalogin obj2= new JF_telalogin();
        obj2.setVisible(true);
        obj2.setResizable(false);
        dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}