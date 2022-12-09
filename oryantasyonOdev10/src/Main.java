public class Main {
    public static void main(String[] args) {
        // 1 den 100 kadar olan 3 ve 6 ya tam bölünen sayıları ekrana yazdıralım
        for(int i = 1; i<100; i++){
            if(i%3==0 && i%6==0){
                System.out.print(i + "/");
            }
        }
    }
}