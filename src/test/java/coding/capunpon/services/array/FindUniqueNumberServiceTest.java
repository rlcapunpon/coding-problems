package coding.capunpon.services.array;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FindUniqueNumberServiceTest {
    @Test
    public void shouldFindUniqueNumbers() {
        int[] arr = new int[]{1, 2, 3, 2, 1, 3, 1, 1, 1, 4, 4, 5, 1, 1};
        Set<Integer> uniques = new HashSet<>();
        uniques.add(1);
        uniques.add(2);
        uniques.add(3);
        uniques.add(4);
        uniques.add(5);
        assertThat(FindUniqueNumberService.getUnique(arr)).isEqualTo(uniques);
    }
}