/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerceapp;
import java.util.* ;
/**
 *
 * @author omarm
 */
public class Cart {
    private  List<CartItem> items = new ArrayList<> () ;
    
    public Cart (){
        
    }
    
    public void addItem (Product product , int quantity){
        items.add(new CartItem(product, quantity) ) ;
    }
    
    public double calculateItemsTotalPrice(){
        double total = 0 ;
        for(CartItem item : items){
            total += item.getTotalPrice() ;
        }
        return total ;
    }
    
    public List<CartItem> getItems() {
        return items ;
    }
    public boolean isEmpty(){
        return  items.isEmpty() ;
    }
}
