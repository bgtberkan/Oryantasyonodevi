public class Main {
    public static void main(String[] args) {
       // fibinocci dizisinin ilk 10 terimini bulalım
        // 1 1 2 3 5
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " " );
        for (int i = 1; i<9; i++ ){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}