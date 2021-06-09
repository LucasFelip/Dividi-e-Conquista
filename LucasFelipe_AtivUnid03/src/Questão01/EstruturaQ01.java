package Questão01;

import Util.ManiArquivo;

public class EstruturaQ01 {
    
    public static void vetor(){
        
        // iniciando a leitura do arquivo 
        String arquivo = "src\\Entrada\\dadosQ01.txt";
        String[] convert = ManiArquivo.lerArquivo(arquivo);
        
        
        //segmento do codigo destinado a entrada dos dados
        System.out.print("Entrada: \n[ ");
        for(int i = 0; i < convert.length; i++){
            System.out.print(convert[i]);
            if(convert[i] != null)
                System.out.print(", ");
        } 
        System.out.println("]");
        
        
        System.out.println("\n----------------------------\n");
        
        
        //segmento do codigo destinado a saida dos dados
        int maior = 0, menor = 999999999;
        
        for(int i = 0; i < convert.length; i++){
            if(Integer.parseInt(convert[i]) > maior)
                maior = Integer.parseInt(convert[i]);
            
            if(Integer.parseInt(convert[i]) < menor)
                menor = Integer.parseInt(convert[i]);      
        }
        
        System.out.println("Saída: \n| Maior valor: "+ maior +"\n| Menor valor: "+menor);
    }
    
}
