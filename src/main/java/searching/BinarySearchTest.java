package searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    public int binarySearch(){

        List<Integer> list = Arrays.asList(23,65,43,1,34,32,90);

       List<Integer> list1 = list.stream().sorted().toList();

       System.out.println(list1);

       int low = 0;
       int high = list1.size()-1;
       int mid = 0;
       int key = 43;

       while(low<=high)
       {
           mid = (low+high)/2;

           if(key==list1.get(mid))
           {
               return mid;
           }else if(key<list1.get(mid))
           {
               high = mid-1;
           }else
           {
              low = mid+1;
           }
       }

        return -1;
    }
}
