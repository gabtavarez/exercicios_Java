import java.util.Scanner;

public class hora_jogo {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int horainicial = sc.nextInt();
            int horafinal = sc.nextInt();
            int horatotal = horafinal + horainicial;

            System.out.println("O JOGO DUROU: " + horatotal + " HORAS");

            sc.close();
        }
    }
