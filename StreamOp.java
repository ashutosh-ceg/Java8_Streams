import java.util.*;
import java.util.stream.Stream;

public class StreamOp {
    public static void main(String[] args) {
      // List to stream
      List<Integer> list= Arrays.asList(1,2,3,4,5);
      Stream<Integer> str=list.stream();
      
      System.out.println(list);
      System.out.println(str);
      
      // Set to stream
      Set<String> hset=new HashSet<>(Arrays.asList("A","B","C") );
      Stream<String> hstr=hset.stream();
      hstr.forEach(System.out::println);
      
      // Array to stream
      int arr[] = {1,2,3,5,6};
      Stream<Integer> strarr = Arrays.stream(arr).boxed();
      strarr.forEach(System.out::println);
      
      
  }
}
