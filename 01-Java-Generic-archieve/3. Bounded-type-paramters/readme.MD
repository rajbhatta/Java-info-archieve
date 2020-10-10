## What is Bounded Type Paramters (implements an interface) in Java Generic ##

```js
public class Glass<T>{
  private T liquid;
  }

```

Since
```js
Glass<Cake> glass=new Glass<Cake>(new Cacke()); 
```
is valid for any object. If we want to limit Glass to Liquid then we must bound to it.

```js
  interface Liquid{}
  
  class Glass<T extends Liquid>{
    private T liquid;
  }
  ```
  
  ## Bounded type instantion ##
  ```js
  class Juice implements Liquid{}
  class Water implements Liquid{}
  class Cake{}
  class Disel{}
 ```
  
 ```js
 Glass<Water> waterGlass=new Glass<Water>();
 ```
 It is valid because Glass implements Liquid.
 
  ```js
 Glass<Juice> juiceGlass=new Glass<Juice>();
 ```
 It is valid because Juice implements Liquid.
 
  ```js
 Glass<Cake> waterGlass=new Glass<Cake>();
 ```
 It is invalid because Cake is not implementing Liquid.
 
 
 
 
 
