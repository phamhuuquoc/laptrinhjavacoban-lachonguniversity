public class NhanVienHanhChinh extends NhanVien { //Lớp NhanVienHanhChinh là lớp con, kế thừa từ lớp cha NhanVien.
    private int ngayCong; //Biến ngayCong lưu trữ số ngày công làm việc của nhân viên hành chính.

    public NhanVienHanhChinh(String maNV, String hoTen, double luongCoBan, int ngayCong) {
        super(maNV, hoTen, luongCoBan);
        this.ngayCong = ngayCong; 
    } //Hàm khởi tạo, sử dụng từ khóa super để gọi đến hàm khởi tạo của lớp cha và gán thêm số ngày công.

    @Override
    public double tinhLuong() {
        return luongCoBan * ngayCong;
    } // Ghi đè phương thức tinhLuong của lớp cha để tính lương theo công thức: lương = lương cơ bản * số ngày công

    @Override
    public String loaiNhanVien() {
        return "Hanh Chinh";
    } //Ghi đè phương thức để trả về loại nhân viên ("Hanh Chinh").

    @Override
    public String toString() {
        return super.toString() + ", Ngay cong: " + ngayCong + ", Luong: " + tinhLuong();
    } //  Ghi đè phương thức toString để hiển thị thông tin nhân viên, bao gồm ngày công và lương tính được.
}
