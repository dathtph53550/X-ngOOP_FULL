/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LOVE
 */
public class quanLyNhanVien {
    ArrayList<canBo> list = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    int n;
    public void nhap(){
        System.out.print("Moi ban nhap so can bo: ");
        n = Integer.parseInt(s.nextLine());
        for(int i = 0; i < n;i++){
            System.out.println("Nhap thong tin can bo thu "+(i + 1)+": ");
            System.out.println("1 - KySu || 2 - NhanVienVanPhong || 3 - NhanVienSanXuat || 4 - QuanLy || 5 - KeToan");
            int chon = s.nextInt();
            switch(chon){
                case 1:
                    kySu ks = new kySu();
                    ks.nhap();
                    list.add(ks);
                    break;
                case 2:
                    nhanVienVanPhong nvVP = new nhanVienVanPhong();
                    nvVP.nhap();
                    list.add(nvVP);
                    break;
                case 3:
                    nhanVienSanXuat nvSX = new nhanVienSanXuat();
                    nvSX.nhap();
                    list.add(nvSX);
                    break;
                case 4:
                    quanLy ql = new quanLy();
                    ql.nhap();
                    list.add(ql);
                    break;
                case 5:
                    keToan kt = new keToan();
                    kt.nhap();
                    list.add(kt);
                    break;
                default:
                    System.out.println("Ban nhap sai vui long nhap lai ........");
                    break;
            }
        }
    }
    public void Xuat(){
        for (canBo cb : list) {
            if(cb instanceof kySu)
                ((kySu)cb).xuat();
            else if(cb instanceof nhanVienVanPhong)
                ((nhanVienVanPhong)cb).xuat();
            else if(cb instanceof nhanVienSanXuat)
                ((nhanVienSanXuat)cb).xuat();
            else if(cb instanceof quanLy)
                ((quanLy)cb).xuat();
            else if(cb instanceof keToan)
                ((keToan)cb).xuat();
        }
    }
    
    public void timCanBo(){
        System.out.print("\nNhap ma nhan vien can tim: ");
        String ma = s.nextLine();
        boolean ok = false;
        
        for (canBo x : list) {
            if(x.getMaNV().equalsIgnoreCase(ma)){
                ok = true;
                if(x instanceof kySu)
                    ((kySu)x).xuat();
                else if(x instanceof nhanVienVanPhong)
                    ((nhanVienVanPhong)x).xuat();
                else if(x instanceof nhanVienSanXuat)
                    ((nhanVienSanXuat)x).xuat();
                else if(x instanceof quanLy)
                    ((quanLy)x).xuat();
                else if(x instanceof keToan)
                    ((keToan)x).xuat();
            }
        }
        if(ok == false)
            System.out.printf("Khong tim thay nhan vien voi ma: %s ",ma);
    }
    
    public void xoaCanBo(){
        System.out.print("Nhap ma can bo can xoa: ");
        String ten = s.nextLine();
        for(canBo x : list){
            if(x.getMaNV().equalsIgnoreCase(ten)){
                list.remove(x);
                System.out.println("Xoa nhan vien thanh cong !!");
                break;
            }
        }
    }
    
    public void suaCanBo(){
        System.out.print("\nNhap ma CanBo can tim: ");
        String ma = s.nextLine();
        boolean ok = false;
        
        for (canBo x : list) {
            if(x.getMaNV().equalsIgnoreCase(ma)){
                ok = true;
                if(x instanceof kySu)
                    ((kySu)x).nhap();
                else if(x instanceof nhanVienVanPhong)
                    ((nhanVienVanPhong)x).nhap();
                else if(x instanceof nhanVienSanXuat)
                    ((nhanVienSanXuat)x).nhap();
                else if(x instanceof quanLy)
                    ((quanLy)x).nhap();
                else if(x instanceof keToan)
                    ((keToan)x).nhap();
            }
        }
        if(ok == false)
            System.out.printf("Khong tim thay nhan vien voi ma: %s ",ma);
    }
    public void sapXepCanBo(){
        System.out.println("--Sap xep theo ma----");
        Comparator<canBo> cmp = new Comparator<canBo>() {
            @Override
            public int compare(canBo o1, canBo o2) {
                return o1.getMaNV().compareTo(o2.getMaNV());
            }
        };
        Collections.sort(list,cmp);
        System.out.println("Da sap xep theo ma CB thanh cong !!!");
    }
    
    public void sapXepTheoLuong(){
        System.out.println("--Sap xep theo luong--");
        Comparator<canBo> cmp = new Comparator<canBo>() {
            @Override
            public int compare(canBo o1, canBo o2) {
                if(o1.getLuong() > o2.getLuong()) 
                    return -1;
                else
                    return 1;
            }
        };
        Collections.sort(list,cmp);
        System.out.println("Da sap xep theo luong thanh cong !!!");
    }
    
    public void xuatTop3(){
        Comparator<canBo> cmp = new Comparator<canBo>() {
            @Override
            public int compare(canBo o1, canBo o2) {
                if(o1.getLuong() > o2.getLuong()) 
                    return -1;
                else
                    return 1;
            }
        };
        Collections.sort(list,cmp);
        System.out.println("---Sap xep Top 3 Can Bo co luong cao nhat---");
        if(list.size() < 3){
            for(int i = 0;i < list.size();i++){
                list.get(i).xuat();
            }
        }else{
            for(int i = 0; i < 3;i++){
                list.get(i).xuat();
            }
        }
    }
    
    public void xoaDanhSach(){
        list.clear();
        System.out.println("Da xoa toan bo danh sach !!");
    }
}
