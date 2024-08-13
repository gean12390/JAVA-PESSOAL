import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("olá mundo");
        String gean = scanner.nextLine();
        
        System.out.printf("Seu numero é %s", gean);
        scanner.close();
    }
}