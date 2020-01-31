package coding.capunpon.services.numprobs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciServiceTest {

    @Test
    public void shouldReturnFibonacciSequence() {
        assertThat(FibonacciService.getFibonacci(1)).isEqualTo(new int[]{0});
        assertThat(FibonacciService.getFibonacci(4)).isEqualTo(new int[]{0, 1, 1, 2});
    }
}