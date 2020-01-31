package coding.capunpon.services.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumberService {

    public static Set<Integer> printRepeating(int[] inputArray) {

        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements = Arrays.stream(inputArray)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toSet());

        return duplicateElements;

        //In python, simply:
        /*

        seen = {}
        dupes = []

        for x in a:
            if x not in seen:
                seen[x] = 1
            else:
                if seen[x] == 1:
                    dupes.append(x)
                seen[x] += 1

        print(dupes)
        print(seen)

         */
    }

}
