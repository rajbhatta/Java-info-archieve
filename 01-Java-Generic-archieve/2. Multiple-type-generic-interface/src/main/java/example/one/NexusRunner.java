package example.one;

import example.one.generic.service.CustomerOrderPair;
import example.one.model.Customer;

public class NexusRunner {
    public static void main(String[] args){

        CustomerOrderPair<String, Integer> p1 = new CustomerOrderPair<>("Even", 8);
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());

        CustomerOrderPair<String, String>  p2 = new CustomerOrderPair<>("hello", "world");
        System.out.println(p2.getKey());
        System.out.println(p2.getValue());

        //TODO: Check this line very carefully
        CustomerOrderPair<String, Customer>  p3 = new CustomerOrderPair<>("key", new Customer("A Firstname", "B FirstName"));
        System.out.println(p3.getKey());
        System.out.println(p3.getValue().getFirstName());

    }
}
