import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ucret;
        double kdv_oran = 0.18;
        double kdv_oran2 =0.08;
        System.out.println("Ücreti giriniz:");
        ucret = input.nextInt();
        double kdvli_ucret = (ucret <= 1000) ? (ucret+(ucret*kdv_oran)):(ucret+(ucret*kdv_oran2));
        System.out.println("KDV li ücret :" + kdvli_ucret);
        }
    }

