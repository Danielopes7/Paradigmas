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
public class Poltronas_Reservar extends javax.swing.JFrame {
    ClasseA map= new ClasseA();
    String mat[][]= new String[21][7];
    String mat2[][]= new String[21][7]; //VETOR AUXILIAR DE STRING
    int i,j;
    String aux,str; //AUXILIARES
    char c= 'A'; // SERÁ USADO PRA MONTAR O VETOR DE STRING

    /**
     * Creates new form Poltronas_Reservar
     */
    public Poltronas_Reservar() {
        initComponents();
        setSize(900,540);
        setLocationRelativeTo(null);
        map.marcamapa();
        mat= ClasseA.getVet();
        
        if("false".equals(mat[1][1])){
            A_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[1][1])){
            A_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[1][2])){
            A_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[1][2])){
            A_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[1][3])){
            A_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[1][3])){
            A_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[1][4])){
            A_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[1][4])){
            A_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[1][5])){
            A_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[1][5])){
            A_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[1][6])){
            A_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[1][6])){
            A_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        //==============================================END EFFECT A===============================================================
        
        
        
        if("false".equals(mat[2][1])){
            B_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[2][1])){
            B_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         if("false".equals(mat[2][2])){
            B_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[2][2])){
            B_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
          if("false".equals(mat[2][3])){
            B_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[2][3])){
            B_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
           if("false".equals(mat[2][4])){
            B_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[2][4])){
            B_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
            if("false".equals(mat[2][5])){
            B_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[2][5])){
            B_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
             if("false".equals(mat[2][6])){
            B_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[2][6])){
            B_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        //============================================END EFFECT B====================================================================
        
         if("false".equals(mat[3][1])){
            C_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[3][1])){
            C_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         if("false".equals(mat[3][2])){
            C_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[3][2])){
            C_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         if("false".equals(mat[3][3])){
            C_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[3][3])){
            C_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         if("false".equals(mat[3][4])){
            C_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[3][4])){
            C_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         if("false".equals(mat[3][5])){
            C_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[3][5])){
            C_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         if("false".equals(mat[3][6])){
            C_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[3][6])){
            C_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         //========================================================= END EFFECT C=========================
         
         if("false".equals(mat[4][1])){
            D_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[4][1])){
            D_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
          if("false".equals(mat[4][2])){
            D_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[4][2])){
            D_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
           if("false".equals(mat[4][3])){
            D_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[4][3])){
            D_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
            if("false".equals(mat[4][4])){
            D_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[4][4])){
            D_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
             if("false".equals(mat[4][5])){
            D_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[4][5])){
            D_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              if("false".equals(mat[4][6])){
            D_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[4][6])){
            D_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              //================================END EFFECT D===========================================================================
              
        if("false".equals(mat[5][1])){
            E_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[5][1])){
            E_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[5][2])){
            E_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[5][2])){
            E_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[5][3])){
            E_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[5][3])){
            E_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[5][4])){
            E_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[5][4])){
            E_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[5][5])){
            E_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[5][5])){
            E_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[5][6])){
            E_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[5][6])){
            E_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        //===========================END EFFECT E=============================================
      
        
      

           
        
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        E_B = new javax.swing.JLabel();
        E_C = new javax.swing.JLabel();
        E_E = new javax.swing.JLabel();
        E_A = new javax.swing.JLabel();
        E_F = new javax.swing.JLabel();
        E_D = new javax.swing.JLabel();
        A_F = new javax.swing.JLabel();
        A_E = new javax.swing.JLabel();
        A_D = new javax.swing.JLabel();
        A_C = new javax.swing.JLabel();
        A_B = new javax.swing.JLabel();
        B_A = new javax.swing.JLabel();
        B_B = new javax.swing.JLabel();
        B_C = new javax.swing.JLabel();
        B_D = new javax.swing.JLabel();
        B_E = new javax.swing.JLabel();
        B_F = new javax.swing.JLabel();
        C_F = new javax.swing.JLabel();
        C_E = new javax.swing.JLabel();
        C_D = new javax.swing.JLabel();
        C_C = new javax.swing.JLabel();
        C_B = new javax.swing.JLabel();
        C_A = new javax.swing.JLabel();
        D_F = new javax.swing.JLabel();
        D_E = new javax.swing.JLabel();
        D_D = new javax.swing.JLabel();
        D_C = new javax.swing.JLabel();
        D_B = new javax.swing.JLabel();
        D_A = new javax.swing.JLabel();
        guardalocal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_reservar = new javax.swing.JButton();
        btn_volte = new javax.swing.JButton();
        A_A = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FUNDO = new javax.swing.JLabel();
        rec_cpf = new javax.swing.JLabel();
        rec_nome = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        E_B.setForeground(new java.awt.Color(255, 255, 255));
        E_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(E_B);
        E_B.setBounds(120, 430, 40, 40);

        E_C.setForeground(new java.awt.Color(255, 255, 255));
        E_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(E_C);
        E_C.setBounds(180, 430, 40, 40);

        E_E.setForeground(new java.awt.Color(255, 255, 255));
        E_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(E_E);
        E_E.setBounds(290, 430, 40, 40);

        E_A.setForeground(new java.awt.Color(255, 255, 255));
        E_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(E_A);
        E_A.setBounds(70, 430, 40, 40);

        E_F.setForeground(new java.awt.Color(255, 255, 255));
        E_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(E_F);
        E_F.setBounds(340, 430, 40, 40);

        E_D.setForeground(new java.awt.Color(255, 255, 255));
        E_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(E_D);
        E_D.setBounds(230, 430, 40, 40);

        A_F.setForeground(new java.awt.Color(255, 255, 255));
        A_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(A_F);
        A_F.setBounds(340, 230, 40, 40);

        A_E.setForeground(new java.awt.Color(255, 255, 255));
        A_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(A_E);
        A_E.setBounds(290, 230, 40, 40);

        A_D.setForeground(new java.awt.Color(255, 255, 255));
        A_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(A_D);
        A_D.setBounds(230, 230, 40, 40);

        A_C.setForeground(new java.awt.Color(255, 255, 255));
        A_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(A_C);
        A_C.setBounds(180, 230, 40, 40);

        A_B.setForeground(new java.awt.Color(255, 255, 255));
        A_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(A_B);
        A_B.setBounds(120, 230, 40, 40);

        B_A.setForeground(new java.awt.Color(255, 255, 255));
        B_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(B_A);
        B_A.setBounds(70, 280, 40, 40);

        B_B.setForeground(new java.awt.Color(255, 255, 255));
        B_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(B_B);
        B_B.setBounds(120, 280, 40, 40);

        B_C.setForeground(new java.awt.Color(255, 255, 255));
        B_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(B_C);
        B_C.setBounds(180, 280, 40, 40);

        B_D.setForeground(new java.awt.Color(255, 255, 255));
        B_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(B_D);
        B_D.setBounds(230, 280, 40, 40);

        B_E.setForeground(new java.awt.Color(255, 255, 255));
        B_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(B_E);
        B_E.setBounds(290, 280, 40, 40);

        B_F.setForeground(new java.awt.Color(255, 255, 255));
        B_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(B_F);
        B_F.setBounds(340, 280, 40, 40);

        C_F.setForeground(new java.awt.Color(255, 255, 255));
        C_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(C_F);
        C_F.setBounds(340, 330, 40, 40);

        C_E.setForeground(new java.awt.Color(255, 255, 255));
        C_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(C_E);
        C_E.setBounds(290, 330, 40, 40);

        C_D.setForeground(new java.awt.Color(255, 255, 255));
        C_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(C_D);
        C_D.setBounds(230, 330, 40, 40);

        C_C.setForeground(new java.awt.Color(255, 255, 255));
        C_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(C_C);
        C_C.setBounds(180, 330, 40, 40);

        C_B.setForeground(new java.awt.Color(255, 255, 255));
        C_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(C_B);
        C_B.setBounds(120, 330, 40, 40);

        C_A.setForeground(new java.awt.Color(255, 255, 255));
        C_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(C_A);
        C_A.setBounds(70, 330, 40, 40);

        D_F.setForeground(new java.awt.Color(255, 255, 255));
        D_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(D_F);
        D_F.setBounds(340, 380, 40, 40);

        D_E.setForeground(new java.awt.Color(255, 255, 255));
        D_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(D_E);
        D_E.setBounds(290, 380, 40, 40);

        D_D.setForeground(new java.awt.Color(255, 255, 255));
        D_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(D_D);
        D_D.setBounds(230, 380, 40, 40);

        D_C.setForeground(new java.awt.Color(255, 255, 255));
        D_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(D_C);
        D_C.setBounds(180, 380, 40, 40);

        D_B.setForeground(new java.awt.Color(255, 255, 255));
        D_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(D_B);
        D_B.setBounds(120, 380, 40, 40);

        D_A.setForeground(new java.awt.Color(255, 255, 255));
        D_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        getContentPane().add(D_A);
        D_A.setBounds(70, 380, 40, 40);

        guardalocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardalocalActionPerformed(evt);
            }
        });
        getContentPane().add(guardalocal);
        guardalocal.setBounds(630, 310, 50, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESCOLHA O LOCAL: (EX: 1A)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(620, 260, 190, 50);

        btn_reservar.setBackground(new java.awt.Color(255, 51, 0));
        btn_reservar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_reservar.setForeground(new java.awt.Color(255, 255, 255));
        btn_reservar.setText("RESERVAR");
        btn_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reservar);
        btn_reservar.setBounds(690, 310, 100, 40);

        btn_volte.setBackground(new java.awt.Color(153, 153, 153));
        btn_volte.setText("VOLTAR");
        btn_volte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volte);
        btn_volte.setBounds(690, 370, 100, 30);

        A_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        A_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        getContentPane().add(A_A);
        A_A.setBounds(70, 230, 40, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("F");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(355, 188, 20, 60);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("A");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(84, 188, 20, 60);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("B");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(133, 188, 20, 60);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("C");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(194, 188, 20, 60);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("D");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(245, 188, 20, 60);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("E");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(305, 188, 12, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("5");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(57, 430, 20, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("1");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(57, 230, 20, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("2");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(57, 280, 20, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("3");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(57, 330, 20, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("4");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(57, 380, 20, 40);

        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/AVIAO.png"))); // NOI18N
        FUNDO.setText("SALA DE CONTROLE");
        getContentPane().add(FUNDO);
        FUNDO.setBounds(-10, 0, 460, 520);
        getContentPane().add(rec_cpf);
        rec_cpf.setBounds(690, 470, 100, 30);
        getContentPane().add(rec_nome);
        rec_nome.setBounds(540, 80, 280, 30);

        jLabel13.setText("OLÁ,");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(510, 90, 24, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardalocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardalocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardalocalActionPerformed

    private void btn_volteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volteActionPerformed
        JF_tela_reservar res= new JF_tela_reservar();
        res.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volteActionPerformed

    private void btn_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarActionPerformed
        for(int n=1; n<=20; n++){
             aux= Integer.toString(n); //CONVERTO INTEIRO PARA STRING 
            for(int m=1; m<=6; m++){
                str= aux+c; //CONCATENO , EX: 1 + C = 1A
                mat2[n][m]= str; // JOGO NA MATRIZ AUXILIAR
                c++; // INCREVEMENTO O C --> B,C,D E ASSIM POR DIANTE
            }
            c= 'A'; //VOLTO PARA A 
        }
        boolean ok=false;
        if(guardalocal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "INFORME UM LOCAL!");   
        }else{
            Voo_Reservado v1= new Voo_Reservado();
            v1.setNome(rec_nome.getText());
            v1.setOrigem("São Luís");
            v1.setDestino("Brasilia");
            v1.setData("23/09");
            v1.setHora("13:45");
            v1.setClasse("Classe A");
            for(i=1; i<6;i++){
                for(j=1; j<7; j++){
                    if(mat2[i][j].equals(guardalocal.getText())){
                        map.setPoltrona(guardalocal.getText());
                        map.Reservar(i, j,v1);
                        ok=true;
                        j=8;
                        i=7;
                    }
                }
            }
        }
        
        
    }//GEN-LAST:event_btn_reservarActionPerformed

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
            java.util.logging.Logger.getLogger(Poltronas_Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poltronas_Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poltronas_Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poltronas_Reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poltronas_Reservar().setVisible(true);
            }
        });
        
 
    }
     public void recebeNome(String nome){
        rec_nome.setText(nome);
    }
    public void recebeCpf(String cpf){
        rec_cpf.setText(cpf);
    }


 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A_A;
    private javax.swing.JLabel A_B;
    private javax.swing.JLabel A_C;
    private javax.swing.JLabel A_D;
    private javax.swing.JLabel A_E;
    private javax.swing.JLabel A_F;
    private javax.swing.JLabel B_A;
    private javax.swing.JLabel B_B;
    private javax.swing.JLabel B_C;
    private javax.swing.JLabel B_D;
    private javax.swing.JLabel B_E;
    private javax.swing.JLabel B_F;
    private javax.swing.JLabel C_A;
    private javax.swing.JLabel C_B;
    private javax.swing.JLabel C_C;
    private javax.swing.JLabel C_D;
    private javax.swing.JLabel C_E;
    private javax.swing.JLabel C_F;
    private javax.swing.JLabel D_A;
    private javax.swing.JLabel D_B;
    private javax.swing.JLabel D_C;
    private javax.swing.JLabel D_D;
    private javax.swing.JLabel D_E;
    private javax.swing.JLabel D_F;
    private javax.swing.JLabel E_A;
    private javax.swing.JLabel E_B;
    private javax.swing.JLabel E_C;
    private javax.swing.JLabel E_D;
    private javax.swing.JLabel E_E;
    private javax.swing.JLabel E_F;
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton btn_reservar;
    private javax.swing.JButton btn_volte;
    private javax.swing.JTextField guardalocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel rec_cpf;
    private javax.swing.JLabel rec_nome;
    // End of variables declaration//GEN-END:variables
}
