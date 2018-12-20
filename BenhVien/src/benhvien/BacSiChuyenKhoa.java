/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benhvien;

public class BacSiChuyenKhoa extends BacSi {

    protected String khoa;
    protected int soNamCongTac;

    public BacSiChuyenKhoa(String ht, int t, String k, int ct) {
        super(ht, t);
        khoa = k;
        soNamCongTac = ct;

    }

    public void ganChuyenKhoa(String k) {
        khoa = k;
    }

    public void ganSoNamCongTac(int ct) {
        soNamCongTac = ct;
    }

    public String layChuyenKhoa() {
        return khoa;
    }

    public int laySoNamCongTac() {
        return soNamCongTac;
    }

    public static boolean kiemtra_soNamCongTac(int soNamCongTac) {
        if (soNamCongTac > 20) {
            return true;
        } else {
            return false;
        }
    }

    public void hienThi() {
        System.out.println(" Tên bác sĩ:" + hoTen + " // Tuổi:" + tuoi + " // Khoa làm việc:" + khoa + " // Số năm công tác:" + soNamCongTac + " // Trình độ(>20 năm):" + kiemtra_soNamCongTac(soNamCongTac));
    }
}
