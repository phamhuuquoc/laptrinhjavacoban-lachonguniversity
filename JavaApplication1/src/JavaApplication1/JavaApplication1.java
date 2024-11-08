import java.util.Scanner; // Dùng để nhập dữ liệu từ người dùng.

public class JavaApplication1 { //Lớp chính của chương trình.
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien(); //Tạo đối tượng QuanLyNhanVien để quản lý nhân viên.
        Scanner sc = new Scanner(System.in); //Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím.
        int choice;

        do {
            System.out.println("\n--- Quan Ly Nhan Vien ---");
            System.out.println("1. Nhap thong tin nhan vien");
            System.out.println("2. Hien thi thong tin nhan vien");
            System.out.println("3. Tim kiem nhan vien theo ma so");
            System.out.println("4. Xoa nhan vien theo ma so");
            System.out.println("5. Thong ke luong theo loai nhan vien");
            System.out.println("6. Thong ke tong luong nhan vien");
            System.out.println("7. Thoat chuong trinh");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    ql.nhapThongTinNhanVien();
                    break;
                case 2:
                    ql.hienThiNhanVien();
                    break;
                case 3:
                    System.out.print("Nhap ma nhan vien can tim: ");
                    String maTimKiem = sc.nextLine();
                    ql.timKiemNhanVien(maTimKiem);
                    break;
                case 4:
                    System.out.print("Nhap ma nhan vien can xoa: ");
                    String maXoa = sc.nextLine();
                    ql.xoaNhanVien(maXoa);
                    break;
                case 5:
                    ql.thongKeLuongTheoLoai();
                    break;
                case 6:
                    ql.thongKeTongLuong();
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 7); //Vòng lặp do-while lặp lại cho đến khi người dùng chọn "Thoát chương trình" (7).
    }
}
