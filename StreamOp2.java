import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamOp2 {
    public static void main(String[] args) {
      // Stream.of 
      Stream<Integer> streams = Stream.of(1,2,3,4);
      streams.forEach(System.out::println);
      
      // Filtering elements
      List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
      List<Integer> evenList= list.stream().filter(num->num%2==0).collect(Collectors.toList());
      System.out.println("\n Even List");
      evenList.forEach(System.out::println);
      
      // Transforming Data Using map()
      
      List<Integer> intList= Arrays.asList(1,2,3,4,5,6);
      List<Integer> squareList= intList.stream().map(num->num*num).collect(Collectors.toList());
      System.out.println("\n Square List");
      squareList.forEach(System.out::println);
      
      // Using flatMap() for Nested Lists
      System.out.println("\n Nested List");
      
      List<List<Integer>> list1=Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8));
      List<Integer> flatMapList=list1.stream().flatMap(Collection ::stream).collect(Collectors.toList());
      flatMapList.forEach(e->System.out.println(e));
      
      // Removing Duplicates Using distinct()
      System.out.println("\n Distinct List");
      
      List<Integer> list2= new ArrayList<Integer>();
      list2.add(1);
      list2.add(2);
      list2.add(1);
      list2.add(3);
      list2.add(2);
      
      List<Integer> distinctList=list2.stream().distinct().collect(Collectors.toList());
      distinctList.forEach(System.out::println);
      
      // Sorting a List Using sorted()
      
      List<Integer> list3=Arrays.asList(1,3,2,5,4,7,6);
      List<Integer> sortedList=list3.stream().sorted().collect(Collectors.toList());
      System.out.println("\n Sorted List");
      sortedList.forEach(System.out::println);
      
      // Aggregation Using reduce()
      
      List<Integer> list4= Arrays.asList(1,2,3,4,5);
      int sum=list4.stream().reduce(0, Integer::sum);
      System.out.println("Reduce List Or sum of list "+sum);
      
      
  }
}
