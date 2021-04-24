package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class GetNumbers {

    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter quantity of numbers");
        int amount = scanner.nextInt();

        System.out.println("Enter numbers");
        for (int i = 0; i < amount; i++) {
            arrayList.add(scanner.nextInt());
        }
        scanner.close();
        return arrayList;
    }
}
