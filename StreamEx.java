import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,3,9, 53, 23);

        // Stream<Integer> data= nums.stream();
        // Stream<Integer> mappedData = data.map(n->n*2);
        // mappedData.forEach(n->System.out.println(n));

    //     nums.stream().map(n->n*2)
    //    .forEach(n->System.out.println(n)); // . means every time it make new stream


        // even odd

        // nums.stream().filter(n->n%2==0)
        // .forEach(n->System.out.println(n));
        // nums.stream().filter(n->n%2!=0).forEach(n->System.out.println(n));

        // // sorted
        // nums.stream().sorted().forEach(System.out::println);// reference  method
         nums.stream().sorted().skip(2).limit(1).forEach(c->System.out.println(c));// reference  method

    }
}
