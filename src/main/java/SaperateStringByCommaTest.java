import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SaperateStringByCommaTest {

    public void saperateStringByComma(){

        List<String> list = Arrays.asList("Radhe","Ram","ShreeRam","SiyaRam","Krishn", "Vishnu");

       System.out.println(list.stream().collect(Collectors.joining(",")));

    }
}
