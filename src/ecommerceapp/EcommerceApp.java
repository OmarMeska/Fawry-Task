package ecommerceapp;

import java.time.LocalDate;
import java.time.Month;


public class EcommerceApp {

    public static void main(String[] args) {
   
        
        Product TV = new ShippableProduct ("TV" , 1000.0 , 5 , false ,null ,500) ;
        
        Product cheese = new Product("Cheese" ,15.5  , 5,true,LocalDate.of(2025, Month.MARCH, 5)) ;
      
        Product scratchCard = new Product("Scratch Card" ,10.0,5 ,false ,null) ;
        
        Customer Omar = new Customer ("Omar",5000);
        
        ShippingService shippingService = new ShippingService(.05) ;
        
        Omar.addToCart(cheese, 1);
        Omar.addToCart(TV, 3);
        Omar.addToCart(scratchCard, 5);
        
        Omar.checkout(shippingService);
    
    }
       
}
