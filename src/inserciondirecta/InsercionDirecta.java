/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inserciondirecta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juan
 */
public class InsercionDirecta {
    
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

         public static void insercionDirecta(int A[]){                                            
    int p, j;
    int aux;
    for (p = 1; p < A.length; p++){ // desde el segundo elemento hasta
              aux = A[p];           // el final, guardamos el elemento y
              j = p - 1;            // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < A[j])){ // mientras queden posiciones y el                                
                                                // valor de aux sea menor que los
                             A[j + 1] = A[j];   // de la izquierda, se desplaza a
                             j--;               // la derecha
              }
              A[j + 1] = aux;       // colocamos aux en su sitio
    }
}

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      int n;
      int A [] = new int [5];
      
        System.out.println("Ingrese la dimension del arreglo: ");
        entrada = bufer.readLine();
        n = Integer.parseInt(entrada);
        
        for (int i = 0; i<A.length; i++){
            System.out.println("[" +i+ "]:  ");
            entrada = bufer.readLine();
            A[i] = Integer.parseInt(entrada);
        }
        
        insercionDirecta(A);
        
        System.out.println("Numero ordenados: ");
        for (int i = 0; i<A.length; i++){
            System.out.println("    [" +i+ "]:   " + A[i]);
    }
            
        
            }
}
  
    
    
        
