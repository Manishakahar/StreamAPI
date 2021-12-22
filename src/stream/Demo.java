package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {
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
        // We Convert The Value Integer To Double.
        Function<Integer, Double> doubleFunction = Integer::doubleValue;
        // Using forEach loop print the value of double.
        myList.forEach(n ->System.out.println(doubleFunction.apply(n)));

        Predicate<Integer> isEvenFunction = n -> n % 2 ==0;
        myList.forEach(n -> System.out.println("Data :" +isEvenFunction.test(n)));
        myList.forEach(n->{
            if (isEvenFunction.test(n));
            {
                System.out.println(n);
            }
        });
    }
}
