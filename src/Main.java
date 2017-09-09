import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);

        System.out.println("Given ax^2 + bx^2 + c = 0");
        System.out.println("Please enter 'a', 'b', and 'c' to determine if there are any roots: ");
        float numA = kybd.nextFloat();
        float numB = kybd.nextFloat();
        float numC = kybd.nextFloat();

        float discriminant = ((numB*numB)-(4*numA*numC));

        if (discriminant < 0){
            System.out.println("The Equation has no roots!");
        }

        else if (discriminant ==0) {
            double root = (-numB + Math.sqrt(discriminant))/(2*numA);
            System.out.println("The Equation has one root: "+ root);
        }

        else {
            double root1 = (-numB + Math.sqrt(discriminant))/(2*numA);
            double root2 = (-numB - Math.sqrt(discriminant))/(2*numA);
            System.out.println("The Equation has two roots: " + root1 + " and " + root2 + ".");
        }
    }
}

