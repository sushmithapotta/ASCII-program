import java.util.Scanner;

public class ASCIIvalues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a charector:");
        char ch=scanner.next().charAt(0);
        scanner.close();
        int asciivalues=ch;
        System.out.println("the ASCII value of ' " + ch + "' is:" + asciivalues);
    }
}
