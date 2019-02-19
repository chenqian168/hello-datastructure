package cq.hello;

/**
 * 冒泡排序
 *
 */
public class Buddle {

    public static void main(String[] args) {
        // write your code here
        int array[] = {1, 10, 25, 8, 6, 20};
        //buddle(array);
        buddle_improve(array);
    }

    public static void display(int[] arrsy) {
        for (int item : arrsy) {
            System.out.print(item + ",");
        }
        System.out.println();
    }

    public static void buddle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            display(array);
        }
    }

    public static void buddle_improve(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean exchange = false;
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    if (!exchange) {
                        exchange = true;
                    }
                }
            }
            display(array);
            if(!exchange) {
                break;
            }
        }
    }
}
