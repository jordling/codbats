package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreYLambda {

    public static void main(String args[]) {
//Given a list of strings, return a list where each string has "y" added at its start and end.


	List<String> strings = Arrays.asList("a", "bb", "ccc");
	System.out.println(moreY(strings));

    }

    private static List<String> moreY(List<String> strings) {
	return strings.stream()
	              .map(e -> "y".concat(e).concat("y"))
	              .collect(Collectors.toList());
    }
}
