/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoarreglosymatrices;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class RepasoArreglosYMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglo de nombres
        String estudiantes[] =new String[4];
        
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i]="Estudiante"+i;
        }
        StringBuilder resultado=new StringBuilder();
        for (int i = 0; i < estudiantes.length; i++) {
            resultado.append(estudiantes[i] + "\n");
        }
        JOptionPane.showConfirmDialog(null, resultado);
        int notas [][] = new int [4][3];
        
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                Random numeroAleatorio = new Random();
                notas[i][j]=numeroAleatorio.nextInt(0, 100);
            }
        }
        resultado = new StringBuilder();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j]==68 || notas[i][j]==69)
                    notas[i][j]=70;
                resultado.append(notas[i][j]+ "-");
            }
            resultado.append("\n");
        }
        JOptionPane.showConfirmDialog(null, resultado);
        
        
        // voy a combinar el vector y la matriz
        resultado = new StringBuilder();
        for (int i = 0; i < notas.length; i++) {
            resultado.append(estudiantes[i] + ":");
            for (int j = 0; j < notas[i].length; j++) {
                resultado.append(notas[i][j]+ "-");
            }
            resultado.append("\n");
        }
        JOptionPane.showConfirmDialog(null, resultado);
        
    }
    
}
