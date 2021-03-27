package test_module_2.models;

public class benhNhanVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public benhNhanVip(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public benhNhanVip() {
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "benhNhanVip{" +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip=" + thoiHanVip +
                '}';
    }

    @Override
    public void showInformation() {

    }
}
