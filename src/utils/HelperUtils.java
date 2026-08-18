package utils;
import java.util.List;
public class HelperUtils {

    private static int counter = 1;

    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    // Overloaded isEmpty:
    // Check if a List is empty
    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }



}
