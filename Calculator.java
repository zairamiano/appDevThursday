public class Calculator {
   // Group 1: Addition (Members: John, Sarah, Alex)
    public static int add(int a, int b) {
        return a + b;
    }

     // Other groups will add their methods here
  //Group 4: Division (Members: Alcantara, Dolom, Gejos, Delavega, Bautista-J, Castilo, Deauna, Cahig, Valdez, Reyes, Sandoval)
    public static double divide(int a, int b) {
        if (b==0){
            throw new 
            ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a/b;
    }
    
}
