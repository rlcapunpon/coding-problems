package coding.capunpon.services.array.sorting;

class MergeSort implements DivideSorter {

    public int[] sort(int arr[], int n) {
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0, j = mid; i < mid || j < n; i++, j++) {
            if (i < mid) {
                l[i] = arr[i];
            }
            r[j - mid] = arr[j];
        }
        sort(l, mid);
        sort(r, n - mid);
        return merge(arr, l, r, mid, n - mid);
    }

    private int[] merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            a[k++] = (l[i] <= r[j]) ? l[i++] : r[j++];
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }

}