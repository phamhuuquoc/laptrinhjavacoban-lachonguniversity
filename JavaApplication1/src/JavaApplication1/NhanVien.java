public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;

    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public abstract double tinhLuong();

    public abstract String loaiNhanVien();

    @Override
    public String toString() {
        return "Ma NV: " + maNV + ", Ho ten: " + hoTen + ", Luong co ban: " + luongCoBan;
    }
}
