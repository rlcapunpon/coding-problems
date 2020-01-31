package coding.capunpon.services.array;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FindDuplicateNumberServiceTest {

    @Test
    public void shouldReturnDuplicateInArray() {
        int[] arr = new int[] {1, 7, 3, 2, 6, 1, 5, 5, 4, 2, 1};
        Set<Integer> dupSet = new HashSet<>();
        dupSet.add(1);
        dupSet.add(2);
        dupSet.add(5);
        assertThat(FindDuplicateNumberService.printRepeating(arr)).isEqualTo(dupSet);
    }
}