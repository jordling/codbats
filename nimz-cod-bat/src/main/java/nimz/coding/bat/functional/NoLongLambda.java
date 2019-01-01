package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoLongLambda {

    public static void main(String args[]) {
//Given a list of strings, return a list of the strings, omitting any string length 4 or more.

	List<String> strings = Arrays.asList("cccc", "cc", "cccc");
	System.out.println(noLong(strings));

    }

    private static List<String> noLong(List<String> strings) {
	return strings.stream()
	              .filter(e -> e.length() < 4)
	              .collect(Collectors.toList());
    }
}
