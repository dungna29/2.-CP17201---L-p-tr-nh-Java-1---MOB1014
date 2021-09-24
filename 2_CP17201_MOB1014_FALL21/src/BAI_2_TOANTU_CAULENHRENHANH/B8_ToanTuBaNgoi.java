/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B8_ToanTuBaNgoi {

  /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
   */

  public static void main(String[] args) {
    String temp1 = 5 > 5 ? "Đúng" : "Sai";
    boolean temp2 = 5 == 5 ? true : false;
    int temp3 = 5 == 5 ? 1 : 0;

    Scanner sc = new Scanner(System.in);
    int soMuiTiem;
    System.out.println("Mời bạn nhập số lần tiêm: ");
    soMuiTiem = Integer.parseInt(sc.nextLine());
    System.out.println((soMuiTiem == 0) ? "Bạn nên đăng ký đi tiêm vacxin": (soMuiTiem == 1) ? "Bạn nhớ đăng ký tiêm lần 2 nhé": (soMuiTiem == 2) ? "Bạn sẽ có thẻ xanh tha hồ đi tìm người yêu nhé":"Bạn đã bất tử rồi đấy");
//    if (soMuiTiem == 0) {
//      System.out.println("Bạn nên đăng ký đi tiêm vacxin");
//    }else if (soMuiTiem == 1) {
//      System.out.println("Bạn nhớ đăng ký tiêm lần 2 nhé");
//    }else if (soMuiTiem == 2) {
//      System.out.println("Bạn sẽ có thẻ xanh tha hồ đi tìm người yêu nhé");
//    }else{
//      System.out.println("Bạn đã bất tử rồi đấy");
//    }
  }
}
