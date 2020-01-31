package coding.capunpon.services.array.sorting;

import coding.capunpon.services.array.ArrayPrinterService;

public class Sorting {
    public static void main(String args[]) {

        int[] orig = {3, 2, 1, 2, 1, 2, 4, 1, 6, 7, 4, 3, 2, 6, 7, 8, 2, 1, 2, 3};

        DivideSorter mergeSort = new MergeSort();
        int arr[] = orig.clone();
        int[] sorted = mergeSort.sort(arr, arr.length);
        ArrayPrinterService.printArr(sorted, "Merge sorted.");

        ArrayPrinterService.printArr(orig, "Orig.");

        BruteSorter bubbleSort = new BubbleSort();
        arr = orig.clone();
        sorted = bubbleSort.sort(arr);
        ArrayPrinterService.printArr(sorted, "Bubble sorted.");
    }
}
