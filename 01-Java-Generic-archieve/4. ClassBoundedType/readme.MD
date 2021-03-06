
## Class Bounded Type in Java ##

Let’s take an example on how to implement bounded types (extend superclass) with generics.

```js
// This class only accepts type parametes as any class 
// which extends class A or class A itself. 
// Passing any other type will cause compiler time error 
   
class Bound<T extends A> 
{ 
       
    private T objRef; 
       
    public Bound(T obj){ 
        this.objRef = obj; 
    } 
       
    public void doRunTest(){ 
        this.objRef.displayClass(); 
    } 
} 
   
class A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside super class A"); 
    } 
} 
   
class B extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside sub class B"); 
    } 
} 
   
class C extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside sub class C"); 
    } 
} 
  
public class BoundedClass 
{ 
    public static void main(String a[]) 
    { 
          
        // Creating object of sub class C and  
        // passing it to Bound as a type parameter. 
        Bound<C> bec = new Bound<C>(new C()); 
        bec.doRunTest(); 
          
        // Creating object of sub class B and  
        // passing it to Bound as a type parameter. 
        Bound<B> beb = new Bound<B>(new B()); 
        beb.doRunTest(); 
          
        // similarly passing super class A 
        Bound<A> bea = new Bound<A>(new A()); 
        bea.doRunTest(); 
          
    } 
} 
Output :

Inside sub class C
Inside sub class B
Inside super class A
```

Now, we restricted to only of type A and its sub classes, So it will throw an error for any other type or sub classes.

```js
// This class only accepts type parametes as any class 
// which extends class A or class A itself. 
// Passing any other type will cause compiler time error 
   
class Bound<T extends A> 
{ 
       
    private T objRef; 
       
    public Bound(T obj){ 
        this.objRef = obj; 
    } 
       
    public void doRunTest(){ 
        this.objRef.displayClass(); 
    } 
} 
   
class A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside super class A"); 
    } 
} 
   
class B extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside sub class B"); 
    } 
} 
   
class C extends A 
{ 
    public void displayClass() 
    { 
        System.out.println("Inside sub class C"); 
    } 
} 
  
public class BoundedClass 
{ 
    public static void main(String a[]) 
    { 
        // Creating object of sub class C and  
        // passing it to Bound as a type parameter. 
        Bound<C> bec = new Bound<C>(new C()); 
        bec.doRunTest(); 
  
        // Creating object of sub class B and  
        // passing it to Bound as a type parameter. 
        Bound<B> beb = new Bound<B>(new B()); 
        beb.doRunTest(); 
  
        // similarly passing super class A 
        Bound<A> bea = new Bound<A>(new A()); 
        bea.doRunTest(); 
          
        Bound<String> bes = new Bound<String>(new String()); 
        bea.doRunTest(); 
    } 
} 
Output :

error: type argument String is not within bounds of type-variable T
```
