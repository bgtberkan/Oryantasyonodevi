public class Main {
    public static void main(String[] args) {
       // 1 den 100 kadar olan 5 katları olan sayıları ekrana yazdıralım
        for(int i = 1; i<101; i++){
            if (i%5==0){
                System.out.print(i + "/");
            }
        }
    }
}