
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== QUAN LY THU VIEN SACH =====");

        // BAI 1: NHAP N SACH
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] maSach = new String[n];
        String[] tenSach = new String[n];
        int[] soLuong = new int[n];
        double[] donGia = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sach thu " + (i + 1));

            System.out.print("Ma sach: ");
            maSach[i] = sc.nextLine();

            System.out.print("Ten sach: ");
            tenSach[i] = sc.nextLine();

            System.out.print("So luong: ");
            soLuong[i] = sc.nextInt();

            System.out.print("Don gia: ");
            donGia[i] = sc.nextDouble();
            sc.nextLine();
        }

        // BAI 3: MENU LAP DEN KHI THOAT
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Hien thi danh sach sach");
            System.out.println("2. Tinh tong so luong va gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("\n===== DANH SACH SACH =====");

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nMa sach: " + maSach[i]);
                        System.out.println("Ten sach: " + tenSach[i]);
                        System.out.println("So luong: " + soLuong[i]);
                        System.out.println("Don gia: " + donGia[i]);
                    }
                    break;

                // BAI 2: TINH TONG SO LUONG VA GIA TRI
                case 2:
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += soLuong[i] * donGia[i];
                    }

                    System.out.println("\nTong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;

                // BAI 4: TIM SACH THEO MA
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();

                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maCanTim)) {
                            System.out.println("\nDa tim thay sach!");
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("So luong: " + soLuong[i]);
                            System.out.println("Don gia: " + donGia[i]);

                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
