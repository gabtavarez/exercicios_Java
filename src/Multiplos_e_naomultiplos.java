import java.util.Scanner;

public class Multiplos_e_naomultiplos {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int A, B;

            A = sc.nextInt();
            B = sc.nextInt();

            if (A % B == 0 || B % A == 0) {
                System.out.println("MULTIPLOS");
            }
            else {
                System.out.println("NAO MULTIPLOS");
            }

            sc.close();
        }
}
