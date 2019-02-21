package cq.hello;

public class MergeSort {

    public static void main(String[] args) {
        int array[] = {25, 10, 1, 8, 6, 20};
        int tempArray[] = new int[array.length];
        recurslveMgrSort(array, 0, array.length - 1, tempArray);
    }

    public static void recurslveMgrSort(int[] array, int lowerBound, int upperBound, int[] tempArray) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;
            recurslveMgrSort(array, lowerBound, mid, tempArray);
            recurslveMgrSort(array, mid + 1, upperBound, tempArray);
            merge(array, lowerBound, mid, upperBound, tempArray);
            display(array);
            System.out.println(lowerBound + "//" + mid + "//" + upperBound);
        }
    }

    public static void display(int[] arrsy) {
        for (int item : arrsy) {
            System.out.print(item + ",");
        }
        System.out.println();
    }

    public static void merge(int[] array, int lowerBound, int mid, int upperBound, int[] tempArray) {
        int lowBegin = lowerBound;
        int lowEnd = mid;
        int highBegin = mid + 1;
        int highEnd = upperBound;
        int j = 0;
        int n = upperBound - lowerBound + 1;

        while (lowBegin <= lowEnd && highBegin <= highEnd) {
            if (array[lowBegin] <= array[highBegin]) {
                tempArray[j++] = array[lowBegin++];
            } else {
                tempArray[j++] = array[highBegin++];
            }
        }

        while (lowBegin <= lowEnd) {
            tempArray[j++] = array[lowBegin++];
        }

        while (highBegin <= highEnd) {
            tempArray[j++] = array[highBegin++];
        }

        for (j = 0; j < n; j++) {
            array[lowerBound++] = tempArray[j];
        }
    }

}
