import lesson2.Task1;
import lesson2.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {5, 11, 10, 2, 1};
        Task1.sort(array);
        System.out.println(Arrays.toString(array));
        Task2.parse();

    }
}
