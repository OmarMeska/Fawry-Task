/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerceapp;

import java.time.LocalDate;

/**
 *
 * @author omarm
 */
public class ShippableProduct extends Product implements  Shippable{
   private double weight ;

   public ShippableProduct (String name ,double price , int quantity , boolean  isExpire , LocalDate expireDate , double weight){
       super(name ,price ,quantity ,isExpire ,expireDate);
       this .weight= weight ;
   }   
   
   @Override 
   public double getWeight(){
       return weight ;
   }
   
   public void setWeight (double weight) {
       this.weight = weight ;
   }
   
}
