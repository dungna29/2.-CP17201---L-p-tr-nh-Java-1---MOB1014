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
//Lớp con
public class SinhVien extends Nguoi{

  //Các thuộc tính riêng chỉ dùng để miêu tả đối tượng
  private String msv;
  private double diemJava;

  public SinhVien() {
  }

  
  public SinhVien(String msv1, double diemJava, String ten, int tuoi, String sdt, String queQuan, String ns, String sdt2) {
    super(ten, tuoi, sdt, queQuan, ns, sdt2);
    msv = msv1;
    this.diemJava = diemJava;
    //this: Dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    //super: Dùng để tham chiếu đến thuộc tính và phương thức của lớp cha  
   
  }
  

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public double getDiemJava() {
    return diemJava;
  }

  public void setDiemJava(double diemJava) {
    this.diemJava = diemJava;
  }

  @Override
  public String toString() {   
    return "SinhVien{" + "msv=" + msv + ", diemJava=" + diemJava + '}';    
  }
  
  //Kế thừa lại được phương thức của lớp cha Alt + Insert chọn Override Method
  //Ghi đè phương thức
  @Override
  public void inRaManHinh() {
   // super.inRaManHinh(); //To change body of generated methods, choose Tools | Templates.
   //Khi kế thừa thì phương thức kế thừa từ lớp cha sẽ được code lại
    System.out.println("Đây là phương thức lớp con kế thừa lớp cha đã chỉnh sửa");
  }

  
  
}
