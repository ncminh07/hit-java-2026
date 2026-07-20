import java.util.Scanner;

    public class bai3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String matKhau;

                System.out.print("Nhập mật khẩu : ");
                matKhau = scanner.nextLine().trim(); // .trim() dùng để xóa dấu cách ở đầu và cuối dòng nhập vào

                boolean dung = true; // giả sử lệnh cuối là đúng
                boolean hasUpper = false;
                boolean hasNumber = false;

                if (matKhau.length() < 8) { // .length() : tình độ dài của chuỗi trước dấu chấm
                    System.out.print("\nMat khau phai co it nhat 8 ki tu!");
                    dung = false;
                }

                for (int i = 0; i < matKhau.length(); i++) { // đơn giản là forr trhoiiiii
                    char a = matKhau.charAt(i); // lấy từng kí tự trong chuỗi để đốibchieeus điều kiện bên dưới
                    if ('0' <= a && a <= '9') {
                        hasNumber = true;
                    }
                    if ('A' <= a && a <= 'Z') {
                        hasUpper = true;
                    }

                }
                if (!hasNumber) {
                    System.out.print("\nMat khau phai co it nhat 1 so!");
                    dung = false;
                }
                if (!hasUpper) {
                    System.out.print("\nMat khau phai co it nhat 1 chu in hoa!");
                    dung = false;
                }

                if (dung) {
                    System.out.print("Mat khau hop le");
                } else {
                    System.out.print("Mat khau khong hop le!");
                }

        }
    }
