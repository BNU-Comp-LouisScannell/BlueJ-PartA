/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Louis Scannell
 * @version 08/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Macbook Pro 13"));
        manager.addProduct(new Product(105, "Macbook Pro 16"));
        manager.addProduct(new Product(106, "Macbook Air"));
        manager.addProduct(new Product(107, "Ipad"));
        manager.addProduct(new Product(108, "32 Inch TV"));
        manager.addProduct(new Product(109, "Apple AirPods"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDeliverProduct()
    {
        // Show details of all of the products before delivery.
        manager.printProduct(101);
        manager.printProduct(102);
        manager.printProduct(103);
        manager.printProduct(104);
        manager.printProduct(105);
        manager.printProduct(106);
        manager.printProduct(107);
        manager.printProduct(108);
        manager.printProduct(109);
        
        // Take delivery of 5 items of all the products.
        manager.delivery(101, 5);
        manager.delivery(102, 5);
        manager.delivery(103, 5);
        manager.delivery(104, 5);
        manager.delivery(105, 5);
        manager.delivery(106, 5);
        manager.delivery(107, 5);
        manager.delivery(108, 5);
        manager.delivery(109, 5);
        // Show the list of all products after delivery
        manager.printProduct(101);
        manager.printProduct(102);
        manager.printProduct(103);
        manager.printProduct(104);
        manager.printProduct(105);
        manager.printProduct(106);
        manager.printProduct(107);
        manager.printProduct(108);
        manager.printProduct(109);
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void demoSellProduct()
    {
       int amount = 0;
       for(int id = 101; id <=109; id++)
       {
           amount = 2;
           manager.sellProduct(id, amount);
       }
        
    }
       
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }
    //remove product 109
    public void demoRemove()
    {
        manager.removeProduct(109);
    }
    //print all products
    public void printProducts()
    {
        manager.printAllProducts();
    }
}
