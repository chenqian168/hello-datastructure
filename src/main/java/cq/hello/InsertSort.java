package cq.hello;

/**
 * 插入排序
 * <p>
 * 算法分析
 * 在第一趟排序中，插入排序最多比较一次，第二趟最多比较两次，依次类推，最后一趟最多比较N-1次。因此有：
 * 1+2+3+...+N-1 =N*(N-1)/2
 * 因为在每趟排序发现插入点之前，平均来说，只有全体数据项的一半进行比较，我们除以2得到：
 * N*(N-1)/4
 * <p>
 * 复制的次数大致等于比较的次数，然而，一次复制与一次比较的时间消耗不同，所以相对于随机数据，这个算法比冒泡排序快一倍，比选择排序略快。
 * <p>
 * 与冒泡排序、选择排序一样，插入排序的时间复杂度仍然为O(N2)，这三者被称为简单排序或者基本排序，三者都是稳定的排序算法。
 * <p>
 * 如果待排序数组基本有序时，插入排序的效率会更高
 */
public class InsertSort {

    public static void main(String[] args) {
        int array[] = {1, 10, 25, 8, 6, 20};
        insertSort(array);
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int insertItem = i - 1;
            while (insertItem >= 0 && array[insertItem] > temp) {
                array[insertItem + 1] = array[insertItem];
                insertItem--;
            }
            array[insertItem + 1] = temp;
            System.out.println(temp);
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
