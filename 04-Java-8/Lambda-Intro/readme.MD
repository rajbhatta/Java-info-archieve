## Introduction to Lambda Expression ##

### 1. Lambda Expression for a function without return type ###

```js
package noreturn.type;

public interface ApplePhone {
    public String purchase();
}
```

```js
package noreturn.type;

public class NexusRunner {
    public static void main(String[] args){

        ApplePhone applePhone=() -> "This is for test";
        applePhone.purchase();

    }

}
```

### 1.1 Without Lambda Expression ###
```js
package noreturn.type;

public interface ApplePhone {
    public String purchase();
}
```

```js
package noreturn.type;

public class NexusRunner {
    public static void main(String[] args){

        ApplePhone applePhone= new ApplePhone() {
            @Override
            public String purchase() {
                return "Hello";
            }
        }

    }

}

```

### 2. Lambda Expression for a function with return type ###
```js
package onereturn.type;

public interface ApplePhone {
    public int purchase(int cost, int quantity);
}
```

```js
package onereturn.type;

public class NexusRunner {
    public static void main(String[] args){

        ApplePhone applePhone=(int a , int b)->a*b;

        int finalCost=applePhone.purchase(30,40);

        System.out.println(finalCost);

    }

}
```
### 2.1 Without Lambda Expression

```js
package onereturn.type;

public interface ApplePhone {
    public int purchase(int cost, int quantity);
}
```

```js
package onereturn.type;

public class NexusRunner {
    public static void main(String[] args){

        ApplePhone applePhone= new ApplePhone() {
            @Override
            public int purchase(int cost, int quantity) {
                return cost*quantity;
            }
        };

        int finalCost=applePhone.purchase(30,40);

        System.out.println(finalCost);

    }

}
```
