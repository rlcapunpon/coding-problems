package coding.capunpon.services.array.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortTest {
    private DivideSorter divideSorter;

    @BeforeEach
    public void setUp() {
        divideSorter = new MergeSort();
    }

    @Test
    public void shouldMergeSortArray() {
        //given
        int[] arr = new int[] {2, 31 ,243, 52, 1, 12, 3};
        int[] sorted = new int[] {1, 2, 3, 12, 31, 52, 243};

        //then
        assertThat(divideSorter.sort(arr, arr.length)).isEqualTo(sorted);
    }
}