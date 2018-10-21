package reserva_passagens_completo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Arquivo {
   
    public static String Read(String Caminho){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    
                    conteudo += linha+"&;";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write(String Caminho,String nome, String cpf, String cartao, String telefone, String idade, String senha){
        try {
            FileWriter arq = new FileWriter(Caminho,true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(nome+";"+cpf+";"+cartao+";"+telefone+";"+idade+";"+senha+";");
            gravarArq.close();
            arq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
       public static boolean Write2(String Caminho,String vet[][]){
           int i,j;
        try {
            FileWriter arq = new FileWriter(Caminho,false);
            PrintWriter gravarArq = new PrintWriter(arq);
            for(i=1; i<21; i++){
                for(j=1; j<7; j++){
                    gravarArq.printf(vet[i][j]+";");
                }
            }
            gravarArq.close();
            arq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
        public static boolean Write3(String Caminho,String nome, String pol,String classe, String data, String hora, String origem, String destino){
        try {
            FileWriter arq = new FileWriter(Caminho,true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(nome+";"+pol+";"+classe+";"+data+";"+hora+";"+origem+";"+destino+";");
            gravarArq.close();
            arq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
