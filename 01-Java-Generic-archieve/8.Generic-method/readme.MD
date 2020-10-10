## How to utilize Generic method in Java ##
Like generic classes, generic methods have a parameter type declaration using the <> syntax.
This syntax appears before the return type of the method. We can include generic method inside a non-generic class.


### 1. Syntax for writing a generic method in Java ###
```js
<type-Parameters> return_type method_name(parameter list)
{
  // ..
}
```
Note: The syntax for a generic method includes a list of type parameters, inside angle brackets, which appears before the method's return type. 
For static generic methods, the type parameter section must appear before the method's return type.

### 2. Generic method inside non-generic class ###
```js
1.

package generic.method.example1;

public class GenericArrayHandler {

    public static < E > void printArray( E[] inputArray ) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
    }
}

```

```js

2.
package generic.method.example1;

import static generic.method.example1.GenericArrayHandler.printArray;

public class NexusController {
    public static void main(String [] args){

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'P', 'I', 'Z', 'Z', 'A' };

        System.out.print("integerArray contains: ");
        printArray(intArray);
        System.out.print("doubleArray contains: ");
        printArray(doubleArray);
        System.out.print("characterArray contains: ");
        printArray(charArray);


    }
}

```

Example 2: 
```js
package generic.method.example2;

import java.util.List;

public class GenericDao {

    public  <T> T updateData(T t){
        //TODO: utilize t
        return t;
    }
    
    public  <T> T delete(T t){
        //TODO: utilize t
        return t;
    }

    public  <T> Boolean save(T t){
        boolean success = false;
        try{
           
            //TODO: utilize t
            success = true;
        }catch(Exception e){
            success = false;
            return success;
        }
        return success;
    }
    
    public  <T> List<T> listData(String className){
        List<T> items = null;
        
        //TODO: utilize T
        
        return items;
    }

}
```