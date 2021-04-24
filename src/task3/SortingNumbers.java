package task3;

import java.util.ArrayList;

public class SortingNumbers {
    public static void sortingNumbers(ArrayList<Integer> masterArray) {
        /*ArrayList<Integer> slaveArray = new ArrayList<>();
        slaveArray = masterArray;*/

        System.out.println(" Even numbers are ");

        for(int i = 0; i < masterArray.size(); i++){
            if( masterArray.get(i) % 2 == 0) {
                System.out.println(masterArray.get(i));
            }
        }
        System.out.println(" Odd numbers are ");
        for(int i = 0; i < masterArray.size(); i++){
            if( masterArray.get(i) % 2 != 0) {
                System.out.println(masterArray.get(i));
            }
        }
    }
}
