/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva_passagens_completo;

/**
 *
 * @author Carlos Silva
 */
public class CarregaArray {
    Cadastro p= new Cadastro();
    Voo_Reservado v= new Voo_Reservado();
    Arquivo arq= new Arquivo();
    String nome_arquivo= "banco_cadastro.txt";
    String test=Arquivo.Read(nome_arquivo);
    String nome_arquivo1= "voos.txt";
    String test1=Arquivo.Read(nome_arquivo1);
    int cont1=0,cont2=0,i=0;

    public CarregaArray() {
    }
    
       public void preencher(Cadastro p){
        while (!test.split(";")[cont1].equals("&") && !test.equals("&;") && test.isEmpty()==false){
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
     }
        public void preenchervoo(Voo_Reservado v){
        while (!test1.split(";")[cont2].equals("&") && !test1.equals("&;") && test1.isEmpty()==false){
                     v.setNome(test1.split(";")[cont2]);
                     cont2++;
                     
                     v.setPoltrona(test1.split(";")[cont2]);
                     cont2++;
                     
                     v.setClasse(test1.split(";")[cont2]);
                     cont2++;
                     
                    v.setData(test1.split(";")[cont2]);
                     cont2++;
                     
                     v.setHora(test1.split(";")[cont2]);
                     cont2++;
                  
                     v.setOrigem(test1.split(";")[cont2]);
                     cont2++;
                     
                     v.setDestino(test1.split(";")[cont2]);
                     cont2++;
                     
                     v.adiciona(v);
                     
        }
     }
         
} 

