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
public class keToan extends canBo{
    private String trinhDo;
    private String chucVu;
    private double luongThuong;

    public keToan() {
    }

    public keToan(String trinhDo, String chucVu, double luongThuong, String maNV, String ten, double luongNV) {
        super(maNV, ten, luongNV);
        this.trinhDo = trinhDo;
        this.chucVu = chucVu;
        this.luongThuong = luongThuong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap trinh do Ke Toan(Thac si || Trung si || Khac ): ");
        trinhDo = s.nextLine();
        System.out.print("Nhap chuc vu Ke Toan: ");
        chucVu = s.nextLine();
        System.out.print("Nhap luong thuong Ke Toan: ");
        luongThuong = s.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Trinh do: %s\nChuc vu: %s\nLuong thuong: %.2f\n",trinhDo,chucVu,luongThuong);
        System.out.println("");
    }
    
    @Override
    public double getLuong() {
        if(trinhDo.equalsIgnoreCase("Thac si")){
            return super.getLuongNV() + luongThuong * 0.2;
        }
        else if(trinhDo.equalsIgnoreCase("Trung si")){
            return super.getLuongNV() + luongThuong * 0.1;
        }
        else{
            return super.getLuongNV() + luongThuong;
        }
    }
    
    
}
