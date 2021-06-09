package Util;

import Util.Fila;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManiArquivo {
    public static String[] lerArquivo(String arquivo){
        Fila<String> fila = new Fila<>();

        try{
           String linha;
           FileReader file = new FileReader(arquivo);
           BufferedReader ler = new BufferedReader(file);
           
           do{
               linha = ler.readLine();
               if (linha != null) 
                   fila.adicionar(linha);
           }while(linha != null);
           
           
        }catch(IOException e){}
        String[] dados = new String[fila.getTamanho()];
        
        for (int i = 0; i < dados.length; i++){
            dados[i] = fila.remover();
        }
        return dados;
    }
}
