import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    // Danh sách nhân viên được quản lý bởi lớp này
    private ArrayList<NhanVien> danhSachNhanVien;

    // Hàm khởi tạo: Tạo danh sách nhân viên trống
    public QuanLyNhanVien() {
        danhSachNhanVien = new ArrayList<>();
    }

    // Phương thức để nhập thông tin cho nhân viên mới
    public void nhapThongTinNhanVien() {
        Scanner sc = new Scanner(System.in);
        
        // Nhập mã nhân viên
        System.out.print("Nhap ma nhan vien: ");
        String maNV = sc.nextLine();
        
        // Nhập họ tên nhân viên
        System.out.print("Nhap ho ten nhan vien: ");
        String hoTen = sc.nextLine();
        
        // Nhập lương cơ bản của nhân viên
        System.out.print("Nhap luong co ban: ");
        double luongCoBan = sc.nextDouble();

        // Chọn loại nhân viên (1. Hành Chính, 2. Kinh Doanh)
        System.out.print("Nhan vien thuoc loai nao (1. Hanh Chinh, 2. Kinh Doanh)? ");
        int loaiNV = sc.nextInt();

        // Nếu nhân viên là hành chính, nhập thêm thông tin số ngày công
        if (loaiNV == 1) {
            System.out.print("Nhap so ngay cong: ");
            int ngayCong = sc.nextInt();
            danhSachNhanVien.add(new NhanVienHanhChinh(maNV, hoTen, luongCoBan, ngayCong));
        } 
        // Nếu là nhân viên kinh doanh, nhập thêm lương kinh doanh
        else if (loaiNV == 2) {
            System.out.print("Nhap luong kinh doanh: ");
            double luongKinhDoanh = sc.nextDouble();
            danhSachNhanVien.add(new NhanVienKinhDoanh(maNV, hoTen, luongCoBan, luongKinhDoanh));
        }
    }

    // Phương thức hiển thị thông tin tất cả nhân viên trong danh sách
    public void hienThiNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            // Nếu danh sách rỗng, thông báo không có nhân viên
            System.out.println("Khong co nhan vien nao trong danh sach.");
        } else {
            // Duyệt qua danh sách và in ra thông tin từng nhân viên
            for (NhanVien nv : danhSachNhanVien) {
                System.out.println(nv.toString());
            }
        }
    }

    // Phương thức tìm kiếm nhân viên theo mã số
    public void timKiemNhanVien(String maNV) {
        // Duyệt qua danh sách để tìm nhân viên có mã trùng khớp
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(maNV)) {
                // Nếu tìm thấy, in thông tin nhân viên
                System.out.println("Nhan vien tim thay: " + nv.toString());
                return;
            }
        }
        // Nếu không tìm thấy, thông báo không có nhân viên với mã đó
        System.out.println("Khong tim thay nhan vien voi ma: " + maNV);
    }

    // Phương thức xóa nhân viên theo mã số
    public void xoaNhanVien(String maNV) {
        // Duyệt qua danh sách để tìm nhân viên có mã trùng khớp
        for (NhanVien nv : danhSachNhanVien) {
            if (nv.getMaNV().equals(maNV)) {
                // Nếu tìm thấy, xóa nhân viên đó khỏi danh sách
                danhSachNhanVien.remove(nv);
                System.out.println("Nhan vien da duoc xoa.");
                return;
            }
        }
        // Nếu không tìm thấy, thông báo không có nhân viên với mã đó
        System.out.println("Khong tim thay nhan vien voi ma: " + maNV);
    }

    // Phương thức thống kê lương theo loại nhân viên (Hành chính và Kinh doanh)
    public void thongKeLuongTheoLoai() {
        double tongLuongHanhChinh = 0, tongLuongKinhDoanh = 0;

        // Duyệt qua danh sách và tính tổng lương cho từng loại nhân viên
        for (NhanVien nv : danhSachNhanVien) {
            if (nv instanceof NhanVienHanhChinh) {
                tongLuongHanhChinh += nv.tinhLuong();
            } else if (nv instanceof NhanVienKinhDoanh) {
                tongLuongKinhDoanh += nv.tinhLuong();
            }
        }

        // In ra tổng lương của từng loại nhân viên
        System.out.println("Tong luong nhan vien hanh chinh: " + tongLuongHanhChinh);
        System.out.println("Tong luong nhan vien kinh doanh: " + tongLuongKinhDoanh);
    }

    // Phương thức thống kê tổng lương của tất cả nhân viên
    public void thongKeTongLuong() {
        double tongLuong = 0;

        // Duyệt qua danh sách và tính tổng lương
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuong();
        }

        // In ra tổng lương của tất cả nhân viên
        System.out.println("Tong luong cua tat ca nhan vien: " + tongLuong);
    }
}
