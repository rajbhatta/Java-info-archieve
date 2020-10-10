package generic.method.example1;

public class GenericArrayHandler {

    public static < E > void printArray( E[] inputArray ) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
    }
}
