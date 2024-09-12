/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufps.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufps.modelo.Estudiante;
import ufps.vista.VerEstudiante;
/**
 *
 * @author deton
 */
public class Controlador implements ActionListener{
     private Estudiante estudiante = null;
     private VerEstudiante vista = null;
     
     public Controlador(Estudiante estudiante,VerEstudiante vista){
         super();
         this.estudiante = estudiante;
         this.vista = vista;
         actionListener(this);
     }
     
     public void actionListener(ActionListener controlador){
         vista.btnAgregar.addActionListener(controlador);
         vista.btnMostrar.addActionListener(controlador);
         
     }

    @Override
    public void actionPerformed(ActionEvent evento) {
       try{
           if(evento.getActionCommand().contentEquals("Agregar")){
               String codigo = this.vista.txtCodigo.getText();
               String nombre = this.vista.txtNombre.getText();
               String apellido = this.vista.txtApellido.getText();
               String direccion = this.vista.txtDireccion.getText();
               String telefono = this.vista.txtTelefono.getText();
               
               estudiante.setCodigo(codigo);
               estudiante.setNombre(nombre);
               estudiante.setApellido(apellido);
               estudiante.setDireccion(direccion);
               estudiante.setTelefono(telefono);
           }else if(evento.getActionCommand().contentEquals("Mostrar")){
               vista.areaMostrar.setText(estudiante.nombreCompleto());
               
           }
       }catch(Exception e){
           e.printStackTrace();
       }
    }
     
     
}
