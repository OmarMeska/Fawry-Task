package ecommerceapp;


public class CartItem {
    private Product product ;
    private int quantity ;
    
    public CartItem(Product product ,
                    int quantity)
    {
        if (quantity > product.getQuantity()){
             throw new IllegalArgumentException("There is no enough quantity in the stock") ;
        }
        
        this .product = product ;
        this.quantity = quantity ;
    }
    
    public Product getProduct () {
        return product  ;
    }
    
    public void setProduct (Product product){
        this.product = product ;
    }
  
    public int getQuantity(){
        return quantity ;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity ;
    }

    public double getTotalPrice (){
        return product.getPrice()*quantity ;
    }

    
}
