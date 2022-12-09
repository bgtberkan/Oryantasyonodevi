import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          /* yarı capı kullanıcı tarafından girilen bir dairenin alanını hesaplayalım
        3,141593 olan pi sabiti tanımlayınız
        */
        System.out.println("Yarı cap değerini giriniz");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        final double pi = 3.141593;
        System.out.println(r + " " + "yarı caplı dairenin alanı " + " " +  Math.pow(r,2)*pi);

    }
}