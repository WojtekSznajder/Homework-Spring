import beans.MemoryCustomerRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Customer;

public class SpringDiApplication {




    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Customer cust1 = new Customer(1, "Wojciech", "Sznajder");
        Customer cust2 = new Customer(2, "pjoter", "pjontek");

//        SimpleCustomerLogger simpleCustomerLogger = (SimpleCustomerLogger) context.getBean("simpleCustomerLogger");
//        simpleCustomerLogger.log(cust1);

        MemoryCustomerRepository memoryCustomerRepository = (MemoryCustomerRepository) context.getBean("memoryCustomerRepository");
        memoryCustomerRepository.addCustomer(cust1);

        memoryCustomerRepository.loadCustomers();
        // nie działa, null pointer exception MemoryCustomerRepository.java:17)
        context.close();
    }
}



