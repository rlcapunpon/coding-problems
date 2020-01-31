package coding.capunpon.services.numprobs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialServiceTest {

    @Test
    public void shouldReturnFactorial() {
        assertThat(FactorialService.getFactorial(8)).isEqualTo(40320);
        assertThat(FactorialService.getFactorial(0)).isEqualTo(1);
        assertThat(FactorialService.getFactorial(1)).isEqualTo(1);
        assertThat(FactorialService.getFactorial(2)).isEqualTo(2);
    }
}