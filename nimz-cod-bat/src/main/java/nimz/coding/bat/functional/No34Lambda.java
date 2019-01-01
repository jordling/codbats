package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No34Lambda {

    public static void main(String args[]) {
//	Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

	List<String> strings = Arrays.asList("ccc", "dddd", "apple");
	System.out.println(no34(strings));

    }

    private static List<String> no34(List<String> strings) {
	return strings.stream()
	              .filter(s -> s.length() != 3 && s.length() != 4)
	              .collect(Collectors.toList());
    }
}
