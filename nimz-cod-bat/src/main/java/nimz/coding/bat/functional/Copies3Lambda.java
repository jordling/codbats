package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3Lambda {

    public static void main(String args[]) {
//Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


	List<String> strings = Arrays.asList("a", "bb", "ccc");
	System.out.println(addStar(strings));

    }

    private static List<String> addStar(List<String> strings) {
	return strings.stream()
	              .map(e -> e.concat(e).concat(e))
	              .collect(Collectors.toList());
    }
}