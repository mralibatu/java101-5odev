import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int yaricap,merkezaci;
        double alan;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Yaricapi giriniz : ");
        yaricap = girdi.nextInt();
        System.out.println("Merkez aci olcusu giriniz : ");
        merkezaci = girdi.nextInt();

        alan = (3.14 * (yaricap * yaricap) * merkezaci)/360;

        System.out.println("Alan : " + alan);

    }
}
