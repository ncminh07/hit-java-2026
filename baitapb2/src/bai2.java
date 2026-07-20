import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

            System.out.print("Nhap canh a : ");
             a = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhap canh b : ");
            b = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhap canh c : ");
             c = Integer.parseInt(scanner.nextLine());

        while( a + b <= c || b + c <= a || a + c <=b){
            System.out.println("Tam giac vua nhap khong hop le ! ");
            System.out.print("Nhap lai canh a : ");
            a = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhap lai canh b : ");
            b = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhap lai canh c : ");
            c = Integer.parseInt(scanner.nextLine());
        }
        if(a == b && b == c) {
            System.out.print("\nTam giac nay la tam giac deu.");
        }
        else if (( a==b || b == c || c == a ) && !( a==c && a == b ) ){
            System.out.print("\nTam giac nay la tam giac can.");
        }
        else {
            System.out.print("%nTam giac nay la tam giac thuong.");
        }

        int chuVi = a + b + c;
        double P = (double)chuVi / 2; // nửa chu vi
        double dienTich = Math.sqrt( P*(P-a) *(P-b) *(P-c) );

        System.out.printf("\nChu vi : %d", chuVi);
        System.out.printf("\nDien tich : %.2f", dienTich);

    }
}
