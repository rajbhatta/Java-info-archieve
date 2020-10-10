## Possible ways of implementing Java Generic ##
```js
package generic.technique;

import java.util.List;

public interface CustomerService<T> {
    void save(T t);
    List<T> get();
    T getById(T t);
    void delete(T t);
}

```

### Concept used ###
1.  Ignore or Remove Formal Type Parameters
2. Create a Generic Class
3. Create A Class That Deals With Specific Non-generic Types


## 1. Ignore or remove formal type parameters ## 
Ignoring or removing formal type parameters is a terrible practice even when working with the latest JDK. 
We should only do this if we’re (still) working with JDK version 1.4 or lower. 
Java Generics was not available until JDK version 1.5. Consider the following codes.

The following class IgnoredFormalTypeParameters implements CustomerService without using a formal type parameter. 
As a result, the class uses the Object type for the item variable.

If the codes are using Object types somewhere in an Interface definition, 
they are a recipe for a maintenance nightmare and probably need a Generic Interface.

#### RestaurantCustomerService.java ####
```js
package generic.technique.first;

import generic.technique.CustomerService;

import java.util.List;

public class RestaurantCustomerService implements CustomerService {
    public void save(Object o) {

    }

    public List get() {
        return null;
    }

    public Object getById(Object o) {
        return null;
    }

    public void delete(Object o) {

    }
}
```

## 2. Create Generic Class Type ## 
Another way is to create a generic class that implements the generic interface. 
The class definition uses the same formal type parameters twice – one after the class name and another after the interface name it implements. 
Consider the following codes. They use <U> twice in the two locations.

#### HotelCustomerService.java ####
```js
package generic.technique.second;

import generic.technique.CustomerService;

import java.util.List;

public class HotelCustomerService<T> implements CustomerService<T> {


    public void save(T t) {

    }

    public List<T> get() {
        return null;
    }

    public T getById(T t) {
        return null;
    }

    public void delete(T t) {

    }
}

```

## 3. Create a class that deal with specific Non-generic type ## 
In this way, instead of using formal type parameters, we use an actual type. 
For example, use <Customer> instead of <T>. 
Although we use a Generic Interface, the formal type parameter is a non-generic type.

#### AirlineCustomerService.java ####
```js
package generic.technique.third;

import generic.technique.CustomerService;
import generic.technique.model.Customer;

import java.util.List;

public class AirlineCustomerService implements CustomerService<Customer> {
    public void save(Customer customer) {

    }

    public List<Customer> get() {
        return null;
    }

    public Customer getById(Customer customer) {
        return null;
    }

    public void delete(Customer customer) {

    }
}

```

## References ##
Connect to me through Linkedin:  https://www.linkedin.com/in/raj-bhatta/

