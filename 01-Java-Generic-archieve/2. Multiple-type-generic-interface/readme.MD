## Multiple Type parameters in Java ## 
1.
```js
CustomerService.java

package example.one.generic.service;

public interface CustomerService<O,P> {
     O getKey();
     P getValue();
}
```

2.
```js
CustomerOrderPair.java

package example.one.generic.service;

public class CustomerOrderPair<O, P> implements CustomerService<O,P> {

    private O key;
    private P value;

    public CustomerOrderPair(O key, P value) {
        this.key = key;
        this.value = value;
    }

    public O getKey() {
        return key;
    }

    public P getValue() {
        return value;
    }
}
```

3. 
```js

NexusRunner.java

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

```

4.
```js
Customer.java

package example.one.model;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

```

### Example of Multiple type parameters in Java Generic is HashMap ###
HashMap class is a good example of Multiple Type Parameters.

```js
public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable {
//...
}
```

```js
The interface type Map interface is a good example for Multiple Type Parameters.
public interface Map<K, V> {
...
}
```