package coding.capunpon.services.array;

public class ArrayPrinterService {
    public static void printArr(int arr[], String note) {
        System.out.println(note);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\n");
    }
}
