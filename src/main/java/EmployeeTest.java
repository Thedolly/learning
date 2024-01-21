import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {

    public void employeeList() {

        List<String> list = Arrays.asList("James", "Jenifer", "Nick", "Joe", "Harrick", "Parth", "Timcook");

        Collections.sort(list, Comparator.comparingInt(String::length));

        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();

    }
}
