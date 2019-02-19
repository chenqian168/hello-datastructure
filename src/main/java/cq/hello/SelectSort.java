package cq.hello;

/**
 * 选择排序
 *
 * 基本思想
 * 冒泡排序中有一个缺点，比如，我们比较第一个数a1与第二个数a2的时候，只要a1比a2大就会交换位置，
 * 但是我们并不能确定a2是最小的元素，假如后面还有比它更小的，该元素还会与a2再次进行交换，而且这种交换有可能发生多次才能确定a2的最终位置。
 *
 * 算法分析
 * 选择排序与冒泡排序一样，需要进行N*(N-1)/2次比较，但是只需要N次交换，当N很大时，交换次数的时间影响力更大，所以选择排序的时间复杂度为O(N2)。
 * 虽然选择排序与冒泡排序在时间复杂度属于同一量级，但是毫无疑问选择排序的效率更高，因为它的交换操作次数更少，而且在交换操作比比较操作的时间级大得多时，选择排序的速度是相当快的。
 * ---------------------
 * 优点：减少交换次数
 * 缺点：时间复杂度依然是O(n^2)
 */
public class SelectSort {

    public static void main(String[] args) {
        int array[] = {1, 10, 25, 8, 6, 20};
        selectSort(array);
    }

    public static void selectSort(int[] array) {
        int minIndex;
        int temp;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {//交换位置
                temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
            display(array);
        }
    }

    public static void display(int[] arrsy) {
        for (int item : arrsy) {
            System.out.print(item + ",");
        }
        System.out.println();
    }

}
