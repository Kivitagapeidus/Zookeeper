import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = 0;
        int seq = scanner.nextInt();

        while( seq != 0){
            lenght++;
            seq = scanner.nextInt();

        }
        System.out.println(lenght);// start coding here
    }
}