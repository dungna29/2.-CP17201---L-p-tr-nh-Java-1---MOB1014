/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_7_XuLyString_BieuThucChinhQuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dungna89
 */
public class S2_Demo {

  static Scanner _sc = new Scanner(System.in);

  public static void main(String[] args) {
      nhapSo();
  }

  //Ví dụ 1: Viết 1 phương thức search tên
  static void timKiemTen() {
    List<String> lstNames = Arrays.asList("Tú", "tùng", "tOàn", "toán", "Tũn", "hoàng", "Hoàng Anh", "Hoàn");    
    do {
      System.out.println("Mời bạn nhập tên: ");
      var temp = _sc.nextLine();
      System.out.println("Tên bạn muốn tìm:");
      for (String x : lstNames) {
        if (x.toLowerCase().startsWith(temp.toLowerCase())) {
          System.out.println(x);
        }
      }
    } while (true);
  }
  //Ví dụ 2: Biểu thức chính quy
  static void nhapSo(){
    String input;
    do {
      System.out.println("Mời bạn nhập số: ");
      input = _sc.nextLine();
    } while (!checkSo(input));
    System.out.println("Chúc mừng bạn đã nhập số thành công");   
  }
  static boolean checkSo(String value){
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(value);
    return matcher.matches();
  }
  static boolean checkChu(String value){
    Pattern pattern = Pattern.compile("\\w");
    Matcher matcher = pattern.matcher(value);
    return matcher.matches();
  }
}
