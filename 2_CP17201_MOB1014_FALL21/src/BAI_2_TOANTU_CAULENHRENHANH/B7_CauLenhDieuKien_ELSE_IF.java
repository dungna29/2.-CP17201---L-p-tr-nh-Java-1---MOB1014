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
public class B7_CauLenhDieuKien_ELSE_IF {
  /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
   */
  public static void main(String[] args) {
    /*
        Viết 1 chương trình nhập số lần tiêm vacxin Covid
        1. Chưa tiêm mũi nào: Bạn nên đăng ký đi tiêm vacxin
        2. Tiêm 1 mũi: Bạn nhớ đăng ký tiêm lần 2 nhé
        3. Tiêm 2 mũi: Bạn sẽ có thẻ xanh tha hồ đi tìm người yêu nhé
        4. Các trường hợp còn lại: Bạn đã bất tử rồi đấy        
    */
    Scanner sc = new Scanner(System.in);
    int soMuiTiem;
    System.out.println("Mời bạn nhập số lần tiêm: ");
    soMuiTiem = Integer.parseInt(sc.nextLine());
    if (soMuiTiem == 0) {
      System.out.println("Bạn nên đăng ký đi tiêm vacxin");
    }else if (soMuiTiem == 1) {
      System.out.println("Bạn nhớ đăng ký tiêm lần 2 nhé");
    }else if (soMuiTiem == 2) {
      System.out.println("Bạn sẽ có thẻ xanh tha hồ đi tìm người yêu nhé");
    }else{
      System.out.println("Bạn đã bất tử rồi đấy");
    }
  }
}
