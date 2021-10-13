/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_TAP_MAU_ARRAY_OOP.*;

/**
 *
 * @author Dungna89
 */
public class HocSinh implements Comparable<HocSinh>{
  private String ten;  
  private int capHoc;
  private int mahs;
  private String lop;

  public HocSinh() {
  }

  public HocSinh(String ten, int capHoc, int mahs, String lop) {
    this.ten = ten;
    this.capHoc = capHoc;
    this.mahs = mahs;
    this.lop = lop;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getCapHoc() {
    return capHoc;
  }

  public void setCapHoc(int capHoc) {
    this.capHoc = capHoc;
  }

  public int getMahs() {
    return mahs;
  }

  public void setMahs(int mahs) {
    this.mahs = mahs;
  }

  public String getLop() {
    return lop;
  }

  public void setLop(String lop) {
    this.lop = lop;
  }

  @Override
  public String toString() {
    return "HocSinh{" + "ten=" + ten + ", capHoc=" + capHoc + ", mahs=" + mahs + ", lop=" + lop + '}';
  }

  @Override
  public int compareTo(HocSinh o1) {
   //      //return o1.getTen().compareTo(getTen());//Sắp xếp chuỗi ASC
//      //return -o1.getTen().compareTo(getTen());//Sắp xếp chuỗi DES
        if (o1.getMahs() > getMahs()) {
          return 1;
        }
        return -1;
  }
}
