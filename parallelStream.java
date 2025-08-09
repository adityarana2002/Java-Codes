import java.util.List;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String[] args) {
       long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x -> x+1).limit(20000).toList();
        List<Long> factoriaList = list.parallelStream().map(parallelStream::factorial).toList();   
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
    // This is a parallel stream version of the factorial calculation
    // It uses parallel processing to speed up the computation
    // compared to the sequential stream version
    // The main difference is that it uses parallelStream() instead of stream()
    private static long factorial(int n){
        long result = 1;
        for(int i=2;i<=n;i++){
            result *=i;

        }
        return result;
    }

}

