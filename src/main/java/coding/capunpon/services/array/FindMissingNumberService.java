package coding.capunpon.services.array;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberService {
    public static Set<Integer> findMissing(int a[]) {
        int n = a.length;
        int total = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            total -= a[i];
        }
        Set<Integer> resultSet = new HashSet<>();
        resultSet.add(total);
        return resultSet;

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
