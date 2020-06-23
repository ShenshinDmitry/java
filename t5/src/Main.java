import java.util.Scanner;

public class Main {
    static void post(int s, int w){
        if ((s <= 1) || (w <= 1)){
            System.out.println("Введите другие значения!");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите ширину:");
            w = in.nextInt();
            System.out.println("Введите длинну:");
            s = in.nextInt();
}
        int sw = 0;
        for (int i = 0; i < s; i++){
            if (i > 0) {
                for (int g = 0; g < i; g++){
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < w; j++){
                if (j > 9){
                    System.out.print(sw);
                    sw++;
                }
                else System.out.print(j);
            }
            sw=0;
            w--;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину:");
        int w = in.nextInt();
        System.out.println("Введите длинну:");
        int s = in.nextInt();
        post(s, w);
    }
}
