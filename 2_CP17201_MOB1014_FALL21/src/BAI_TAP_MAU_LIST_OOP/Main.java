/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_TAP_MAU_ARRAY_OOP.*;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Dungna89
 */
public class Main {//Nơi code menu của chương trình
  public static void main(String[] args) {
    String input;
    Scanner sc = new Scanner(System.in);
    HocSinhService hs = new HocSinhService();
    
    do {      
      System.out.println("1. Thêm");
      System.out.println("2. Sửa");
      System.out.println("3. Xóa");
      System.out.println("4. Tìm Kiếm");
      System.out.println("5. Xuất Ds");
      System.out.println("6. Thoát");
      System.out.println("Mời bạn chọn chức năng: ");
      input = sc.nextLine();
      switch (input) {
        case "1":
          hs.addHs();
          break;
        case "2":
          hs.suaHs();
          break;
        case "3":
          hs.xoaHs();
          break;
        case "4":
          hs.timKiemHs();
          break;
        case "5":
          hs.inDsHs();
          break;
        case "6":
          System.out.println("Hẹn gặp lại bạn lần sau");
          break;
        default:
          System.out.println("Chức năng không tồn tại");
      }
    } while (!input.equals("6"));
  }
}
