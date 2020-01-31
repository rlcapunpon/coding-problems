package coding.capunpon.services.array;

public class FindMissingNumberService {
    public static int findMissing(int a[]) {
        int n = a.length;
        int total = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;

        /*
        In python, simply:
          #given that it is sorted
          num_list = [1, 2, 4, 5, 6]
          original_list = [x for x in range(num_list[0], num_list[-1] + 1)]
          num_list = set(num_list)
          return (list(num_list ^ set(original_list)))

         */
    }
}
