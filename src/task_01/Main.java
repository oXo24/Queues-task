package task_01;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initial data:");
        displayData(initialData());

        System.out.println("\nUpdated data:");
        displayData(updateData(initialData(), newData()));
    }

    private static Queue<String> initialData() {

        Queue<String> dataList = new LinkedList<>();

        dataList.add("apricot");
        dataList.add("mango");
        dataList.add("cherry");
        dataList.add("rice");

        return dataList;
    }

    private static String newData() {

        return "kiwi";
    }

    private static Queue<String> updateData(Queue<String> dataList, String newData) {
        dataList.add(newData);
        return dataList;
    }

    private static void displayData(Queue<String> dataList) {
        int i = 1;
        for (String data : dataList) {
            System.out.println(i + ") " + data);
            i++;
        }
    }
}
