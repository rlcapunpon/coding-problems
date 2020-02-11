package coding.capunpon.services.string.morse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MorseConstantsTest {

    @Test
    void shouldGetMorse() {
        assertThat(MorseConstants.getMorse("A")).isEqualTo(".-");
        assertThat(MorseConstants.getMorse("Z")).isEqualTo("--..");
        assertThat(MorseConstants.getMorse("?")).isEqualTo("..--..");
    }

    @Test
    void shouldGetEnglish() {
        assertThat(MorseConstants.getEng(".-")).isEqualTo("a");
        assertThat(MorseConstants.getEng("--..")).isEqualTo("z");
        assertThat(MorseConstants.getEng("..--..")).isEqualTo("?");
    }
}