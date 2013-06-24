package com.shopify.api;

/**
 * Created by IntelliJ IDEA.
 * User: naren
 * Date: 6/2/13
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.List;

import com.shopify.api.client.ShopifyClient;
import com.shopify.api.credentials.Credential;
import com.shopify.api.credentials.JsonDirectoryCredentialsStore;
import com.shopify.api.endpoints.ProductsService;
import com.shopify.api.resources.Product;

public class S4JDemo {

    private ShopifyClient shopify;
    public S4JDemo(){
        // Let's pretend we are just using a developer key for now
        //Credential creds = new Credential("my-api-key", "my-shared-secret", "my-shopify-shop", "my-password");
        Credential creds = new Credential("f61abd243bd00e1511c2c05a3fe68dbc",
                "fa2462fd38a87c58c6a2436982ccc202",
                "narens-shop",
                "0a1eeeb8d01da95c2e8cdea889f57bd0 ");   //permanent token obtained after user installs the app (post-auth) . See: http://wiki.shopify.com/Making_API_calls_without_the_store_being_logged_in


        shopify = new ShopifyClient(creds);
    }

    public void run() {
        // Create a "Products Service" from our client.  This is what makes the API calls to /admin/products
        ProductsService productsApi = shopify.constructService(ProductsService.class);
        // Get a list of products for our store -- this is a blocking operation
       // Product[] products = productsApi.getProducts();
        Product[] products = shopify.getProducts(productsApi,1);  //MASSIVE HACK ATTACK : SINCE "getProducts(String queryParams)" does not work
        // Print out product information to the terminal
        for(Product p : products){
            String message = String.format("%s is made by %s" , p.getTitle(), p.getVendor());
            System.out.println(message);
            
            System.out.println("Number of " + p.getTitle() + " products left in stock :"  + p.getVariants().get(0).getInventoryQuantity());
        }
    }

    public void printMethods(){
        for (int i=1; i< 300 ;i++){
                 System.out.println("@Path(\".json?limit=250&page="+ i +"\")\n" +
                         "    Product[] getProducts"+ i +"();");
        }
    }

    public void returnMethods(){
        for (int i=1; i< 300 ;i++){
            System.out.println("case " + i +" : " +"\n" +
                    "    return productsApi.getProducts"+ i +"();");
        }
    }

    public static void main(String[] args){
        S4JDemo demo = new S4JDemo();
        demo.run();
        //demo.printMethods();
        //demo.returnMethods();
    }
}
