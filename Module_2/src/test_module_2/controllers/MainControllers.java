package test_module_2.controllers;

import Furama_resort.commons.Validators;
import test_module_2.commons.FileUtilsModule2;
import test_module_2.commons.StringUtilsModules2;
import test_module_2.commons.ValidatorsModules2;
import test_module_2.models.BenhAn;
import test_module_2.models.benhNhanThuong;
import test_module_2.models.benhNhanVip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControllers {
    public static Scanner scanner = new Scanner((System.in));
    public static boolean isExit;

    public static void main(String[] args) {
        MainControllers.displayMainMenu();
    }

    public static String VIP = "benhNhanVip";
    public static String NOMAl = "benhNhanThuong";
    public static  boolean isBackToMenu;


    private static void displayMainMenu() {
        int choose = 0;
        System.out.println(" --CHUONG TRINH QUAN LY BENH AN--\n" +
                "Chọn chức năng:\n" +
                "1. Thêm mới\n" +
                "2. Xoa\n" +
                "3. Xem danh sách bệnh án\n" +
                "4. Thoát\n");
        System.out.println("please choose");
        choose = scanner.nextInt();
        do {
            switch (choose){
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    isExit = true;
                    break;
            }if (isExit){
                break;
            }
        }while (choose >=1&& choose<=4);
    }

    public static List<BenhAn> readAllBenhAn(String fileName){
        FileUtilsModule2.setFullPathFile(fileName);
        List<String> propertiesBenhAn = FileUtilsModule2.readFile();
        List<BenhAn> benhAnList = new ArrayList<>();
        String[] propertiesElement = null;

        BenhAn benhAn = null;
        for (String properties : propertiesBenhAn){
            propertiesElement = properties.split(StringUtilsModules2.COMMA);
            if (fileName.equals(NOMAl)){
                benhAn = new benhNhanThuong();

                ((benhNhanThuong) benhAn).setPhiNhapVien(Integer.parseInt(propertiesElement[6]));
            }else if (fileName.equals(VIP)){
                benhAn = new benhNhanVip();

                ((benhNhanVip) benhAn).setLoaiVip(propertiesElement[6]);
                ((benhNhanVip) benhAn).setThoiHanVip(propertiesElement[7]);
            }
            benhAn.setSoThuTu(Integer.parseInt(propertiesElement[0]));
            benhAn.setMaBenhAn(propertiesElement[1]);
            benhAn.setTenBenhNhan(propertiesElement[2]);
            benhAn.setNgayNhapVien(propertiesElement[3]);
            benhAn.setNgayRaVien(propertiesElement[4]);
            benhAn.setLyDoNhapVien(propertiesElement[5]);

            benhAnList.add(benhAn);
        }
        return benhAnList;
    }

    private static void show() {
        int choose =0;
        do {
            System.out.println("1. xem benh an thuong"+
                    "2. xem benh an vip"+
                    "3. ve menu");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    showAll(NOMAl);
                    isBackToMenu = false;
                    break;
                case 2:
                    showAll(VIP);
                    isBackToMenu = false;
                    break;
                case 3:
                    isBackToMenu = true;
                    break;
            }
            if(isBackToMenu || isExit) {
                return;
            }
        }while (choose >=1 && choose <=3);
    }

    private static void showAll(String  fileName) {
        System.out.println("danh sach benh an");
        for (BenhAn benhAn : readAllBenhAn(fileName)){
            benhAn.showInformation();
        }
    }

    private static void delete() {
    }

    private static void addNew() {
        int choose = 0;
        do {
            System.out.println("1. Thêm mới benh nhan thuong\n" +
                    "2. them moi benh nhan Vip\n" +
                    "3. quay lai");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    addNew(NOMAl);
                    isBackToMenu = false;
                    break;
                case 2:
                    addNew(VIP);
                    isBackToMenu = false;
                    break;
                case 3:
                    isBackToMenu = true;
            }
            if (isBackToMenu || isExit) {
                return;
            }
        } while (choose >= 1 && choose <= 3);
    }

    private  static void addNew(String fileName){

        System.out.println("nhap so thu tu");
        int soThuTu = scanner.nextInt();

        scanner.nextLine();
        String maBenhAn = null;
            System.out.println("nhap ma benh an");
            maBenhAn = scanner.nextLine();
            ValidatorsModules2.isValidRegex(maBenhAn,ValidatorsModules2.BENH_AN_REGEX);

        scanner.nextLine();
        String tenBenhNhan = null;
            System.out.println("nhap ma benh nhan");
            tenBenhNhan = scanner.nextLine();
            ValidatorsModules2.isValidRegex(tenBenhNhan,ValidatorsModules2.BENH_NHAN_REGEX);

        String ngayNhapVien = null;
            System.out.println("nhap ngay nhap vien ");
            ngayNhapVien = scanner.nextLine();
            ValidatorsModules2.isValidRegex(ngayNhapVien,ValidatorsModules2.NGAY_REGEX);

        String ngayRaVien = null;
            System.out.println("nhap ngay ra vien");
            ngayRaVien = scanner.nextLine();
            ValidatorsModules2.isValidRegex(ngayRaVien,ValidatorsModules2.NGAY_REGEX);

        System.out.println("ly do nhap vien");
        String lyDoNhapVien = scanner.nextLine();

        FileUtilsModule2.setFullPathFile(fileName);
        if (fileName.equals(NOMAl)){

            System.out.println("nhap phi nhap vien");
            int phiNhapVien = scanner.nextInt();

            FileUtilsModule2.writeFile(new  String[]{String.valueOf(soThuTu), String.valueOf(maBenhAn),tenBenhNhan, ngayNhapVien, ngayNhapVien, lyDoNhapVien,
                    String.valueOf(phiNhapVien)});
        }else if (fileName.equals(VIP)){

            String loaiVip = null;
                System.out.println("nhap loai Vip");
                loaiVip = scanner.nextLine();
                ValidatorsModules2.isValidRegex(loaiVip,ValidatorsModules2.VIP_REGEX);

            String thoiHanVip = null;
                System.out.println("nhap thoi han vip");
                thoiHanVip = scanner.nextLine();
                ValidatorsModules2.isValidRegex(thoiHanVip,ValidatorsModules2.NGAY_REGEX);

            FileUtilsModule2.writeFile(new  String[]{String.valueOf(soThuTu), String.valueOf(maBenhAn),tenBenhNhan, ngayNhapVien, ngayNhapVien, lyDoNhapVien,
                    loaiVip, String.valueOf(thoiHanVip)});
        }


    }
    }

