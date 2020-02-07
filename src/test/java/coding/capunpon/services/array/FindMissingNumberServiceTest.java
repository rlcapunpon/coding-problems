package coding.capunpon.services.array;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class FindMissingNumberServiceTest {
    @Test
    public void shouldReturnMissingNumber() {
        int[] arr = new int[] {1, 2, 3, 4, 6, 7, 8, 9};
        Set<Integer> result = new HashSet<>();
        result.add(5);
        assertThat(FindMissingNumberService.findMissing(arr)).isEqualTo(result);
    }
}