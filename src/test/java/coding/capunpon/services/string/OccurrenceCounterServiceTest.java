package coding.capunpon.services.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OccurrenceCounterServiceTest {

    @Test
    public void getOccurrenceOfCharacter() {
        assertThat(OccurrenceCounterService.getOccurrence("c", "CcDdEeCcDdEe")).isEqualTo(4);
    }
}