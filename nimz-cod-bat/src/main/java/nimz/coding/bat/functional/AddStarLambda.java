package nimz.coding.bat.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStarLambda {

    public static void main(String args[]) {
//Given a list of strings, return a list where each string has "*" added at its end.

	List<String> strings = Arrays.asList("a", "bb", "ccc");
	System.out.println(addStar(strings));

    }

    private static List<String> addStar(List<String> strings) {
	return strings.stream()
	              .map(e -> e.concat("*"))
	              .collect(Collectors.toList());
    }

  
  //return type
  // funcation name
  //body
  
  
    private static List<String> addStar1(List<String> strings) {
	List<String> strList = new ArrayList<String>();
	for (String s : strings) {
	    strList.add(s.concat("*"));
	}

	return strList;

    }
    
    
}
