package learn.arrays;


import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
       
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        // To print all the elements of an array, use Arrays.toString().
        System.out.println("All 5 colors: " + Arrays.toString(colors));

        // To access a specific element of an array, use the index.
        System.out.println("First color: " + colors[0]);

        // To assign a value to an element of an array, use the index.
        colors[2] = "Yellow";
        System.out.println("Updated colors: " + Arrays.toString(colors));

        int[] numbers = {100, 800, 300, 200, 600, 500, 700, 400};

        // To get the number of elements in an array, use the .length property.
        System.out.println("Array length: " + numbers.length);

        // To access the last element of an array, use .length - 1 as the index.
        System.out.println("Last number: " + numbers[numbers.length - 1]);

        // The first element of an array is accessed with index 0.
        System.out.println("First number: " + numbers[0]);

        // To update an element of an array, use the index.
        numbers[0] = 300;
        System.out.println("Updated numbers: " + Arrays.toString(numbers));

        // Iterating over array elements.
        System.out.println("--------Traditional For Loop---------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number by index: " + numbers[i]);
        }
        
        System.out.println("--------Enhanced For Loop---------------");
        for (int number : numbers) {
            System.out.println("Number in for-each: " + number);
        }
        
        System.out.println("--------Looping in Functional Programming---------------");
        Arrays.stream(numbers).forEach(System.out::println);
        
        System.out.println("--------Reversed Order in Traditional For Loop---------------");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Number in reverse: " + numbers[i]);
        }
        
        // Sort the 'numbers' array in ascending order and print it. Arrays.sort() modifies the original array.
        Arrays.sort(numbers);
        System.out.println("Sorted numbers array: " + Arrays.toString(numbers));
    }
}
