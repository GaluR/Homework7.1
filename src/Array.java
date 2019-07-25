import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a=5;
        String[] names = new String[a];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Wprowadź imię: ");
            names[i] = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Wprowadzone imiona w odwrotnej kolejności to: ");
        for(int i=names.length-1;i>=0;i--){
            System.out.println("Cześć " + names[i]);
        }
    }
}