import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fullNr = scanner.nextInt();
        int firstNr = fullNr/100;
        int secondNr = (fullNr - 100 * firstNr) / 10;
        int thirdNr = ((fullNr - 100 * firstNr) -10 * secondNr) / 1;
        System.out.println(firstNr + secondNr + thirdNr);
        // put your code here
    }
}