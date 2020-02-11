package coding.capunpon.services.string.morse;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseConverterService {
    public static String getMorse(String phrase) {
        String result = "";
        String[] words = phrase.split(" ");
        for(String word: words) {
            for(char engChar : word.toLowerCase().toCharArray()) {
                result += MorseConstants.getMorse(Character.toString(engChar)) + " ";
            }
            result += "  ";
        }
        return result.trim();
    }

    public static String getString(String mPhrase) {
        String result = "";
        String[] morses = mPhrase.split("   ");
        for(String morse: morses) {
            result += Arrays.asList(morse.split(" "))
                    .stream().map(MorseConstants::getEng).collect(Collectors.joining());
            result += " ";
        }
        return result.trim();
    }
}
