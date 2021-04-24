package task3;

import task4.MinMaxNumbers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        OddEvenNumbers sortingNumbers = new OddEvenNumbers();
        MinMaxNumbers minMaxNumbers = new MinMaxNumbers();

        ArrayList<Integer> slaveList = new ArrayList<>();
        slaveList = GetNumbers.getNumbers();

        sortingNumbers.sortingNumbers(slaveList);
        minMaxNumbers.minMaxNumbers(slaveList);

    }
}
