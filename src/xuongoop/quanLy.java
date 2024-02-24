/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop;

import java.util.Scanner;

/**
 *
 * @author LOVE
 */
public class quanLy extends canBo{
    private int heSoChucVu;
    private double luongThuong;
    private double luongTrachNhiem;

    public quanLy() {
    }

    public quanLy(int heSoChucVu, double luongThuong, double luongTrachNhiem, String maNV, String ten, double luongNV) {
        super(maNV, ten, luongNV);
        this.heSoChucVu = heSoChucVu;
        this.luongThuong = luongThuong;
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public int getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(int heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    

    @Override
    public void nhap() {
        super.nhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so chuc vu: ");
        heSoChucVu = s.nextInt();
        System.out.print("Nhap luong thuong: ");
        luongThuong = s.nextDouble();
        System.out.print("Nhap luong trach nhiem: ");
        luongTrachNhiem = s.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("He so chuc vu quan ly: %d\nLuong thuong Quan ly: %.2f\nLuong trach nhiem: %.2f\n",heSoChucVu,luongThuong,luongTrachNhiem);
        System.out.println("");
    }
    
    @Override
    public double getLuong() {
        if(heSoChucVu < 50){
            double bonus = 0;
            return super.getLuongNV() + luongTrachNhiem + luongThuong + bonus;
        }
        else if(heSoChucVu >= 50 && heSoChucVu < 80){
            double bonus = 1000000;
            return super.getLuongNV() +  luongTrachNhiem + luongThuong + bonus;
        }
         return 0;
    }
}
