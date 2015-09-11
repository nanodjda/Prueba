/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_example;

import controller.controlador;
 import model.modelo;
 import view.vista;
 /**
 *  @web http://jc-mouse.blogspot.com/
  * @author Mouse
  */
 public class MVC_Example {
     
     public static void main(String[] args) {
 
         //nuevas instancias de clase
         modelo modelo = new modelo();
         vista vista = new vista();        
         controlador controlador = new controlador( vista , modelo );
         //se inicia la vista
         controlador.iniciar_vista();
 
         vista.setVisible(true);
 
     }
 
 }