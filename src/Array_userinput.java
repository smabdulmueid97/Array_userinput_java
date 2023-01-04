import java.util.Scanner;

public class Array_userinput {
    public static void main(String[] args) {

        // x = length
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Total number of friends");
        x = input.nextInt();
        String[] names = new String[x];

        // i = counter & x = length
        for (int i = 0; i < x; i++) {
            System.out.println("Enter name of frind" + (i + 1));
            names[i] = input.next();
        }
        input.close();

        // output
        System.out.println("Your friends are");
        for (int i = 0; i < x; i++) {
            System.out.println(names[i]);
        }
    }
}
