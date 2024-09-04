package com.example.customer;

import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class customerController {
    List<Customer> list=new ArrayList<>();
    public customerController(){
        Customer c1=new Customer(234,"Raki","Chennai","abc@gmail.com");
        Customer c2=new Customer(23,"Raji","Chennai","cde@gmail.com");
        list.add(c1);list.add(c2);
    }
   // @GetMapping("/customer")
    //public List<Customer> getAllCustomers(){
     //   return list;
 //  }
    @PostMapping("/customer")
    public Customer postMethodName(@RequestBody Customer customer) {
        list.add(customer);
        
        return customer;
    }
    @PutMapping("/customer")
    public Customer putMethodName( @RequestBody Customer customer) {
        for(Customer customer2 : list){
            if(customer2.getId()==customer.getId()){
                list.remove(customer);
                list.add(customer);
                return customer;
            }
        }
        
        return null;
    }
    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") int customerId){
        return list.stream().filter(e->e.getId()==customerId).findAny().orElse(null);
    }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @DeleteMapping("/customer/{id}")
        public String deleteCustomerById (@PathVariable("id") int customerId){
            for(Customer customer: list){
                if (customer.getId()==customerId) {
                    list.remove(customer);
                    return "Customer removed";
                    
                }
            }
            return "not removed";

        }

    




    }
    