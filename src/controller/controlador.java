/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import model.modelo;
 import view.vista;
 /**
  * @web http://jc-mouse.blogspot.com/
 * @author David Diaz Aguilar
  */
public class controlador implements ActionListener{

     private vista vista;
     private modelo modelo;
     private int number;
 
     //En el constructor inicializamos nuestros objetos y tambien
     //añadimos el ActionListener al boton "cmdsumar" de la VISTA
     public controlador( vista vista , modelo modelo){
         this.vista = vista;
         this.modelo = modelo;
         this.vista.cmdSumar.addActionListener(this);
     }
 
     //Inicia los valores del jFrame VISTA con los datos del MODELO
     public void iniciar_vista(){
         vista.setTitle( "Demo MVC * jc-mouse.net" );
         vista.setLocationRelativeTo(null);
         vista.vText1.setText( String.valueOf(modelo.get_valor1()) );
         vista.vText2.setText( String.valueOf(modelo.get_valor2()) );
         vista.vText3.setText( String.valueOf(modelo.get_total()) );
     }
 
     //La accion del boton de la VISTA es capturado, asi como los valores de
     //los jtextbox, entonces se realiza la funcion SUMAR y se actualiza
     //el jtextbox correspondiente al resultado
    public void actionPerformed(ActionEvent e) {
         modelo.set_valor1( Integer.valueOf( vista.vText1.getText() ) );
         modelo.set_valor2( Integer.valueOf( vista.vText2.getText() ) );
         modelo.sumar();
         vista.vText3.setText( String.valueOf(modelo.get_total()) );
     }
}