package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoYYLambda {

    public static void main(String args[]) {
//Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
	List<String> strings = Arrays.asList("ccc", "dddy", "apple");
	System.out.println(noYY(strings));

    }

    private static List<String> noYY(List<String> strings) {
	return strings.stream()
	              .map(s -> s.concat("y"))
	              .filter(s -> !s.contains("yy"))
	              .collect(Collectors.toList());
    }
}
