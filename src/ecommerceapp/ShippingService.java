/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerceapp;

/**
 *
 * @author omarm
 */
public class ShippingService {
    private double pricePerUnitWeight ;
    
    public ShippingService (double pricePerUnitWeight){
        this.pricePerUnitWeight = pricePerUnitWeight ;
    }
   
    public double calculateShippingFees(Cart cart) {
        double shippingFees = 0 ;
        for (CartItem item : cart.getItems())
            if (item.getProduct() instanceof Shippable)
                shippingFees += ((Shippable) item.getProduct()).getWeight()*pricePerUnitWeight ;
        
        return shippingFees ;
    }

   public void printShippingNotice(Cart cart ){
       System.out.println("    Shipment notice     ");
       
       double totalWeight = 0 ;
       for (CartItem item : cart.getItems())
           if (item.getProduct() instanceof  Shippable ){
               double weight = ((Shippable) item.getProduct()).getWeight() * item.getQuantity() ;
               totalWeight += weight ;
                System.out.printf("%2dx %-17s %10.0fg\n", item.getQuantity(), item.getProduct().getName(), weight);
           }
       
       System.out.println("Totla Weight "+ totalWeight );
   }
    
}
