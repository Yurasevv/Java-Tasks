package task4;

import java.util.ArrayList;

public class MinMaxNumbers {

    public static void minMaxNumbers(ArrayList<Integer> masterArray) {

        int maxNumber = masterArray.get(1);
        int minNumber = masterArray.get(1);

        for( int i = 0; i < masterArray.size(); i++ ) {
            for (int j = 0; j < masterArray.size(); j++){
                if(maxNumber < masterArray.get(j)){
                    maxNumber = masterArray.get(j);
                }
            }
        }
        System.out.println(" Max number is " + maxNumber);


        for( int i = 0; i < masterArray.size(); i++ ) {
            for (int j = 0; j < masterArray.size(); j++){
                if(minNumber > masterArray.get(j)){
                    minNumber = masterArray.get(j);
                }
            }
        }
        System.out.println(" Min number is " + minNumber);
    }
}
