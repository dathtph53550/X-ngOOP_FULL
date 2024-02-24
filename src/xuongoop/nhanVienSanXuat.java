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
public class nhanVienSanXuat extends canBo{
    private int soSanPham;
    private int tangCa;
    private double thuong;

    public nhanVienSanXuat() {
    }

    public nhanVienSanXuat(int soSanPham, int tangCa, double thuong, String maNV, String ten, double luongNV) {
        super(maNV, ten, luongNV);
        this.soSanPham = soSanPham;
        this.tangCa = tangCa;
        this.thuong = thuong;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public int getTangCa() {
        return tangCa;
    }

    public void setTangCa(int tangCa) {
        this.tangCa = tangCa;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so san pham: ");
        soSanPham = s.nextInt();
        System.out.print("Nhap so lan tang ca: ");
        tangCa = s.nextInt();
        System.out.print("Nhap luong thuong: ");
        thuong = s.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.printf("So san pham: %d\nSo lan tang ca: %d\nLuong thuong: %.2f\n",soSanPham,tangCa,thuong);
    }
    
    
    @Override
    public double getLuong() {
        if(tangCa < 50)
            return super.getLuongNV() + (soSanPham*thuong);
        else if(tangCa >= 50)
            return super.getLuongNV() + ((soSanPham*thuong)* 0.05);
        return 0;
    }
}
