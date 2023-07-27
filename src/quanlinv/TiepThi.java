/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinv;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class TiepThi extends NhanVien{
    private double doanhSo;
    private double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hueHong, String manv, String hoten, double luong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap doanh so:");
        setDoanhSo(sc.nextDouble());
        System.out.println("Nhap hue hong(%):");
        setHueHong(sc.nextDouble());
    }
    //tien luong cua tiep thi
    
    @Override
    public double sumSalary(){
        return getLuong() + (getDoanhSo()*getHueHong())/100;
    }

    @Override
    public void output() {
        System.out.println(getManv()+" - "+getHoten()+" - L: "+getLuong()
                +" - DS: "+getDoanhSo()
                +" - HH: "+getHueHong()+"%"
                +" - Tong Luong: "+ sumSalary() 
                +" - Tax: "+ getThueTN(sumSalary())
                +" => THU NHAP: "+getThuNhap(sumSalary()));
    }
    
    public static void main(String[] args) {
        TiepThi tt = new TiepThi();
        tt.input();
        tt.output();
    }
}
