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
public class Menu {
    public static void main(String[] args) {
        quanLyNhanVien ql = new quanLyNhanVien();
        Scanner s = new Scanner(System.in);
        int chon;
        do{
            System.out.println("================================");
            System.out.println("|1.Nhap can bo                 |");
            System.out.println("|2.Xuat can bo                 |");
            System.out.println("|3.Tim can bo                  |");
            System.out.println("|4.Xoa can bo                  |");
            System.out.println("|5.Cap nhap can bo             |");
            System.out.println("|6.Sap xep can bo theo ma NV   |");
            System.out.println("|7.Sap xep can bo theo luong   |");
            System.out.println("|8.Xuat top 3 CB co luong cao  |");
            System.out.println("|9.Reset danh sach             |");
            System.out.println("|0. Thoat                      |");
            System.out.println("===============================");
            System.out.print("Moi chon: ");
            chon = Integer.parseInt(s.nextLine());
            switch(chon){
                case 1:
                    ql.nhap();
                    break;
                case 2:
                    ql.Xuat();
                    break;
                case 3:
                    ql.timCanBo();
                    break;
                case 4:
                    ql.xoaCanBo();
                    break;
                case 5:
                    ql.suaCanBo();
                    break;
                case 6:
                    ql.sapXepCanBo();
                    break;
                case 7:
                    ql.sapXepTheoLuong();
                    break;
                case 8:
                    ql.xuatTop3();
                    break;
                case 9:
                    ql.xoaDanhSach();
                    break;
                case 0:
                    System.out.println("Ban da thoat ....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban nhap sai cu phap vui long nhap lai");
                    break;
            }
        }while(chon != 0);
    }
}
