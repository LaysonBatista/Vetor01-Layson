/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author aluno
 */
public class Vetor01 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String s ="";
        float nota1 = 0; float nota2 = 0; float meadia = 0;
        DataInputStream dado;
        System.out.println("Entre com a nota 1: ");
        dado = new DataInputStream(System.in);
        
        s = dado.readLine();
        nota1 = Float.parseFloat(s);
        System.out.println("Entre com a nota 2: ");
        s = dado.readLine();
        nota2 = Float.parseFloat(s);
        
        float media = (nota1+nota2)/2;
        System.out.println("Média: " + media);
        
         float[] notas = new float[3];
         notas[1] = nota1;
         notas[2] = nota2;
       
         for (int i = 1; i < notas.length; i++){
             System.out.println("nota"+ i +": " + notas[i]);
        
         }
        
        
        
       
                
    }
    
}
