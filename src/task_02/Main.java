package task_02;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initial data:");
        Queue<String> dataList = initialData();
        displayData(dataList);

        System.out.println("\nUpdated data:");
        updateData(dataList);
        displayData(dataList);
    }

    private static Queue<String> initialData() {

        Queue<String> dataList = new LinkedList<>();

        dataList.add("apricot");
        dataList.add("mango");
        dataList.add("cherry");
        dataList.add("rice");

        return dataList;
    }

    private static void updateData(Queue<String> dataList) {

        dataList.poll();
    }

    private static void displayData(Queue<String> dataList) {

        int i = 1;
        for (String data : dataList) {
            System.out.println(i + ") " + data);
            i++;
        }
    }
}