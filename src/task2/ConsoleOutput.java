package task2;

public class ConsoleOutput {
    public static String[] ConsoleOutput(String[] args) {
        String[] reverseArray = new String[args.length];
        for (int i = args.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = args[i];
        }
        return reverseArray;
    }
}
