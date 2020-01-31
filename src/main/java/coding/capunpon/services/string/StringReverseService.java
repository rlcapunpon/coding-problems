package coding.capunpon.services.string;

public class StringReverseService {
    public static String reverse(String s) {
        StringBuffer sbf = new StringBuffer(s);
        return sbf.reverse().toString();
    }
}
