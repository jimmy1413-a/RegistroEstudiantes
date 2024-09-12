/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.principal;

import ufps.controlador.Controlador;
import ufps.modelo.Estudiante;
import ufps.vista.VerEstudiante;

/**
 *
 * @author deton
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
    VerEstudiante v = new VerEstudiante();
    Controlador c = new Controlador(e,v);
    v.setVisible(true);
    }
    
}
