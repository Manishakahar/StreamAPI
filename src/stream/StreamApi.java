package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {
    // Main Method
    public static void main(String[] args) {
        // printing the Welcome Message
        System.out.println("Welcome to StreamAPI Programming");
        //
        List<Integer> myList = new ArrayList<>();
        // Using Add method We added the multiple Value.
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        // Using Stream.forEach print the values.
        myList.stream().forEach(n -> System.out.println((n)));
    }
}
