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
public class Poltronas_reservar_economica extends javax.swing.JFrame {
    ClasseA map= new ClasseA();
    String mat[][]= new String[21][7];
    String mat2[][]= new String[21][7]; //VETOR AUXILIAR DE STRING
    int i,j;
    String aux,str; //AUXILIARES
    char c= 'A'; // SERÁ USADO PRA MONTAR O VETOR DE STRING
    /**
     * Creates new form Poltronas_reservar_economica
     */
    public Poltronas_reservar_economica() {
        initComponents();
        setSize(900,500);
        setLocationRelativeTo(null);
        map.marcamapa();
        mat= ClasseA.getVet();
        
        if("false".equals(mat[6][1])){
            A_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[6][1])){
            A_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[6][2])){
            A_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[6][2])){
            A_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[6][3])){
            A_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[6][3])){
            A_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[6][4])){
            A_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[6][4])){
            A_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[6][5])){
            A_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[6][5])){
            A_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[6][6])){
            A_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[6][6])){
            A_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[7][1])){
            B_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[7][1])){
            B_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
       
        if("false".equals(mat[7][2])){
            B_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[7][2])){
            B_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[7][3])){
            B_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[7][3])){
            B_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[7][4])){
            B_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[7][4])){
            B_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[7][5])){
            B_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[7][5])){
            B_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[7][6])){
            B_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[7][6])){
            B_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[8][1])){
            C_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[8][1])){
            C_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
         
         if("false".equals(mat[8][2])){
            C_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[8][2])){
            C_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[8][3])){
            C_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[8][3])){
            C_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[8][4])){
            C_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[8][4])){
            C_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[8][5])){
            C_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[8][5])){
            C_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[8][6])){
            C_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[8][6])){
            C_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[9][1])){
            D_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[9][1])){
            D_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[9][2])){
            D_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[9][2])){
            D_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[9][3])){
            D_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[9][3])){
            D_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[9][4])){
            D_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[9][4])){
            D_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[9][5])){
            D_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[9][5])){
            D_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[9][6])){
            D_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[9][6])){
            D_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[10][1])){
            E_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[10][1])){
            E_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[10][2])){
            E_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[10][2])){
            E_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[10][3])){
            E_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[10][3])){
            E_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[10][4])){
            E_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[10][4])){
            E_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[10][5])){
            E_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[10][5])){
            E_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[10][6])){
            E_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[10][6])){
            E_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[11][1])){
            F_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[11][1])){
            F_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[11][2])){
            F_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[11][2])){
            F_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[11][3])){
            F_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[11][3])){
            F_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[11][4])){
            F_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[11][4])){
            F_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[11][5])){
            F_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[11][5])){
            F_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[11][6])){
            F_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[11][6])){
            F_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
           if("false".equals(mat[12][1])){
            G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][1])){
            G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[12][2])){
            G_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][2])){
            G_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[12][3])){
            G_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][3])){
            G_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[12][4])){
            G_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][4])){
            G_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[12][5])){
            G_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][5])){
            G_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[12][6])){
            G_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][6])){
            G_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              if("false".equals(mat[13][1])){
            H_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[13][1])){
            H_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[13][2])){
            H_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[13][2])){
            H_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[13][3])){
            H_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[13][3])){
            H_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[13][4])){
            H_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[13][4])){
            H_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[13][5])){
            H_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[12][5])){
            H_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[13][6])){
            H_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[13][6])){
            H_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              if("false".equals(mat[14][1])){
            I_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[14][1])){
            I_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[14][2])){
            I_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[14][2])){
            I_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[14][3])){
           I_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[14][3])){
            I_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[14][4])){
            I_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[14][4])){
            I_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[14][5])){
            I_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[14][5])){
            I_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[14][6])){
            I_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[14][6])){
            I_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              if("false".equals(mat[15][1])){
            J_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[15][1])){
            J_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[15][2])){
            J_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[15][2])){
            J_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[15][3])){
            J_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[15][3])){
            J_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[15][4])){
            J_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[15][4])){
            J_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[15][5])){
            J_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[15][5])){
            J_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[15][6])){
            J_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[15][6])){
            J_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              if("false".equals(mat[16][1])){
            K_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[16][1])){
            K_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[16][2])){
            K_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[16][2])){
            K_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[16][3])){
            K_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[16][3])){
            K_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[16][4])){
            K_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[16][4])){
            K_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[16][5])){
            K_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[16][5])){
            K_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[16][6])){
            K_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[16][6])){
            K_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
              if("false".equals(mat[17][1])){
            L_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][1])){
            L_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[17][2])){
            L_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][2])){
            L_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[17][3])){
            L_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][3])){
            L_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[17][4])){
            L_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][4])){
            L_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[17][5])){
            L_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][5])){
            L_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[17][6])){
            L_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][6])){
            L_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
               if("false".equals(mat[18][1])){
            M_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[17][1])){
            M_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[18][2])){
            M_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[18][2])){
            M_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[18][3])){
            M_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[18][3])){
            M_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[18][4])){
            M_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[18][4])){
            M_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[18][5])){
            M_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[18][5])){
            M_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[18][6])){
            M_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[18][6])){
            M_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
               if("false".equals(mat[19][1])){
            N_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[19][1])){
            N_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[19][2])){
            N_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[19][2])){
            N_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[19][3])){
            N_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[19][3])){
            N_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[19][4])){
            N_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[19][4])){
            N_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[19][5])){
            N_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[19][5])){
            N_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[19][6])){
            N_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[19][6])){
            N_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
               if("false".equals(mat[20][1])){
            O_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[20][1])){
            O_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        
        if("false".equals(mat[20][2])){
            O_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[20][2])){
            O_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[20][3])){
            O_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[20][3])){
            O_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[20][4])){
            O_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[20][4])){
            O_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[20][5])){
            O_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[20][5])){
            O_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        }
        if("false".equals(mat[20][6])){
            O_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        }else if("true".equals(mat[20][6])){
            O_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        E_B3 = new javax.swing.JLabel();
        E_C3 = new javax.swing.JLabel();
        E_E3 = new javax.swing.JLabel();
        E_A3 = new javax.swing.JLabel();
        E_F3 = new javax.swing.JLabel();
        E_D3 = new javax.swing.JLabel();
        A_F3 = new javax.swing.JLabel();
        A_E3 = new javax.swing.JLabel();
        A_D3 = new javax.swing.JLabel();
        A_C3 = new javax.swing.JLabel();
        A_B3 = new javax.swing.JLabel();
        B_A3 = new javax.swing.JLabel();
        B_B3 = new javax.swing.JLabel();
        B_C3 = new javax.swing.JLabel();
        B_D3 = new javax.swing.JLabel();
        B_E3 = new javax.swing.JLabel();
        B_F3 = new javax.swing.JLabel();
        C_F3 = new javax.swing.JLabel();
        C_E3 = new javax.swing.JLabel();
        C_D3 = new javax.swing.JLabel();
        C_C3 = new javax.swing.JLabel();
        C_B3 = new javax.swing.JLabel();
        C_A3 = new javax.swing.JLabel();
        D_F3 = new javax.swing.JLabel();
        D_E3 = new javax.swing.JLabel();
        D_D3 = new javax.swing.JLabel();
        D_C3 = new javax.swing.JLabel();
        D_B3 = new javax.swing.JLabel();
        D_A3 = new javax.swing.JLabel();
        A_A3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        F_F3 = new javax.swing.JLabel();
        F_E3 = new javax.swing.JLabel();
        F_D3 = new javax.swing.JLabel();
        F_C3 = new javax.swing.JLabel();
        F_B3 = new javax.swing.JLabel();
        F_A3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        K_B3 = new javax.swing.JLabel();
        K_C3 = new javax.swing.JLabel();
        K_E3 = new javax.swing.JLabel();
        K_A3 = new javax.swing.JLabel();
        K_F3 = new javax.swing.JLabel();
        K_D3 = new javax.swing.JLabel();
        G_F3 = new javax.swing.JLabel();
        G_E3 = new javax.swing.JLabel();
        G_D3 = new javax.swing.JLabel();
        G_C3 = new javax.swing.JLabel();
        G_B3 = new javax.swing.JLabel();
        H_A3 = new javax.swing.JLabel();
        H_B3 = new javax.swing.JLabel();
        H_C3 = new javax.swing.JLabel();
        H_D3 = new javax.swing.JLabel();
        H_E3 = new javax.swing.JLabel();
        H_F3 = new javax.swing.JLabel();
        I_F3 = new javax.swing.JLabel();
        I_E3 = new javax.swing.JLabel();
        I_D3 = new javax.swing.JLabel();
        I_C3 = new javax.swing.JLabel();
        I_B3 = new javax.swing.JLabel();
        I_A3 = new javax.swing.JLabel();
        J_F3 = new javax.swing.JLabel();
        J_E3 = new javax.swing.JLabel();
        J_D3 = new javax.swing.JLabel();
        J_C3 = new javax.swing.JLabel();
        J_B3 = new javax.swing.JLabel();
        J_A3 = new javax.swing.JLabel();
        G_A3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        L_F3 = new javax.swing.JLabel();
        L_E3 = new javax.swing.JLabel();
        L_D3 = new javax.swing.JLabel();
        L_C3 = new javax.swing.JLabel();
        L_B3 = new javax.swing.JLabel();
        M_A3 = new javax.swing.JLabel();
        M_B3 = new javax.swing.JLabel();
        M_C3 = new javax.swing.JLabel();
        M_D3 = new javax.swing.JLabel();
        M_E3 = new javax.swing.JLabel();
        M_F3 = new javax.swing.JLabel();
        N_F3 = new javax.swing.JLabel();
        N_E3 = new javax.swing.JLabel();
        N_D3 = new javax.swing.JLabel();
        N_C3 = new javax.swing.JLabel();
        N_B3 = new javax.swing.JLabel();
        N_A3 = new javax.swing.JLabel();
        O_F3 = new javax.swing.JLabel();
        O_E3 = new javax.swing.JLabel();
        O_D3 = new javax.swing.JLabel();
        O_C3 = new javax.swing.JLabel();
        O_B3 = new javax.swing.JLabel();
        O_A3 = new javax.swing.JLabel();
        L_A3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        camptex = new javax.swing.JTextField();
        voltar1 = new javax.swing.JButton();
        rec_nome = new javax.swing.JLabel();
        rec_cpf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        E_B3.setForeground(new java.awt.Color(255, 255, 255));
        E_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(E_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, 40));

        E_C3.setForeground(new java.awt.Color(255, 255, 255));
        E_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(E_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 40, 40));

        E_E3.setForeground(new java.awt.Color(255, 255, 255));
        E_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(E_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 40, 40));

        E_A3.setForeground(new java.awt.Color(255, 255, 255));
        E_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(E_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, 40));

        E_F3.setForeground(new java.awt.Color(255, 255, 255));
        E_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(E_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 40, 40));

        E_D3.setForeground(new java.awt.Color(255, 255, 255));
        E_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(E_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 40, 40));

        A_F3.setForeground(new java.awt.Color(255, 255, 255));
        A_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(A_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 40, 40));

        A_E3.setForeground(new java.awt.Color(255, 255, 255));
        A_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(A_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 40, 40));

        A_D3.setForeground(new java.awt.Color(255, 255, 255));
        A_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(A_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 40, 40));

        A_C3.setForeground(new java.awt.Color(255, 255, 255));
        A_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(A_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 40, 40));

        A_B3.setForeground(new java.awt.Color(255, 255, 255));
        A_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(A_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 40));

        B_A3.setForeground(new java.awt.Color(255, 255, 255));
        B_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(B_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 40));

        B_B3.setForeground(new java.awt.Color(255, 255, 255));
        B_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(B_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 40, 40));

        B_C3.setForeground(new java.awt.Color(255, 255, 255));
        B_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(B_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 40, 40));

        B_D3.setForeground(new java.awt.Color(255, 255, 255));
        B_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(B_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 40, 40));

        B_E3.setForeground(new java.awt.Color(255, 255, 255));
        B_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(B_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 40, 40));

        B_F3.setForeground(new java.awt.Color(255, 255, 255));
        B_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(B_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 40, 40));

        C_F3.setForeground(new java.awt.Color(255, 255, 255));
        C_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(C_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 40, 40));

        C_E3.setForeground(new java.awt.Color(255, 255, 255));
        C_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(C_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 40, 40));

        C_D3.setForeground(new java.awt.Color(255, 255, 255));
        C_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(C_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, 40));

        C_C3.setForeground(new java.awt.Color(255, 255, 255));
        C_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(C_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 40, 40));

        C_B3.setForeground(new java.awt.Color(255, 255, 255));
        C_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(C_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 40, 40));

        C_A3.setForeground(new java.awt.Color(255, 255, 255));
        C_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(C_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 40, 40));

        D_F3.setForeground(new java.awt.Color(255, 255, 255));
        D_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(D_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 40, 40));

        D_E3.setForeground(new java.awt.Color(255, 255, 255));
        D_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(D_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 40, 40));

        D_D3.setForeground(new java.awt.Color(255, 255, 255));
        D_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(D_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 40, 40));

        D_C3.setForeground(new java.awt.Color(255, 255, 255));
        D_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(D_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 40, 40));

        D_B3.setForeground(new java.awt.Color(255, 255, 255));
        D_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(D_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 40, 40));

        D_A3.setForeground(new java.awt.Color(255, 255, 255));
        D_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(D_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 40, 40));

        A_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        jPanel2.add(A_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 40));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setText("F");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 20, 60));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel24.setText("A");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 20, 60));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setText("B");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 20, 60));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setText("C");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 60));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("D");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 20, 60));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel28.setText("E");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 60));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("10");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 240, 20, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("6");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 40, 20, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("7");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 90, 20, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("8");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 140, 20, 40));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("9");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 190, 20, 40));

        F_F3.setForeground(new java.awt.Color(255, 255, 255));
        F_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(F_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 40, 40));

        F_E3.setForeground(new java.awt.Color(255, 255, 255));
        F_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(F_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 40, 40));

        F_D3.setForeground(new java.awt.Color(255, 255, 255));
        F_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(F_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 40, 40));

        F_C3.setForeground(new java.awt.Color(255, 255, 255));
        F_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(F_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 40, 40));

        F_B3.setForeground(new java.awt.Color(255, 255, 255));
        F_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(F_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 40, 40));

        F_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        jPanel2.add(F_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, 40));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("11");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 290, 20, 40));

        K_B3.setForeground(new java.awt.Color(255, 255, 255));
        K_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(K_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 541, 40, 40));

        K_C3.setForeground(new java.awt.Color(255, 255, 255));
        K_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(K_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 541, 40, 40));

        K_E3.setForeground(new java.awt.Color(255, 255, 255));
        K_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(K_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 541, 40, 40));

        K_A3.setForeground(new java.awt.Color(255, 255, 255));
        K_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(K_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 541, 40, 40));

        K_F3.setForeground(new java.awt.Color(255, 255, 255));
        K_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(K_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 541, 40, 40));

        K_D3.setForeground(new java.awt.Color(255, 255, 255));
        K_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(K_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 541, 40, 40));

        G_F3.setForeground(new java.awt.Color(255, 255, 255));
        G_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(G_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 341, 40, 40));

        G_E3.setForeground(new java.awt.Color(255, 255, 255));
        G_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(G_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 341, 40, 40));

        G_D3.setForeground(new java.awt.Color(255, 255, 255));
        G_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(G_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 341, 40, 40));

        G_C3.setForeground(new java.awt.Color(255, 255, 255));
        G_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(G_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 341, 40, 40));

        G_B3.setForeground(new java.awt.Color(255, 255, 255));
        G_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(G_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 341, 40, 40));

        H_A3.setForeground(new java.awt.Color(255, 255, 255));
        H_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(H_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 391, 40, 40));

        H_B3.setForeground(new java.awt.Color(255, 255, 255));
        H_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(H_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 391, 40, 40));

        H_C3.setForeground(new java.awt.Color(255, 255, 255));
        H_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(H_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 391, 40, 40));

        H_D3.setForeground(new java.awt.Color(255, 255, 255));
        H_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(H_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 391, 40, 40));

        H_E3.setForeground(new java.awt.Color(255, 255, 255));
        H_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(H_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 391, 40, 40));

        H_F3.setForeground(new java.awt.Color(255, 255, 255));
        H_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(H_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 391, 40, 40));

        I_F3.setForeground(new java.awt.Color(255, 255, 255));
        I_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(I_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 441, 40, 40));

        I_E3.setForeground(new java.awt.Color(255, 255, 255));
        I_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(I_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 441, 40, 40));

        I_D3.setForeground(new java.awt.Color(255, 255, 255));
        I_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(I_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 441, 40, 40));

        I_C3.setForeground(new java.awt.Color(255, 255, 255));
        I_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(I_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 441, 40, 40));

        I_B3.setForeground(new java.awt.Color(255, 255, 255));
        I_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(I_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 441, 40, 40));

        I_A3.setForeground(new java.awt.Color(255, 255, 255));
        I_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(I_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 441, 40, 40));

        J_F3.setForeground(new java.awt.Color(255, 255, 255));
        J_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(J_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 491, 40, 40));

        J_E3.setForeground(new java.awt.Color(255, 255, 255));
        J_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(J_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 491, 40, 40));

        J_D3.setForeground(new java.awt.Color(255, 255, 255));
        J_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(J_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 491, 40, 40));

        J_C3.setForeground(new java.awt.Color(255, 255, 255));
        J_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(J_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 491, 40, 40));

        J_B3.setForeground(new java.awt.Color(255, 255, 255));
        J_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(J_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 491, 40, 40));

        J_A3.setForeground(new java.awt.Color(255, 255, 255));
        J_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(J_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 491, 40, 40));

        G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        jPanel2.add(G_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 341, 40, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("16");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 541, 20, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("12");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 341, 20, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("13");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 391, 20, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("14");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 441, 20, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("15");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 491, 20, 40));

        L_F3.setForeground(new java.awt.Color(255, 255, 255));
        L_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(L_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 587, 40, 40));

        L_E3.setForeground(new java.awt.Color(255, 255, 255));
        L_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(L_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 587, 40, 40));

        L_D3.setForeground(new java.awt.Color(255, 255, 255));
        L_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(L_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 587, 40, 40));

        L_C3.setForeground(new java.awt.Color(255, 255, 255));
        L_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(L_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 587, 40, 40));

        L_B3.setForeground(new java.awt.Color(255, 255, 255));
        L_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(L_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 587, 40, 40));

        M_A3.setForeground(new java.awt.Color(255, 255, 255));
        M_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(M_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 637, 40, 40));

        M_B3.setForeground(new java.awt.Color(255, 255, 255));
        M_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(M_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 637, 40, 40));

        M_C3.setForeground(new java.awt.Color(255, 255, 255));
        M_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(M_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 637, 40, 40));

        M_D3.setForeground(new java.awt.Color(255, 255, 255));
        M_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(M_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 637, 40, 40));

        M_E3.setForeground(new java.awt.Color(255, 255, 255));
        M_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(M_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 637, 40, 40));

        M_F3.setForeground(new java.awt.Color(255, 255, 255));
        M_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(M_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 637, 40, 40));

        N_F3.setForeground(new java.awt.Color(255, 255, 255));
        N_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(N_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 687, 40, 40));

        N_E3.setForeground(new java.awt.Color(255, 255, 255));
        N_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(N_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 687, 40, 40));

        N_D3.setForeground(new java.awt.Color(255, 255, 255));
        N_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(N_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 687, 40, 40));

        N_C3.setForeground(new java.awt.Color(255, 255, 255));
        N_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(N_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 687, 40, 40));

        N_B3.setForeground(new java.awt.Color(255, 255, 255));
        N_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(N_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 687, 40, 40));

        N_A3.setForeground(new java.awt.Color(255, 255, 255));
        N_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(N_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 687, 40, 40));

        O_F3.setForeground(new java.awt.Color(255, 255, 255));
        O_F3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(O_F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 737, 40, 40));

        O_E3.setForeground(new java.awt.Color(255, 255, 255));
        O_E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(O_E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 737, 40, 40));

        O_D3.setForeground(new java.awt.Color(255, 255, 255));
        O_D3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(O_D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 737, 40, 40));

        O_C3.setForeground(new java.awt.Color(255, 255, 255));
        O_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(O_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 737, 40, 40));

        O_B3.setForeground(new java.awt.Color(255, 255, 255));
        O_B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(O_B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 737, 40, 40));

        O_A3.setForeground(new java.awt.Color(255, 255, 255));
        O_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        jPanel2.add(O_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 737, 40, 40));

        L_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon.png"))); // NOI18N
        G_A3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva_passagens_completo/poltrona_icon_2.png"))); // NOI18N
        jPanel2.add(L_A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 587, 40, 40));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("17");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 587, 20, 40));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("18");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 637, 20, 40));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("19");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 687, 20, 40));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("20");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 737, 20, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1200, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 400, 820));

        jButton1.setText("RESERVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 100, 30));

        camptex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camptexActionPerformed(evt);
            }
        });
        getContentPane().add(camptex, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 90, 30));

        voltar1.setText("VOLTAR");
        voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar1ActionPerformed(evt);
            }
        });
        getContentPane().add(voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 100, -1));
        getContentPane().add(rec_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 220, 40));
        getContentPane().add(rec_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        if(camptex.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "INFORME UM LOCAL!");   
        }else{
            Voo_Reservado v2= new Voo_Reservado();
            v2.setNome(rec_nome.getText());
            v2.setOrigem("São Luís");
            v2.setDestino("Brasilia");
            v2.setData("23/09");
            v2.setHora("13:45");
            v2.setClasse("Classe Economica");
            for(i=6; i<21;i++){
                for(j=1; j<7; j++){
                    if(mat2[i][j].equals(camptex.getText())){
                        map.setPoltrona(camptex.getText());
                        map.Reservar(i, j,v2);
                        ok=true;
                        j=8;
                        i=21;
                    }
                    
                             
                             
                    
                }
            }
        }
        if (ok==false)
        {
            JOptionPane.showMessageDialog(null, "ESSA POLTRONA NÃO ESTA DISPONÍVEL PARA CLASSE ECONÔMICA");
        }
                                      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar1ActionPerformed
 JF_tela_reservar res= new JF_tela_reservar();
        res.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_voltar1ActionPerformed

    private void camptexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camptexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camptexActionPerformed

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
            java.util.logging.Logger.getLogger(Poltronas_reservar_economica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Poltronas_reservar_economica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Poltronas_reservar_economica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Poltronas_reservar_economica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Poltronas_reservar_economica().setVisible(true);
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
    private javax.swing.JLabel A_A3;
    private javax.swing.JLabel A_B3;
    private javax.swing.JLabel A_C3;
    private javax.swing.JLabel A_D3;
    private javax.swing.JLabel A_E3;
    private javax.swing.JLabel A_F3;
    private javax.swing.JLabel B_A3;
    private javax.swing.JLabel B_B3;
    private javax.swing.JLabel B_C3;
    private javax.swing.JLabel B_D3;
    private javax.swing.JLabel B_E3;
    private javax.swing.JLabel B_F3;
    private javax.swing.JLabel C_A3;
    private javax.swing.JLabel C_B3;
    private javax.swing.JLabel C_C3;
    private javax.swing.JLabel C_D3;
    private javax.swing.JLabel C_E3;
    private javax.swing.JLabel C_F3;
    private javax.swing.JLabel D_A3;
    private javax.swing.JLabel D_B3;
    private javax.swing.JLabel D_C3;
    private javax.swing.JLabel D_D3;
    private javax.swing.JLabel D_E3;
    private javax.swing.JLabel D_F3;
    private javax.swing.JLabel E_A3;
    private javax.swing.JLabel E_B3;
    private javax.swing.JLabel E_C3;
    private javax.swing.JLabel E_D3;
    private javax.swing.JLabel E_E3;
    private javax.swing.JLabel E_F3;
    private javax.swing.JLabel F_A3;
    private javax.swing.JLabel F_B3;
    private javax.swing.JLabel F_C3;
    private javax.swing.JLabel F_D3;
    private javax.swing.JLabel F_E3;
    private javax.swing.JLabel F_F3;
    private javax.swing.JLabel G_A3;
    private javax.swing.JLabel G_B3;
    private javax.swing.JLabel G_C3;
    private javax.swing.JLabel G_D3;
    private javax.swing.JLabel G_E3;
    private javax.swing.JLabel G_F3;
    private javax.swing.JLabel H_A3;
    private javax.swing.JLabel H_B3;
    private javax.swing.JLabel H_C3;
    private javax.swing.JLabel H_D3;
    private javax.swing.JLabel H_E3;
    private javax.swing.JLabel H_F3;
    private javax.swing.JLabel I_A3;
    private javax.swing.JLabel I_B3;
    private javax.swing.JLabel I_C3;
    private javax.swing.JLabel I_D3;
    private javax.swing.JLabel I_E3;
    private javax.swing.JLabel I_F3;
    private javax.swing.JLabel J_A3;
    private javax.swing.JLabel J_B3;
    private javax.swing.JLabel J_C3;
    private javax.swing.JLabel J_D3;
    private javax.swing.JLabel J_E3;
    private javax.swing.JLabel J_F3;
    private javax.swing.JLabel K_A3;
    private javax.swing.JLabel K_B3;
    private javax.swing.JLabel K_C3;
    private javax.swing.JLabel K_D3;
    private javax.swing.JLabel K_E3;
    private javax.swing.JLabel K_F3;
    private javax.swing.JLabel L_A3;
    private javax.swing.JLabel L_B3;
    private javax.swing.JLabel L_C3;
    private javax.swing.JLabel L_D3;
    private javax.swing.JLabel L_E3;
    private javax.swing.JLabel L_F3;
    private javax.swing.JLabel M_A3;
    private javax.swing.JLabel M_B3;
    private javax.swing.JLabel M_C3;
    private javax.swing.JLabel M_D3;
    private javax.swing.JLabel M_E3;
    private javax.swing.JLabel M_F3;
    private javax.swing.JLabel N_A3;
    private javax.swing.JLabel N_B3;
    private javax.swing.JLabel N_C3;
    private javax.swing.JLabel N_D3;
    private javax.swing.JLabel N_E3;
    private javax.swing.JLabel N_F3;
    private javax.swing.JLabel O_A3;
    private javax.swing.JLabel O_B3;
    private javax.swing.JLabel O_C3;
    private javax.swing.JLabel O_D3;
    private javax.swing.JLabel O_E3;
    private javax.swing.JLabel O_F3;
    private javax.swing.JTextField camptex;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rec_cpf;
    private javax.swing.JLabel rec_nome;
    private javax.swing.JButton voltar1;
    // End of variables declaration//GEN-END:variables
}
