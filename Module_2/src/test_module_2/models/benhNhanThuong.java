package test_module_2.models;

public class benhNhanThuong extends BenhAn {
    private  int phiNhapVien;

    public benhNhanThuong(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNhapVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNhapVien = phiNhapVien;
    }

    public benhNhanThuong() {
    }

    public int getPhiNhapVien() {
        return phiNhapVien;
    }

    public void setPhiNhapVien(int phiNhapVien) {
        this.phiNhapVien = phiNhapVien;
    }

    @Override
    public String toString() {
        return "benhNhanThuong{" +
                "phiNhapVien=" + phiNhapVien +
                '}';
    }

    @Override
    public void showInformation() {

    }


}
