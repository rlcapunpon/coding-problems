package coding.capunpon.services.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerServiceTest {

    @Test
    void stringIsPalindrome() {
        assertThat(PalindromeCheckerService.isPalindrome("Asababasa")).isEqualTo(true);
    }

    @Test
    void stringIsNotPalindrome() {
        assertThat(PalindromeCheckerService.isPalindrome("Asaadbadsbasa")).isEqualTo(false);
    }
}