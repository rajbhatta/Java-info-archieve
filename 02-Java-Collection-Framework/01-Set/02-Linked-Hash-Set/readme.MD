## Introduction ##
LinkedHashSet is the ordered version of HashSet. The only difference between HashSet and LinkedHashSet is that: LinkedHashSet maintains the insertion order.
When we iterate through a HashSet, the order is unpredictable while it is predictable in case of LinkedHashSet.

## Example ##
```java
 LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               } 
```
```java
One
Two
Three
Four
Five
```