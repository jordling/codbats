package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoXLambda {

    public static void main(String args[]) {
//	Given a list of strings, return a list where each string has all its "x" removed.

	List<String> strings = Arrays.asList("ax", "xb", "xxcxx");
	System.out.println(lower(strings));

    }

    private static List<String> lower(List<String> strings) {
	return strings.stream()
	              .map(e -> e.replaceAll("x", ""))
	              .collect(Collectors.toList());
    }
}
