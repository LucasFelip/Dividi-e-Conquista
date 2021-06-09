/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

import Util.ManiArquivo;

/**
 *
 * @author Inspion
 */
public class EstruturaQ03 {
    
    public static String prefixo(String[] strs) {
        if(strs==null||strs.length==0)
            return "";
        return divCon(0,strs.length-1,strs);
    }
    
    public static String divCon(int left,int right,String[] strs){
        if(left==right)
            return strs[left];
        
        int mid = (right-left)/2+left;

        String lefts = divCon(left,mid,strs);
        String rights = divCon(mid+1,right,strs);

        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<(lefts.length()<rights.length()?lefts.length():rights.length());i++){
            if(lefts.charAt(i)!=rights.charAt(i))
                break;
            sb.append(lefts.charAt(i));
        }
        return sb.toString();
    }

    public static void lcd(){
        String arquivo = "src\\Entrada\\dadosQ03.txt";
        String[] convert = ManiArquivo.lerArquivo(arquivo);
        
        System.out.print("Entrada: \n");
        for(int i = 0; i < convert.length; i++){
            System.out.print(convert[i]);
            if(convert[i] != null){
                System.out.print(", "); 
            }
        }
        
        String p = prefixo(convert);
        System.out.println("\n\n----------------------------\n");
        System.out.println("O prefixo comum mais longo é "+ p);
    }
}
