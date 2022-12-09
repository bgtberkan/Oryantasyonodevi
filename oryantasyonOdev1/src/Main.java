
public class Main {
    public static void main(String[] args) {
        // asal sayı bulalım
        int a = 23;
        boolean asal = true;
        for(int i =2; i<a; i++){
            if(a%i==0){
                asal = false;
            }
        }
        if(asal){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }
    }
}