import java.util.*;
class LinearSearching{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array :");   
     int[] arr = new int[sc.nextInt()];
        
     for(int i=0;i<arr.length;i++){
        System.out.println("Enter the element at index " + i+ ":");
        arr[i] = sc.nextInt();
     }   

     System.out.println("Enter the element to be searched: ");
     int key = sc.nextInt();


     for(int i = 0;i<arr.length;i++){
        if(arr[i]== key){
            System.out.println("Element found ar index " + i);
            break;
        }
        else{
            System.out.println("Element not found");
        }
     }
    }
}