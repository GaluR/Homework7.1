import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        String[] names = new String[a];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a; i++) {
            System.out.println("Wprowadź imię: ");
            names[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Wprowadzone imiona w odwrotnej kolejności to: ");
        for(int i=a-1;i>=b;i--){
            System.out.println("Cześć " + names[i]);
        }
    }
}