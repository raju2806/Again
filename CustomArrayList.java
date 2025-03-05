import java.util.Arrays;

public class CustomArrayList {
    private Object[] data;   // Array to store the elements
    private int size;        // To keep track of the number of elements

    // Constructor to initialize the custom ArrayList
    public CustomArrayList() {
        data = new Object[10]; // Initial capacity of 10
        size = 0;
    }

    // Method to add an element at the end of the ArrayList
    public void add(Object element) {
        if (size == data.length) {
            resize();  // If the array is full, resize it
        }
        data[size] = element;
        size++;
    }

    // Method to remove an element by its index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null; // Clear the last element
        size--;
    }

    // Method to get an element by its index
    public Object get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return null;
        }
        return data[index];
    }

    // Method to set an element at a specific index
    public void set(int index, Object element) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        data[index] = element;
    }

    // Method to return the size of the ArrayList
    public int size() {
        return size;
    }

    // Method to print all elements in the ArrayList
    public void printList() {
        if (size == 0) {
            System.out.println("ArrayList is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Method to resize the internal array when it becomes full
    private void resize() {
        int newSize = data.length * 2; // Double the size of the array
        data = Arrays.copyOf(data, newSize); // Create a new larger array and copy elements
    }

    // Main method to test the CustomArrayList class
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        // Adding elements to the custom ArrayList
        list.add("Hello");
        list.add(25);
        list.add(3.14);
        list.add("World");

        // Print the ArrayList
        System.out.println("ArrayList after adding elements:");
        list.printList();  // Output: Hello 25 3.14 World

        // Get an element at index 1
        System.out.println("Element at index 1: " + list.get(1));  // Output: 25

        // Set a new element at index 2
        list.set(2, 42);
        System.out.println("ArrayList after setting new element at index 2:");
        list.printList();  // Output: Hello 25 42 World

        // Remove element at index 3 (World)
        list.remove(3);
        System.out.println("ArrayList after removing element at index 3:");
        list.printList();  // Output: Hello 25 42

        // Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());  // Output: 3
    }
}
