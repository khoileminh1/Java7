/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benhvien;

/**
 *
 * @author User
 */
public class DanhSachBacSi {

    private BacSi[] ds;
    private int soBS;

    public DanhSachBacSi(int n) {
        ds = new BacSi[n];
        soBS = 0;
    }

    public void them(BacSi s) {
        if (soBS < ds.length) {
            ds[soBS++] = s;
        }
    }

    public void lietKe() {
        for (int i = 0; i < soBS; i++) {
            ds[i].hienThi();
        }
    }

}
