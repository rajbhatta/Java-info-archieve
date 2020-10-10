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
