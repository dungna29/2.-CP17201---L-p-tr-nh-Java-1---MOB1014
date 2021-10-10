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
//Lớp Người là 1 lớp nhưng cũng là 1 đối tượng như bao lớp khác.
public class Nguoi {

  //Đưa các thuộc tính chung lên trên lớp cha
  private String ten;
  private int tuoi;
  private String sdt;
  private String queQuan;
  private String ns;
  private String sdt2;

  public Nguoi() {
  }

  public Nguoi(String ten, int tuoi, String sdt, String queQuan, String ns, String sdt2) {
    this.ten = ten;
    this.tuoi = tuoi;
    this.sdt = sdt;
    this.queQuan = queQuan;
    this.ns = ns;
    this.sdt2 = sdt2;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public String getNs() {
    return ns;
  }

  public void setNs(String ns) {
    this.ns = ns;
  }

  public String getSdt2() {
    return sdt2;
  }

  public void setSdt2(String sdt2) {
    this.sdt2 = sdt2;
  }
  
  public void inRaManHinh(){
    System.out.println("inRaManHinh() cha");
  }
  public void inRaManHinh1(){
    System.out.println("inRaManHinh() cha 1");
  }
  private void inRaManHinh2(){
    System.out.println("inRaManHinh() cha 1");
  }
}
