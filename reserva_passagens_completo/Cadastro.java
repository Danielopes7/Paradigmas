/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva_passagens_completo;

import java.util.ArrayList;

/**
 *
 * @author Carlos Silva
 */
public class Cadastro{
    protected String nome;
    protected String idade;
    protected String tel;
    protected String cartaocredito;
    protected String cpf;
    protected String senha;
    static ArrayList<Cadastro> pessoas=new ArrayList<Cadastro>(); 
   

    public Cadastro(){
    }

    public static ArrayList<Cadastro> getPessoas() {
        return pessoas;
    }

    public static void setPessoas(ArrayList<Cadastro> pessoas) {
        Cadastro.pessoas = pessoas;
    }
    
    public void adiciona(Object p){
        pessoas.add((Cadastro) p);
    }
    
    public void mostra()
    {
        System.out.println("NOME : "+this.getNome()+"\nIDADE : "+this.getIdade()+"\nTELEFONE : "+this.getTel()
                            +"\nCartao de Credito : "+this.getCartaocredito()+"\nCPF : "+this.getCpf()); 
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCartaocredito() {
        return cartaocredito;
    }

    public void setCartaocredito(String cartaocredito) {
        this.cartaocredito = cartaocredito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}

