package raj.example.one;

import java.awt.print.Book;
import java.util.HashSet;

public class ExampleOneRunner {
    public static void main(String [] args){

        HashSet<Customer> set=new HashSet<>();


        Customer b1=new Customer("A","B");
        Customer b2=new Customer("A","B");
        Customer b3=new Customer("C","D");

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(Customer b:set){
            System.out.println(b.getFirstName()+" "+b.getLastName());
        }
    }
}
