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
public class NhanVien {
    private String manv;
    private String hoten;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma NV:");
        setManv(sc.nextLine());
        System.out.println("Ho ten:");
        setHoten(sc.nextLine());
        System.out.println("Luong:");
        setLuong(sc.nextDouble());
    }
    
    public void output(){
        System.out.println(getManv()+"-"+getHoten()+"-"+getLuong());
    }
    
  
    
    public double getThueTN(double salary){
        double tax = 0;
        if(salary <=9000){
            tax = 0;
        }else if(salary <=15000){
            tax = (salary -9000)*0.1;
        }else {
            tax = (salary - 15000)*0.12 + 6000*0.1;
        }
        return tax;
    }
    //
    public double getThuNhap(double salary){
        return salary - getThueTN(salary);
    }
    
    
    public double sumSalary(){
        return getLuong();
    }
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.input();
        nv.output();
    }
}
