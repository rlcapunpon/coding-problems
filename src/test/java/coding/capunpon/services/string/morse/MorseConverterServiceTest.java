package coding.capunpon.services.string.morse;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MorseConverterServiceTest {

    @Test
    public void shouldConvertStringToMorse() {
        assertThat(MorseConverterService.getMorse("HOW ARE YOU TODAY?")).isEqualTo(".... --- .--   .- .-. .   -.-- --- ..-   - --- -.. .- -.-- ..--..");
    }

    @Test
    public void shouldConvertMorseToString() {
        assertThat(MorseConverterService.getString(".... --- .--   .- .-. .   -.-- --- ..-   - --- -.. .- -.-- ..--..")).isEqualTo("how are you today?");
    }

}