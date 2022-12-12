import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = 1;
        int printer = 1;
        while (printer <= number){
            System.out.println(printer);
            square++;
            printer = square * square;
        }
        // start coding here
    }
}