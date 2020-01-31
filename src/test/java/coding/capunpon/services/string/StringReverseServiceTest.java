package coding.capunpon.services.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringReverseServiceTest {

    @Test
    void stringShouldBeReversed() {
        assertThat(StringReverseService.reverse("AbC dEfG")).isEqualTo("GfEd CbA");
    }
}