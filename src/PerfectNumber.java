import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : " );
        int a = input.nextInt();

        int toplam =0;

        for ( int i =1 ; i<a ; i++) {
            if (a % i == 0) {
                toplam += i;
            }
        }
        if (a == toplam ) {
            System.out.println(a + " is a perfect number ");
        }else {
            System.out.println(a + " is not a perfect number ");
        }
    }
}
