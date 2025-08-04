class  LinearSearchingusingfunction {
    public static void main(String[] args) {
        
        int[] nums = {1,3,54,65,34,23,45,23,45,2345,3456,23,23,324,45,45,234};
        int target = 34;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }
     static int linearSearch(int[] arr , int target){
            if(arr.length ==0){
                return  -1;
            }


            for(int i =0;i<arr.length;i++){
                if(arr[i]== target){
                    return i;
                }
            }
            return -1;
        }
}