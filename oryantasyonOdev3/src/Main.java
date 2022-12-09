public class Main {
    public static void main(String[] args) {
       //iki sayının arkadaş sayı  olup olmadığını bulalım
        int sayi1 = 1184;
        int sayi2 = 1210;
        int tot1 =  0;
        int tot2 = 0;
        for(int i = 1; i<sayi1; i++ ){
            if (sayi1%i==0){
                tot1 = tot1 + i;
            }
        }
        for(int i = 1; i<sayi2; i++ ){
            if (sayi2%i==0){
                tot2 = tot2 + i;
            }
        }
        if(sayi1 == tot2 && sayi2 == tot1){
            System.out.println("Bu iki sayı arkadaş sayıdır");
        }
        else{
            System.out.println("Bu iki sayı arkadaş sayı değildir");
        }

    }
}