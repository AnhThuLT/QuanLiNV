
package quanlinv;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        QuanLiNV ls = new QuanLiNV();
        int choice = 0;
        while(true){
        System.out.println("-----------------------------------------------------------");
        System.out.println("0.Data");
        System.out.println("1.Nhap danh sach");
        System.out.println("2.Xuat danh sach");
        System.out.println("3.Tiem kiem nhan vien theo Ma");
        System.out.println("4.Xoa nhan vien theo Ma");
        System.out.println("5.Cap nhap nhan vien theo Ma");
        System.out.println("6.Hien thi thong tin theo khoan luong");
        System.out.println("7.Sap xep theo ten nhan vien");
        System.out.println("8.Sap xep theo thu nhap");
        System.out.println("9.Thong tin top 5 thu nhap");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Chon chuc nang:");
        choice = sc.nextInt();
        
        switch(choice){
            case 0:
                ls.dumyData();
                break;
            case 1:
                ls.inputs();
                break;
            case 2:
                ls.outputs();
                break;
            case 3:
                System.out.println("Nhap ma nhan vien can tim");
                String timMaNV = sc.next();
                int pos = ls.timID(timMaNV);
                if(pos < 0){
                    System.out.println("Khong tim thay nv");
                }
                break;

            case 4:
                System.out.println("Nhap ma nv can xoa");
                String xoaMaNV = sc.next();
                ls.xoaID(xoaMaNV);
                break;

            case 5:
                System.out.println("Nhap ma nv can sua");
                String updateMaNV = sc.next();
                ls.update(updateMaNV);
                break;

            case 6:
                System.out.println("Nhap khoan luong tu: ");
                double minSalary = sc.nextDouble();
                System.out.println("Nhap khoan luong den: ");
                double maxSalary = sc.nextDouble();
                ls.getSalary(minSalary, maxSalary);
                break;
            case 7:
                ls.getSortByName();
                ls.outputs();
                break;
            case 8:
                ls.getSortByTN();
                ls.outputs();
                break;
            case 9:
                ls.getTop5TN();
                break;
            }
        }
    }
}
