import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfDecimalReverseOrderTest {

    public void decimalInReverseOrder(){

        List<Double> list = Arrays.asList(2.555,25.3658,0.259,54.68741,0.001458);
        List<Double> newlist = list.stream().sorted().toList();
       System.out.println(newlist);

       for (int i=newlist.size()-1; i>=0; i--){
           System.out.println(newlist.get(i));
       }
    }
}
