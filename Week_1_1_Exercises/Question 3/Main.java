import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Rahul", 150.50),
            new Order("2", "Anwesha", 80.75),
            new Order("3", "Ayan", 200.00),
            new Order("4", "Arkendu", 50.25),
            new Order("5", "Niladri", 100.00)
        };

        
        System.out.println("Before Bubble Sort:");
        Arrays.stream(orders).forEach(System.out::println);
        
        Sorting.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        Arrays.stream(orders).forEach(System.out::println);

        
        orders = new Order[]{
            new Order("1", "Rahul", 150.50),
            new Order("2", "Anwesha", 80.75),
            new Order("3", "Ayan", 200.00),
            new Order("4", "Arkendu", 50.25),
            new Order("5", "Niladri", 100.00)
        };

        
        System.out.println("\nBefore Quick Sort:");
        Arrays.stream(orders).forEach(System.out::println);

        Sorting.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        Arrays.stream(orders).forEach(System.out::println);
    }
}
