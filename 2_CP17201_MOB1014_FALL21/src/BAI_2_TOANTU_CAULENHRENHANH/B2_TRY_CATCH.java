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
public class B2_TRY_CATCH {
  //Công thứ: try + tab
        /*
            Định nghĩa mức cơ bản: Try Catch dùng để chống crash chương trình.
            1. Không sử dụng try catch khi đang lập trình
            2. Ở môi trường học tập Chỉ dùng try catch khi nộp bài hoặc đi chấm bài
            3. Trong môi trường làm việc: Chỉ khi nào đóng gói cho Tester thì phải đóng try catch hoặc trước khi bàn giao cho khách hàng cũng phải đóng lại.
         */
 /*
            try {
                Thực thi câu lệnh nếu xảy ra lỗi sẽ đẩy xuống catch
            } catch (Exception e) {
                Thực hiện 1 hành động nào đó khi câu lệnh trên xảy ra lỗi
            }
         */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    try {
      System.out.println("Mời bạn nhập vào 1 số nguyên: ");
      a = sc.nextInt();
      System.out.println(a);
    } catch (Exception e) {
      System.out.println("Lỗi rồi Tú");
    }
  }
}
