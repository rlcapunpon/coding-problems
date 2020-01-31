package coding.capunpon.services.array;

import java.util.HashMap;
import java.util.Set;

public class FindUniqueNumberService {

    public static Set<Integer> getUnique(int[] ar) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < ar.length; i++) {
            hm.put(ar[i], i);
        }
        return hm.keySet();

        /*
        In python, simply:
        a = [1, 2, 3, 5, 1, 3, 67, 85]
        seen = set()
        uniq = [x for x in a if x not in seen and not seen.add(x)]

         */
    }
}
