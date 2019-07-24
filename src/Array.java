import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Wprowadź imię: ");
            names[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Wprowadzone imiona w odwrotnej kolejności to: ");
        for(int i=4;i>=0;i--){
            System.out.println("Cześć " + names[i]);
        }
    }
}