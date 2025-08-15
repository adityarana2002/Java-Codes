class unnamedpatternandVariable {
    public static void main(String[] args) {
        try{
            double d = 100/0;
            System.out.println("Value of d is: " + d);
        }catch(Exception _){
            // This is an unnamed pattern variable
            // It can be used to catch any exception without naming it
            System.out.println("Error");
        }
    }
}