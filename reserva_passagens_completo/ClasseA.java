/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva_passagens_completo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Silva
 */
public class ClasseA{
    
    protected int reservadas;
    protected int disponiveis;
    protected String precopassagem;
    static String poltrona;
    Arquivo mapaA= new Arquivo();
    Arquivo voo= new Arquivo();
    Voo_Reservado v= new Voo_Reservado();
    String caminho2= "voos.txt";
    String caminho= "classeA.txt";
    String test=Arquivo.Read(caminho);
    int cont1=0;
    static String vet[][]= new String [21][7];
    String aux;
    int i=1,j=1;
    boolean s=false;
    public void marcamapa(){
        while (!test.split(";")[cont1].equals("&") && !test.equals("&;") && test.isEmpty()==false){
                     vet[i][j]=(( test.split(";")[cont1]));
                     System.out.print(vet[i][j]+" ");
                     j++;
                     if(j==7){
                         i++;
                         j=1;
                         System.out.println("");
                         
                     }
                     cont1++; 
                    
        }
       
    }
    
    /**
     *
     * @param m
     * @param n
     * @param v
     */
    public void Reservar(int m, int n, Voo_Reservado v){
        
        if(vet[m][n].equals("false")){
        vet[m][n]="true";
        Arquivo.Write3(caminho2,v.getNome(),poltrona,v.getClasse(),v.getData(),v.getHora(),v.getOrigem(),v.getDestino());
        Arquivo.Write2(caminho,vet);
             JOptionPane.showMessageDialog(null, "POLTRONA "+ poltrona+" RESERVADA COM SUCESSO!");
        }else{
                JOptionPane.showMessageDialog(null, "LOCAL JA RESERVADO!");
        }
    
        
    }

    public int getReservadas() {
        return reservadas;
    }

    public void setReservadas(int reservadas) {
        this.reservadas = reservadas;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;
    }

    public String getPrecopassagem() {
        return precopassagem;
    }

    public void setPrecopassagem(String precopassagem) {
        this.precopassagem = precopassagem;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public static String[][] getVet() {
        return vet;
    }

    public static void setVet(String[][] vet) {
        ClasseA.vet = vet;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }
    
    
}
