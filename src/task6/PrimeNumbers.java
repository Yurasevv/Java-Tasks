package task6;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void primeNumbers(ArrayList<Integer> arrayList) {
        System.out.println(" Prime numbers are ");
        int arrayLength = arrayList.size();

        for (int i = 0; i < arrayLength; i++) {
            double root = Math.sqrt(arrayList.get(i));

            for(int j = 2; j <= root; j++) {
                if (arrayList.get(i) % j == 0) {
                    arrayList.remove(i);
                    arrayLength -= 1;
                    break;
                }

            }
        }
        System.out.println(arrayList.toString());
    }
}
