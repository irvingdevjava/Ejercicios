package Ejercicios;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
        sort();
        printArray();
    }

    private void sort() {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) break;
        }
    }

    private void printArray() {
        System.out.println("Array ordenado:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}


