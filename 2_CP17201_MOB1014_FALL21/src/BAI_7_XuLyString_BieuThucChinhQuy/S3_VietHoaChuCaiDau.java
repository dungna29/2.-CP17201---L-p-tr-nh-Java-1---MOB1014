/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_7_XuLyString_BieuThucChinhQuy;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class S3_VietHoaChuCaiDau {

  //Viết hoa toàn bộ tên người dùng khi nhập vào
  //Ví dụ: nguyễn anh dũng = Nguyễn Anh Dũng
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Mời bạn nhập tên đầy đủ:");
      String input = sc.nextLine();
      String[] arrName = input.split("\\_");//Cắt mảng theo khoảng trắng
      for (String x : arrName) {
        System.out.print(vietHoaChuCaiDau(x)+" ");
      }
      System.out.println("");
    } while (true);
  }
  static String vietHoaChuCaiDau(String value) {
    String temp = value.trim();
    return String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1).toLowerCase();
  }
}
