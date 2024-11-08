public class NhanVienKinhDoanh extends NhanVien {
    private double luongKinhDoanh;

    public NhanVienKinhDoanh(String maNV, String hoTen, double luongCoBan, double luongKinhDoanh) {
        super(maNV, hoTen, luongCoBan);
        this.luongKinhDoanh = luongKinhDoanh;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + luongKinhDoanh;
    }

    @Override
    public String loaiNhanVien() {
        return "Kinh Doanh";
    }

    @Override
    public String toString() {
        return super.toString() + ", Luong kinh doanh: " + luongKinhDoanh + ", Luong: " + tinhLuong();
    }
}
