import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNr = scanner.nextInt();
        int secomdNr = scanner.nextInt();
        int thirdNr = scanner.nextInt();
        System.out.print((firstNr >= secomdNr && firstNr <= thirdNr) || (firstNr <= secomdNr && firstNr >= thirdNr));
        // put your code here
    }
}