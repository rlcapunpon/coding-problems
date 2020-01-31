package coding.capunpon.services.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMissingNumberServiceTest {
    @Test
    public void shouldReturnMissingNumber() {
        int[] arr = new int[] {1, 2, 3, 4, 6, 7, 8, 9};
        assertThat(FindMissingNumberService.findMissing(arr)).isEqualTo(5);
    }
}