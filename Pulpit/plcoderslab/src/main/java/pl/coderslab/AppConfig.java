package pl.coderslab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.CustomerLogger;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;
import pl.coderslab.pojo.Customer;

@Configuration
public class AppConfig {


    @Bean
    public SimpleCustomerLogger simpleCustomerLogger(){
        return new SimpleCustomerLogger();
    }
    @Bean
    public MemoryCustomerRepository memoryCustomerRepository(){
        return new MemoryCustomerRepository();
    }
}
