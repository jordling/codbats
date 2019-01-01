package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZLambda {

    public static void main(String args[]) {
//Given a list of strings, return a list of the strings, omitting any string that contains a "z". 
	List<String> strings = Arrays.asList("hello", "howz", "are", "youz");

	System.out.println(noZ(strings));

    }

    private static List<String> noZ(List<String> strings) {
	return strings.stream()
	              .filter(e -> !e.contains("z"))
	              .collect(Collectors.toList());
    }
}
