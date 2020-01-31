package coding.capunpon.services.string;

import java.util.regex.Pattern;

public class OccurrenceCounterService {

    public static int getOccurrence(String substring, String source) {
        return source.toLowerCase().split(Pattern.quote(substring), -1).length - 1;
    }

}
