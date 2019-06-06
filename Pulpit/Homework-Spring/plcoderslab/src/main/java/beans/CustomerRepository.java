package beans;

import pojo.Customer;

import java.util.ArrayList;

public interface CustomerRepository {

    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    ArrayList<Customer> loadCustomers();

}
