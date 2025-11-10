import java.util.Scanner;

class SumOfFc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = 0;

        System.out.print("Factors: ");
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum of factors: " + sum);
        sc.close();
    }
}