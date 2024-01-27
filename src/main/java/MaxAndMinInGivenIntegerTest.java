import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMinInGivenIntegerTest {

    public void maxMinFromIntegers(){

        List<Integer> list = Arrays.asList(34,76,2,12,45,90);

        System.out.println(list.stream().max(Integer::compareTo).orElse(null));

        System.out.println(list.stream().min(Integer::compareTo).orElse(null));


    }

}
