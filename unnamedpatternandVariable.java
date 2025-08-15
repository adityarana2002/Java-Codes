class unnamedpatternandVariable {
    public static void main(String[] args) {
        try{
            double d = 100/0;
            System.out.println("Value of d is: " + d);
        }catch(Exception _){ // Using an unnamed pattern variable
            // The underscore (_) is used as a placeholder for the exception variable
            // This allows us to catch the exception without naming it
            // It is a common convention in Java to use an underscore for unnamed variables
            // This is useful when you want to catch an exception but do not need to use the
            // exception object itself in the catch block
            // This is an unnamed pattern variable
            // It can be used to catch any exception without naming it
            System.out.println("Error");
        }
    }
}