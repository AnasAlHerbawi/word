import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
       int y = scan.nextInt();
        int between =  Math.multiplyExact(x,y);
        System.out.println(between);
    }


}
