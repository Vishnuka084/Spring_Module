package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    public CustomerController(){
        System.out.println("Done");
    }

    @GetMapping//handler methods
    public String getAllCustomer(){
        return "Hello There..?";
    }
    @PostMapping//handler methods
    public String saveCustomer(){
        return "Customer Saved and Post Methods Invoked";
    }

    @DeleteMapping//handler methods
    public String DeleteCustomer(){
        return "Customer Delete and Delete Method Invoked";
    }

    @PutMapping//handler methods
    public String updatedCustomer(){
        return "Customer Updated and Customer Methods";
    }

    @GetMapping (path = "search")//handler methods
    public String searchCustomer(){//handler methods
        return "Customer Search and get mapping methods";
    }

}

