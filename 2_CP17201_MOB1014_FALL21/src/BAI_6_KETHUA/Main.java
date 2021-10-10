/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_6_KETHUA;

/**
 *
 * @author Dungna89
 */
public class Main {
  public static void main(String[] args) {
    //Phần 1: Khi sử dụng lớp con vẫn đầy đủ các thuộc tính
    SinhVien sv1 = new SinhVien("PH", 5.6, "Tú", 20, "098", "HCM", "2000", "0123");
    sv1.setNs("2005");
    
    //Phần 2: Ghi đè phương thức
    Nguoi nguoi = new Nguoi();
    nguoi.inRaManHinh();
    SinhVien sv2 = new SinhVien();
    sv2.inRaManHinh();
  }
}
