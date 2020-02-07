package coding.capunpon.services.array;

import java.util.Set;

public class ArrayProblems {

    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 6, 4, 7, 3, 2, 6, 9, 9, -1, -1, 16, 16};
        System.out.println(FindDuplicateNumberService.printRepeating(arr));

        int a[] = {1, 2, 4, 5, 6};
        Set<Integer> miss = FindMissingNumberService.findMissing(a);
        System.out.println(miss);

        int ar[] = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(FindUniqueNumberService.getUnique(ar));

    }
}
