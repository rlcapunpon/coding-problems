package coding.capunpon.services.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringExtractorServiceTest {

    @Test
    public void shouldRemoveNoise() {
        assertThat(StringExtractorService.extractString("AAAHEREAAITAAAAAISAAAA", "A"))
                .isEqualTo("HERE IT IS");
    }

}