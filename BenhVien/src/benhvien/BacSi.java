/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benhvien;

public class BacSi {

    protected String hoTen;
    protected int tuoi;

    public BacSi(String ht, int ns) {
        hoTen = ht;
        tuoi = ns;
    }

    public void ganHoTen(String ht) {
        hoTen = ht;
    }

    public void ganTuoi(int t) {
        tuoi = t;
    }

    public String layHoTen() {
        return hoTen;
    }

    public int layTuoi() {
        return tuoi;
    }

    public void hienThi() {
        System.out.print(" Tên bác sĩ " + hoTen + " Tuổi " + tuoi);
    }
}
