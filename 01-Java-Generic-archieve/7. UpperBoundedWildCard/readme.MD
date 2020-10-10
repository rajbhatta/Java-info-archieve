## UpperBounded wildcard in Java ##

To declare an upper-bounded wildcard, use wildcard character ? followed by extends keyword.

```js

<? extends upperBoundedType>

```

## Why should we use UpperBounded Wildcard in Java ##

You can use an upper bounded wildcard to relax the restrictions on a variable. For example, say you want to write a method that works on 
```js
List<Integer>, List<Double> and List<Number>
```

you can achieve this by using an upper bounded wildcard.

To declare an upper-bounded wildcard, use the wildcard character ('?'), followed by the extends keyword, followed by its upper bound. Note that, in this context, extends is used in a general sense to mean either "extends" (as in classes) or "implements" (as in interfaces).

To write the method that works on lists of Number and the subtypes of Number, such as Integer, Double, and Float, you would specify List<? extends Number>. The term 
```js
List<Number> 
```
is more restrictive than List<? extends Number> because the former matches a list of type Number only, whereas the latter matches a list of type Number or any of its subclasses.

Consider the following process method:
```js
public static void process(List<? extends Foo> list) { /* ... */ }
```
The upper bounded wildcard, <? extends Foo>, where Foo is any type, matches Foo and any subtype of Foo. The process method can access the list elements as type Foo:

```js
public static void process(List<? extends Foo> list) {
    for (Foo elem : list) {
        // ...
    }
}
```

Link for more information: java2novice.com/java-generics/wildcard-arguments/