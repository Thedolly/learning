import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

    public void employeeList(){

        List<String> list = new ArrayList<>();

        list.add("James");
        list.add("Jenifer");
        list.add("Nick");
        list.add("Joe");
        list.add("Harrick");
        list.add("Parth");
        list.add("Tim cook");

        System.out.println(list.stream().sorted().toList());
    }
}
