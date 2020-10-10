## Introduction about HashSet ##
This class implements the Set interface, backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. This class permits the null element. This class is not synchronized. 


## How to use Hashset ##
```java
package raj.example.one;

public class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
```

```java
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

```

```java
A B
A B
C D
```
