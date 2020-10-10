## Types of lock ##
There are two types of locks on threads:
- Object level lock
- Class level lock

## Object level lock ##
- Every object in java has a unique lock. Whenever we are using synchronized keyword, then only lock concept will come in the picture.

- Object level lock is mechanism when we want to synchronize a non-static method or non-static code block such that only one thread will be able to execute the code block on given instance of the class. 

### Various way of implementing object level lock in Java ###

```java
public class DemoClass
{
    public synchronized void demoMethod(){}
}
 
or
 
public class DemoClass
{
    public void demoMethod(){
        synchronized (this)
        {
            //other thread safe code
        }
    }
}
 
or
 
public class DemoClass
{
    private final Object lock = new Object();
    public void demoMethod(){
        synchronized (lock)
        {
            //other thread safe code
        }
    }
}
```

## Class level lock ##
- Every class in java has a unique lock which is nothing but class level lock. 
If a thread wants to execute a static synchronized method, then thread requires class level lock. 
Once a thread got the class level lock, then it is allowed to execute any static synchronized method of that class.
 Once method execution completes automatically thread releases the lock. 
 
 ```java
public class DemoClass
{
    //Method is static
    public synchronized static void demoMethod(){
 
    }
}
 
or
 
public class DemoClass
{
    public void demoMethod()
    {
        //Acquire lock on .class reference
        synchronized (DemoClass.class)
        {
            //other thread safe code
        }
    }
}
 
or
 
public class DemoClass
{
    private final static Object lock = new Object();
 
    public void demoMethod()
    {
        //Lock object is static
        synchronized (lock)
        {
            //other thread safe code
        }
    }
}
```