/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche() {
        super(); // Llama al constructor de la clase base
        this.numeroPuertas = 4; // Valor por defecto
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
   

    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase base
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}
