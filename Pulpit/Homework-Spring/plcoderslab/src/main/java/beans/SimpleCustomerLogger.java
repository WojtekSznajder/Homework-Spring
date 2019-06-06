package beans;


import pojo.Customer;

import java.time.LocalDateTime;

public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log(Customer customer){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.toString() + String.format("ID: %d, Name: %s, Sruname: %s", customer.getId(), customer.getFirstName(), customer.getLastName()));



    }
}
