/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author David
 */
public class modelo {
    //Variables
     private int valor1=28;
     private int valor2=69;
     private int total = sumar();
 
     public modelo(){}
 
     public void set_valor1(int val){
         this.valor1=val;
     }
 
     public int get_valor1(){
         return this.valor1;
     }
 
     public void set_valor2(int val){
         this.valor2=val;
     }
 
     public int get_valor2(){
         return this.valor2;
     }
 
     public int sumar(){
         this.total =  this.valor1 + this.valor2;
         return this.total;
     }
 
     public int get_total(){
         return this.total;
     }
}
