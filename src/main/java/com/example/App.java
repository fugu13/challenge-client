package com.example;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * Do our quick client things!
 */
public class App 
{
    public static void main( String[] args )
    {

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(args[0]);
        Invocation.Builder supplierBuilder = webTarget.path("supplier").request(MediaType.APPLICATION_JSON);
        Invocation.Builder transactionBuilder = webTarget.path("transaction").request(MediaType.APPLICATION_JSON);

        Supplier supplier = new Supplier(args[1] + " Supplier Name", "Supplier Address",
                "Supplier Contact Info");

        Response response = supplierBuilder.post(Entity.entity(supplier, MediaType.APPLICATION_JSON));
        Supplier completeSupplier = response.readEntity(Supplier.class);

        System.out.println("Supplier created! " + completeSupplier.getId() + " " + completeSupplier.getName());


        for(int ii = 0; ii < 137; ii++) {
            transactionBuilder.post(Entity.entity(new Transaction(completeSupplier, args[1] +" ii"),
                            MediaType.APPLICATION_JSON));
        }


    }
}
