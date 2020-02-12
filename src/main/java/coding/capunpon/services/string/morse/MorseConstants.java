package coding.capunpon.services.string.morse;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MorseConstants {
    private static final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };
    private static final String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?" };

    private static Map<String, String> morseToEng = IntStream.range(0, morse.length).boxed()
    .collect(Collectors.toMap(i -> morse[i], i -> english[i]));

    private static Map<String, String> engToMorse = IntStream.range(0, english.length).boxed()
            .collect(Collectors.toMap(i -> english[i], i -> morse[i]));

    public static String getMorse(String engChar) {
        return engToMorse.get(engChar);
    }

    public static String getEng(String morse) {
        return morseToEng.get(morse);
    }
}
