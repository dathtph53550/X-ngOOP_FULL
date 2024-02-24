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
public abstract class canBo {
    private String maNV;
    private String ten;
    private double luongNV;
    Scanner s = new  Scanner(System.in);
    
    
    public canBo() {
    }
    
    
    public canBo(String maNV, String ten, double luongNV) {
        this.maNV = maNV;
        this.ten = ten;
        this.luongNV = luongNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(double luongNV) {
        this.luongNV = luongNV;
    }
    
    public void nhap(){
        System.out.print("Nhap thong tin can bo!\n");
        System.out.print("Nhap ma CB: ");
        maNV = s.nextLine();
        System.out.print("Nhap ten CB: ");
        ten = s.nextLine();
        System.out.print("Nhap luong CB: ");
        luongNV = Double.parseDouble(s.nextLine());
    }
    
    public void xuat(){
        System.out.println("-------------------------");
        System.out.printf("Ma CB: %s\nTen CB: %s\nLuong CB: %.2f\n",maNV,ten,luongNV);
    }
    
    public abstract double getLuong();
    
    public double getThue(){
        if(luongNV < 9000000)
            return luongNV * 0;
        else if(luongNV >= 9000000 && luongNV < 15000000)
            return luongNV * 0.1;
        else if(luongNV >= 15000000)
            return luongNV * 0.12;
        return 0;
    }
}
