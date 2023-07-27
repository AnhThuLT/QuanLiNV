
package quanlinv;

import java.util.Scanner;


public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String manv, String hoten, double luong) {
        super(manv, hoten, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public void input() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Luong trach nhiem:");
        setTrachNhiem(sc.nextDouble());
    }
    
    @Override
    public double sumSalary(){
        return getLuong() + getTrachNhiem();
    }
    
    @Override
    public void output() {
        System.out.println(getManv()
                +" - "+getHoten()
                +" - Luong: "+getLuong()
                +" - Luong TN: "+getTrachNhiem()
                +" - Tong Luong: "+ sumSalary()
                +" - Tax: "+getThueTN(sumSalary())
                +" => THU NHAP: "+ getThuNhap(sumSalary()));

    }
    
    public static void main(String[] args) {
        TruongPhong tp = new TruongPhong();
        tp.input();
        tp.output();
    }
    
}
