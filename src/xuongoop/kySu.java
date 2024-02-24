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
public class kySu extends canBo{
    private String kyNang;
    private String nganh;
    private double phuCap;

    public kySu() {
    }

    public kySu(String kyNang, String nganh, double phuCap, String maNV, String ten, double luongNV) {
        super(maNV, ten, luongNV);
        this.kyNang = kyNang;
        this.nganh = nganh;
        this.phuCap = phuCap;
    }

    public String getKyNang() {
        return kyNang;
    }

    public void setKyNang(String kyNang) {
        this.kyNang = kyNang;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
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
        System.out.print("Nhap Ki Nang Ky Su (Thanh Thao || Kha || Khac ): ");
        kyNang = s.nextLine();
        System.out.print("Nhap nganh Ky Su: ");
        nganh = s.nextLine();
        System.out.print("Nhap phu cap Ky Su: ");
        phuCap = s.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.printf("Ky Nang: %s\nNganh: %s\nPhuCap: %s\n",kyNang,nganh,phuCap);
        System.out.println("");
    }
    
    @Override
    public double getLuong() {
        if(kyNang.equalsIgnoreCase("Thanh Thao")){
            return super.getLuongNV() + phuCap * 0.2;
        }
        else if(kyNang.equalsIgnoreCase("Kha")){
            return super.getLuongNV() + phuCap * 0.1;
        }
        else{
            return super.getLuongNV();
        }
    } 
}
