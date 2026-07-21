import java.util.Scanner;

public class bai4 {

    public static double findMax(double[] arr) {
        double max = arr[0];
        for( double diem : arr){
            if(max < diem){
                max = diem;
            }
        }
        return max;
    }
    public static double calculateAverage(double[] arr){
       double tong = 0;
        for( double diem : arr){
            tong += diem;
        }
        return tong / arr.length;
    }
    public static int countFailedStudents(double[] arr) {
        int soLan = 0;
        for (double diem : arr) {
            if (diem < 5) {
                soLan++;
            }
        }
        return soLan;
    }

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhap so học sinh : ");
        n = Integer.parseInt(scanner.nextLine());
        while(n < 1){
            System.out.print("Nhap lai so học sinh ( >= 1 ) : ");
            n = Integer.parseInt(scanner.nextLine());
        }
        double [] arr = new double[n];

        for(int i = 0; i < n ; i++){
            System.out.print("\nNhap so diem cua học sinh thứ " + (i+1) + " : ");
            arr[i] = Double.parseDouble(scanner.nextLine());
            while(arr[i] <0.0 || arr[i] > 10.0){
                System.out.print("\nNhap lai so diem cua học sinh thứ " + (i+1) + " : ");
                arr[i] = Double.parseDouble(scanner.nextLine());
            }
        }
        double diemCaoNhat = findMax(arr);
        double diemTrungBinh = calculateAverage(arr);
        int soHocSinhDuoiTB = countFailedStudents(arr);

        System.out.printf("Điểm cao nhất: %.2f%n", diemCaoNhat);
        System.out.printf("Điểm trung bình: %.2f%n", diemTrungBinh);
        System.out.println("Số học sinh có điểm dưới trung bình (< 5.0): " + soHocSinhDuoiTB);




    }
}
