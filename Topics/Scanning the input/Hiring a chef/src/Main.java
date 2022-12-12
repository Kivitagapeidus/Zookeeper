import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String yearsOfExperience = scanner.next();
        String favouriteCuisine = scanner.next();

        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef who cooks " + favouriteCuisine + " dishes and has " + yearsOfExperience + " years of experience.\n");// start coding here
    }
}