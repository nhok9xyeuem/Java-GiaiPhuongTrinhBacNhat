import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b, x;
        System.out.println("moi ban nhap gia tri thu nhat : ");
        a = scanner.nextFloat();
        System.out.println("moi ban nhap gia tri thu hai: ");
        b = scanner.nextFloat();
        if (a!=0){
            x=-b/a;
            System.out.println(" phuong trinh co nghiem la: " +x);
        }else {
            if (b==0){
                System.out.println("phuong trinh co vo so nghiem");
            }else {
                System.out.println(" phuong trinh vo nghiem");
            }
        }
    }
}
