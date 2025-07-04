
package ecommerceapp;

import java.time.LocalDate;



public class Product {
    private String name ;
    private double price ; 
    private int quantity ;
    private boolean isExpire ;
    private LocalDate expireDate ;
    
    public Product() {} 
    
    public Product(String name ,
                   double price ,
                   int quantity ,
                   boolean isExpire,
                   LocalDate expireDate) 
    {
        this.name = name ;
        this.price = price ;
        this.quantity =quantity ;
        this .isExpire = isExpire ;
        this .expireDate = isExpire ? expireDate : null ;
    }
    
    public int getQuantity(){
        return quantity ;
    }
    
    public void reduceQuantityBy(int quantity){
        this.quantity -= quantity ;
    }
    
    public double getPrice (){
        return price ;
    }

    public String getName () {
        return name ;
    }    
    
    public boolean isExpired(){
        return LocalDate.now().isAfter(expireDate) ;
    }
    
}
