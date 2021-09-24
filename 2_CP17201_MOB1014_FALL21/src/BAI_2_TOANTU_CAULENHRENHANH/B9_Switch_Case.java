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
public class B9_Switch_Case {
   /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char choice;
    System.out.println("Menu chọn loại vacxin để tiêm");
    System.out.println("1. Vacxin Việt Nam");
    System.out.println("2. Vacxin Cuba");
    System.out.println("3. Vacxin Nga");
    System.out.println("Mời bạn chọn vacxin muốn tiêm: ");
    choice = sc.nextLine().charAt(0);//charAt(0)= Lấy giá trị đầu tiên của 1 chuỗi
    switch (choice) {
      case '1':
        System.out.println("Bạn chỉ cần tiêm 1 mũi thôi nhé");
        break;
      case '2':
        System.out.println("Bạn chỉ cần tiêm 2 mũi thôi nhé");
        break;
      case '3':
        System.out.println("Bạn chỉ cần tiêm 3 mũi thôi nhé");
        break;
      default:
        System.out.println("Chúng tôi ko cung cấp vacxin bạn đã chọn");
    }    
  }
}
