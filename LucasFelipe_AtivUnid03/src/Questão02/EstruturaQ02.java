
package Questão02;

import Util.ManiArquivo;

public class EstruturaQ02 {
    
    public static void lista(){
        // iniciando a leitura do arquivo 
        String arquivo = "src\\Entrada\\dadosQ02.txt";
        String[] convert = ManiArquivo.lerArquivo(arquivo);
        
        
        //segmento do codigo destinado a entrada dos dados
        System.out.print("Entrada: \n");
        for(int i = 0; i < convert.length; i++){
            System.out.print(convert[i]);
            if(convert[i] != null){
                System.out.print(">"); 
            }
        } 
        
        System.out.println("\n----------------------------\n");

        //segmento do codigo destinado a saida dos dados
        int cont = 0;
        
        for(int i = 0; i < convert.length; i++){
            if(Integer.parseInt(convert[i]) == 1)
                cont++;
        }
        System.out.println("Saída: \n| Quantidade de 1s: "+ cont);
        
        
    }
}
