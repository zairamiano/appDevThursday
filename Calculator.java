public class Calculator {

    // Group 8: Max (Members: Estonilo, Batuigas, Bautista, Allosada, Bañas, Mahinay, Cerzo, Indonilla, Clapis, Urmatam, Larioza)
    public static int add(int a, int b) {
        return a + b;
    }

    // Group 8: Max method
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Other groups will add their methods here
}

   // Group 7: Cube Method (Members: Galvan, Delbo,  Geringer, Policarpio, Smith, Miano, Cequena, Nuñez, Penales, Lopez )
    public static int cube(int a) {
        return a * a * a;
    }

   
public class Calculator {
    // Group 3: Multiply (Members: Hernandez, Pascua, Mocadiman, Gamoranao, Camacan, Deguzman, Mates)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Product: " + Calculator.multiply(num1, num2));
    }
}


    //Group 2: Subtract (Members: Piano, Bermejo, Pol, DelaTorre, Rodrigo, Tuazon, Melendres, Tejado)
    public static int subtract(int a, int b) {
        return a - b;

     // Other groups will add their methods here

  //Group 4: Division (Members: Alcantara, Dolom, Gejos, Delavega, Bautista-J, Castilo, Deauna, Cahig, Valdez, Reyes, Sandoval)
    public static double divide(int a, int b) {
        if (b==0){
            throw new 
            ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a/b;
    }
    


     // Group 11: Square Root (Members: ClarkKurt, ClarkKleine, Gollena, Lorca, Perez)
     public static double sqrt(int a) {
        return (double) Math.sqrt(a);
    }

   // Group 4: Division (Members: ClarkKurt, ClarkKleine, Gollena, Lorca, Perez)
    public static double divide(int a, int b) {
        return (double) a/b;

    }

  

// Group 5: Modulus (Members: Granado, Raquino, Torres, Beto, JMasagca, Gorpido, Palatan, Oliveros, Rosales, NMasagca, Sonajo)
public static int modulus(int a, int b) {
    return a % b;
}

