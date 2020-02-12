package coding.capunpon.services.string;

public class StringExtractorService {
    public static String extractString(String input, String noise) {
        return input.replaceAll("(" + noise + ")+", " ").trim();
    }
}
