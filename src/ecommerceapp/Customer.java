/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerceapp;

/**
 *
 * @author omarm
 */
public class Customer {
    private String name ;
    private double  balance ;
    private Cart cart ;
    
    public Customer (String name ,double balance) {
        this.name = name ;
        this.balance = balance ;
        this.cart = new Cart (); 
    }
    
    
    public void addToCart(Product product , int quantity) {
        cart.addItem(product, quantity);
    }
    
    
    public void checkout(ShippingService shippingService){
        if (cart.isEmpty()) throw new IllegalStateException("your Cart is Empty") ;
        
        double subtotal = cart.calculateItemsTotalPrice() ;
        double shippingFees = shippingService.calculateShippingFees(cart) ;
        double total = subtotal +shippingFees ;
        
        
        if (balance < total )throw new IllegalStateException("you don't have enough money") ;
        
        for (CartItem item : cart.getItems())
            item.getProduct().reduceQuantityBy(item.getQuantity());
        
        balance -= total ;
        
        if (shippingFees > 0) 
            shippingService.printShippingNotice(cart) ; 
        
        System.out.println("    checkout receipt    ");
        
        for (CartItem item : cart.getItems())
            System.out.printf("%2dx %-18s %10.2f\n", item.getQuantity(), item.getProduct().getName(), item.getTotalPrice());
  
        System.out.println("---------------------------------");
        System.out.printf("%-22s %10.2f\n", "Subtotal", subtotal);
        System.out.printf("%-22s %10.2f\n", "Shipping", shippingFees);
        System.out.printf("%-22s %10.2f\n", "Amount", total);
   
    
    }
}
