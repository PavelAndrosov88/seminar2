package lesson2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {
    public static void sort(int[] array) {
        try {
            FileWriter fm = new FileWriter("log.txt");
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                    fm.append(Arrays.toString(array)).append("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

