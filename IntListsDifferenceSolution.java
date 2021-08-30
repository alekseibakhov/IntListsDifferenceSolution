import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntListsDifferenceSolution {
    List<Integer> first = Arrays.asList(1, 3, 3, 4, 6, 5, 4);
    List<Integer> secord = Arrays.asList(6, 3, 5, 2, 2);

    difList(first, secord);
    //main task
    //Implement a logic that finds difference between "first" and "secord" lists
    // and prints the result to the console:
    // [1, 2, 4]
    //enhanced task
    //** try to come up with solution wich doesn't use set data structure
}

    private static void difList(List<Integer> first, List<Integer> secord) {

        Set firstSet = new HashSet(first);
        Set secSet = new HashSet(secord);

        Set difFirst = new HashSet(first);
        difFirst.removeAll(secSet);

        Set difSec = new HashSet(secord);
        difSec.removeAll(firstSet);

        Set difList = new HashSet(difFirst);
        difList.addAll(difSec);

        System.out.println(difList);

    }
}
