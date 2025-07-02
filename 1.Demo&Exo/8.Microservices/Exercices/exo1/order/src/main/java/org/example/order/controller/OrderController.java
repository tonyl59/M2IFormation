package org.example.order.controller;

import org.example.order.model.Customer;
import org.example.order.model.Order;
import org.example.order.model.Product;
import org.example.order.util.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/order")
public class OrderController {
    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id){
        Order order = new Order();
        order.setId(id);
        order.setDescription("test order 1");
        Customer customer = restTemplate.getForObject(
                "http://localhost:8080/customer/{id}",
                Customer.class,
                id
        );

        Product product = restTemplate.getForObject(
                "http://localhost:8082/product/{id}",
                Product.class,
                id
        );
        order.setCustomer(customer);
        order.setProduct(product);
        return order;
    }

    @GetMapping("/detail/{id}")
    public Order getOrdering(@PathVariable int id){
        Order order = new Order();
        order.setId(id);
        order.setDescription("test order 2");
        RestClient<Customer> customerRestClient = new RestClient<>("http://localhost:8080/customer/6");
        Customer customer = customerRestClient.get(Customer.class);
        order.setCustomer(customer);

        RestClient<Product> productRestClient = new RestClient<>("http://localhost:8082/product/4");
        Product product = productRestClient.get(Product.class);
        order.setProduct(product);

        return order;

    }


}
