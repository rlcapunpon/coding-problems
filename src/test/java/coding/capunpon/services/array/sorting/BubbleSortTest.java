package coding.capunpon.services.array.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {
    private BruteSorter bruteSorter;

    @BeforeEach
    public void setUp() {
        bruteSorter = new BubbleSort();
    }

    @Test
    public void shouldBubbleSortArray() {
        //given
        int[] arr = new int[] {2, 31 ,243, 52, 1, 12, 3};
        int[] sorted = new int[] {1, 2, 3, 12, 31, 52, 243};

        //then
        assertThat(bruteSorter.sort(arr)).isEqualTo(sorted);
    }
}