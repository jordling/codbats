package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerLambda {

    public static void main(String args[]) {
//Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


	List<String> strings = Arrays.asList("A", "BB", "cCcc");
	System.out.println(lower(strings));

    }

    private static List<String> lower(List<String> strings) {
	return strings.stream()
	              .map(e -> e.toLowerCase())
	              .collect(Collectors.toList());
    }
}
