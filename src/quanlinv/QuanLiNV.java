
package quanlinv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLiNV {
    static ArrayList<NhanVien> lstNV = new ArrayList<>();
    
    /*public void input(){
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        do{
            NhanVien nv = new NhanVien();
            nv.input();
            lstNV.add(nv);
            System.out.println("Ban muon tiep tuc?(y/n)");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("y"));
    }*/
    
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        int type = 1;// loai nhan vien
        NhanVien nv = null; 
        do{
            System.out.println("1.Nhan vien");
            System.out.println("2.Tiep thi");
            System.out.println("3.Truong phong");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Ban chon: ");
            type = sc.nextInt();
            switch(type){
                case 1:
                    nv = new NhanVien();
                    break;
                case 2:
                    nv = new TiepThi();
                    break;
                case 3:
                    nv = new TruongPhong();
                    break;
                }// dong 
            nv.input();
            lstNV.add(nv);
            System.out.println("Ban muon tiep tuc?(y/n)");
            choice = sc.next();
            }while(choice.equalsIgnoreCase("y"));
    }
    
    public void outputs(){
        for(NhanVien nhanVien: lstNV){
            nhanVien.output();
        }
    }
    
    public int timID(String maNV){
        for(int i = 0; i < lstNV.size(); i++){
            NhanVien nv = lstNV.get(i);
            if(nv.getManv().equalsIgnoreCase(maNV)){
                System.out.println("Da tim thay tai vi tri:"+ i);
                nv.output();
                return i;
            }
        }return -1;
    }
    
    public void xoaID(String maNV){
        int position = timID(maNV);
        if(position < 0){
            System.out.println("Khong tim thay nhan vien");
        }else{
            lstNV.remove(position);
            System.out.println("Da xoa nhan vien tai vi tri: "+ position);
            
        }
    }
    
    public void dumyData(){
        lstNV.add(new NhanVien("NV01","Nguyen Nhat Nam",9000));
        lstNV.add(new NhanVien("NV02","... .... .... ..",17000));
        lstNV.add(new NhanVien("NV03","Bui Thi Thanh Thao",20000));
        lstNV.add(new NhanVien("NV04","Vu Ngoc Khanh",3000));
        lstNV.add(new NhanVien("NV05","Mai Hoang Hon",5000));
     
    }
    
    public void update(String maNV){
        int pos = timID(maNV);
        if(pos<0){
            System.out.println("Khong tim thay nhan vien: "+maNV);
        }else{
            NhanVien nvNew = lstNV.get(pos);
            nvNew.input();
            lstNV.set(pos, nvNew);
            System.out.println("Cap nhap thanh cong");
        }
    }
    
    public void getSalary(double min, double max){
        for(NhanVien nv : lstNV){
            if(nv.sumSalary() >= min && nv.sumSalary() <= max){
                nv.output();
            }
        }
    }
    
    public void getSortByName(){
        for(int i = 0 ; i < lstNV.size()-1 ;i++){
            for(int j = i+1; j < lstNV.size(); j++){
                if(splitName(lstNV.get(i).getHoten()).compareTo(splitName(lstNV.get(i).getHoten()))>0){
                    Collections.swap(lstNV,i,j);
                }
            }
        }
    }
    
    public String splitName(String fullname){
        String name = fullname.substring(fullname.lastIndexOf(" ")+ 1);
       return name;
    }
    
    public void getSortByTN(){
         for(int i = 0 ; i < lstNV.size()-1 ;i++){
            for(int j = i+1; j < lstNV.size(); j++){
                NhanVien nvi = lstNV.get(i);
                NhanVien nvj = lstNV.get(j);
                if(nvi.getThuNhap(nvi.sumSalary()) < nvj.getThuNhap(nvj.sumSalary())){
                    Collections.swap(lstNV, i, j);
                }       
            }
         }
    }
    
    public void getTop5TN(){
        getSortByTN();
        int top = 5;
        if(lstNV.size() < 5){
            top = lstNV.size();
        }
        for(int i = 0; i < top ; i++){
            NhanVien nv = lstNV.get(i);
            nv.output();
        }
    }
    
    public static void main(String[] args) {
       QuanLiNV ls = new QuanLiNV();
       ls.inputs();
       ls.outputs();
       
    }
    
}
