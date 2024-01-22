package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QuikSortTest {

    public void quikSort() {

        List<Integer> list = Arrays.asList(14, 74, 63, 52, 25, 11, 10);

        System.out.println(list.stream().sorted().toList());
    }
}
