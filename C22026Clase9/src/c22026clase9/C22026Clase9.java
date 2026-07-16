/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22026clase9;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22026Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear un vector de carros
        Carro carros[] = new Carro[2];
        // siempre hay que inicializar o instanciar los objetos del vector con el new
        carros[0]=new Carro("456", "Geely", "Nose", 10000000);
        carros[1]=new Carro("123", "Toyo", "Prado", 3000000);
        //carros[2]=new Carro("456", "Geely", "Nose");//da error java.lang.ArrayIndexOutOfBoundsException
        
        JOptionPane.showMessageDialog(null, carros[1].toString());
        
        for (int i = 0; i < carros.length; i++) {
            JOptionPane.showMessageDialog(null, carros[i].tocarBocina());
        }
        
        for (int i = 0; i < carros.length; i++) {
            JOptionPane.showMessageDialog(null, carros[i].toString());
        }
         
        //impreme todas las marcas y modelos
        StringBuilder imp = new StringBuilder();
        for (int i = 0; i < carros.length; i++) {
            imp.append(carros[i].getMarca() + "-" + carros[i].getModelo() + "\n" );
        }
        JOptionPane.showMessageDialog(null, imp);
        
        /* codigo que da error por nullpointer  pq no se instanciaron todos los objetos del vector
        Carro carros2[] = new Carro[3]; 
        carros2[0]=new Carro("456", "Geely", "Nose", 10000000);
        carros2[1]=new Carro("123", "Toyo", "Prado", 3000000);
        for (int i = 0; i < carros2.length; i++) {
            JOptionPane.showMessageDialog(null, carros2[i].tocarBocina()); // esta linea falla pq no esta inicializada // da nullpointer exception
        }
        */
        
        
        Carro carros3[] = new Carro[3]; 
        for (int i = 0; i < carros3.length; i++) {
            String modelo= JOptionPane.showInputDialog("Digite el modelo");
            String marca= JOptionPane.showInputDialog("Digite el marca");
            String placa= JOptionPane.showInputDialog("Digite el placa");
            double precio=0.0;
            String precioString = JOptionPane.showInputDialog("Digite el precio");
            precio= Double.parseDouble(precioString);
            carros3[i]=new Carro(placa, marca, modelo, precio);
        }
        
        imp= new StringBuilder(); // limpia le objeto
        for (int i = 0; i < carros3.length; i++) {
            imp.append(carros3[i].toString());
            imp.append("\n");
        }
        JOptionPane.showMessageDialog(null, imp);
        
        
        
    }
    
}
