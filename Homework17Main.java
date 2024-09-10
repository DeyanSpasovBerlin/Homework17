import java.util.Scanner;

public class Homework17Main {
    public static void main(String[] args) {
        Homework17Zada4a1 zad1 = new Homework17Zada4a1();
        Homework17Zada4a2 zad2 = new Homework17Zada4a2();
        Homework17Zada4a3 zad3 = new Homework17Zada4a3();
        Scanner reader = new Scanner(System.in);
        Integer chois;
        do{
            System.out.println("\nInput: \t1.Zada4a 1; \t2.Zada4a2 \t3.Zada4a3 \t4.Exit\n");
            chois = reader.nextInt();
            if(chois.equals(1)){
                zad1.printZad1();
            } else if (chois.equals(2)) {
                zad2.printZad2();
            } else if (chois.equals(3)) {
               zad3.printZad3();
            } else if (chois.equals(4)) {
                System.out.println("Goodbay");
                break;
            }else {
                System.out.println("Input 1 or 2 or 3 or 4!");
                continue;
            }


        }while (true);

    }
}
