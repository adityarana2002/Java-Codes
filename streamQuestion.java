import java.util.ArrayList;

class streamQuestion{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");
        list.add("grape");
        list.add("honeydew");
        list.add("kiwi");
        list.add("lemon");
        list.add("apricot");
        
       System.out.println( list.stream().filter(name -> name.startsWith("a")).count());
       
        


    }
}