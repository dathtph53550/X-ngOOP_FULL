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
public class nhanVienVanPhong extends canBo{
    private int soNgayLamViec;
    private double phuCap;

    public nhanVienVanPhong() {
    }

    public nhanVienVanPhong(int soNgayLamViec, double phuCap, String maNV, String ten, double luongNV) {
        super(maNV, ten, luongNV);
        this.soNgayLamViec = soNgayLamViec;
        this.phuCap = phuCap;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so ngay lam viec: ");
        soNgayLamViec = s.nextInt();
        System.out.print("Nhap phu cap: ");
        phuCap = s.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.printf("So ngay lam viec: %d\nPhu Cap: %.2f\n",soNgayLamViec,phuCap);
        System.out.println("");
    }
    
    @Override
    public double getLuong() {
        return (super.getLuongNV() + phuCap) * soNgayLamViec;
    }
    
}
