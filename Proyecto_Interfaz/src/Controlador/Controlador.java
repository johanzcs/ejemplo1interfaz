/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Vehiculo;
import Vista.Formulario_Registro_Vehiculo;
public class Controlador {
    private Vehiculo objVehiculo;
    private Formulario_Registro_Vehiculo objFormulario;
    
    public Controlador(){
        this.objVehiculo = new Vehiculo ();
        this.objFormulario = new Formulario_Registro_Vehiculo();
    }
}
