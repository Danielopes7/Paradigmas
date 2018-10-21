/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva_passagens_completo;

import java.util.ArrayList;


public class Voo_Reservado {
    protected String nome;
    protected String poltrona;
    protected String data;
    protected String hora;
    protected String preco;
    protected String destino;
    protected String origem;
    protected String classe;
    static ArrayList<Voo_Reservado> voos=new ArrayList<Voo_Reservado>(); 

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
 
   
   
     public void adiciona(Object voo){
        voos.add((Voo_Reservado) voo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public static ArrayList<Voo_Reservado> getVoos() {
        return voos;
    }

    public static void setVoos(ArrayList<Voo_Reservado> voos) {
        Voo_Reservado.voos = voos;
    }
   
   
    
}
