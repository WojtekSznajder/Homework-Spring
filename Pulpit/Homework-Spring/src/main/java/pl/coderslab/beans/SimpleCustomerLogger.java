package pl.coderslab.beans;

import pl.coderslab.beans.CustomerLogger;
import pl.coderslab.pojo.Customer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleCustomerLogger implements CustomerLogger {

        @Override
     public void log(Customer customer){
        LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime.toString() + String.format("ID: %d, Name: %s, Sruname: %s", customer.getId(), customer.getFirstName(), customer.getLastName()));



    }
}
