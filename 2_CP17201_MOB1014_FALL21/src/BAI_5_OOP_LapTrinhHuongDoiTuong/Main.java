/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna89
 */
public class Main {

  public static void main(String[] args) {
    //Phần 1. Viết 1 bài hãy khai báo 2 sinh viên có các thông tin sau: msv,ns,truong,nganh sau đó in ra màn hình
    String msv1 ="PH001",msv2="PH002";
    int ns1 = 2000,ns2= 2000;
    String truong1 = "FPOLY",truong2= "FPOLY";
    String nganh1 = "UDPM",nganh2= "MOB";
    System.out.println(msv1 + ns1 + truong1 + nganh1);
    System.out.println(msv2 + ns2 + truong2 + nganh2);
    
    //Thử sử dụng class đối tượng cơ bản
    SinhVien sv1 = new SinhVien();
    sv1.msv ="PH003";
    sv1.ns = 2000;
    sv1.nganh = "UDPM";
    sv1.truong = "FPOLY";
    SinhVien sv2 = new SinhVien();
    sv2.msv ="PH004";
    sv2.ns = 2000;
    sv2.nganh = "UDPM";
    sv2.truong = "FPOLY";
    
  }
}
