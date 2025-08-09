import java.util.List;
import java.util.stream.Stream;

public class sequentialStream {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x -> x+1).limit(20000).toList();
        List<Long> factoriaList = list.stream().map(sequentialStream::factorial).toList();   
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
    


    private static long factorial(int n){
        long result = 1;
        for(int i=2;i<=n;i++){
            result *=i;

        }
        return result;
    }
}
