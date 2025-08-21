import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Calculate the difference between products (A*B - C*D):");

        System.out.print("Enter value A: ");
        int a = getValidInt(sc);

        System.out.print("Enter value B: ");
        int b = getValidInt(sc);

        System.out.print("Enter value C: ");
        int c = getValidInt(sc);

        System.out.print("Enter value D: ");
        int d = getValidInt(sc);

        System.out.printf("Difference = %d", product.getDifferenceBetweenProducts(a, b, c, d));
        sc.close();
    }

    private static int getValidInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer: ");
            sc.next();
        }
        return sc.nextInt();
    }
}