/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benhvien;

public class BenhVien {

    public static void main(String[] args) {

        BacSi bs1 = new BacSiChuyenKhoa("Lê Văn A", 40, "Khoa nội", 21);
        bs1.hienThi();
        BacSi bs2 = new BacSiChuyenKhoa("Lê Văn B", 32, "Khoa ngoại", 10);
        bs2.hienThi();
        BacSi bs3 = new BacSiChuyenKhoa("Lê Thị C", 43, "Khoa sản", 22);
        bs3.hienThi();
        BacSi bs4 = new BacSi("Lê Thị C", 36);
        bs4.hienThi();
    }

}
