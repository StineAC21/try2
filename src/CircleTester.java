import java.util.Scanner;
public class CircleTester {
    public static void main(String[] args) {
        Scanner timmy = new Scanner(System.in);
        try{
            int a = timmy.nextInt();
        }catch(Exception e){
            System.out.println("don't die");
        }
        System.out.println("i didn't die");
    }
}
