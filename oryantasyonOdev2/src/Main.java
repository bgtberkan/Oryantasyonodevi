import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      // Klavyeden girilen sayının mükemmel sayı olup olmadığını kontrol edelim
        // 6, 1+2+3=6
        System.out.println("Lütfen sayı girişi yapınız");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int tot=0;
        for(int i =1; i<num; i++){
            if(num%i==0){
                tot = tot + i;
            }
        }
        if(num==tot){
            System.out.println("Sayı mükemmel sayıdır");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir");
        }

    }
}