/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22026clase9;

/**
 *
 * @author viti
 */
public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    //private Persona owener;
    private double precio;

    public Carro(String placa, String marca, String modelo, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }

    public String tocarBocina(){
        String resultado = "bee";
        if (this.modelo.equals("Nose")){
            resultado= "peee";
        }
        return  resultado;
        
    }
    
    
}
