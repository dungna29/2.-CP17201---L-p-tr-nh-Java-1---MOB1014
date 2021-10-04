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
    //Bài toán đề ra: . Viết 1 bài hãy khai báo 2 sinh viên có các thông tin sau: msv,ns,truong,nganh sau đó in ra màn hình
    String msv1 ="PH001",msv2="PH002";
    int ns1 = 2000,ns2= 2000;
    String truong1 = "FPOLY",truong2= "FPOLY";
    String nganh1 = "UDPM",nganh2= "MOB";
    System.out.println(msv1 + ns1 + truong1 + nganh1);
    System.out.println(msv2 + ns2 + truong2 + nganh2);
    
    //Phần 1: Khai báo và khởi tạo đối tượng thì cần phải biết tên đối tượng
    SinhVien sv1 = new SinhVien();//Phải khởi tạo đối tượng thì mới sử dụng được.

    SinhVien sv2 = new SinhVien();

    //sv3 dưới đây sử dụng contructor có tham số, contructor có tham số phải gán giá trị cho đối tượng ngay khi khởi tạo.
    SinhVien sv3 = new SinhVien("PH00111", 2000, "FPOLY", "UDPM");
    
    //Phần 2: Gán giá trị sẽ sử dụng Setter
    sv2.setMsv("PH123456");
    sv2.setNs(2002);
    sv2.setTruong("BK");
    sv2.setNganh("UDPM");
    
    //Phần 3: In các thuộc tính của đối tượng
    sv2.inThongTinSVRaManHinh();
    sv3.inThongTinSVRaManHinh();
    System.out.println(sv3.toString());    
    System.out.printf("%s %d %s %s \n",sv3.getMsv(),sv3.getNs(),sv3.getNganh(),sv3.getTruong());
  }
}
