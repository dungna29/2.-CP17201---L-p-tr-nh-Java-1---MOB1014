/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class BAI1_BAIMAUNHAPXUAT {
  /*
    Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên từ bàn phím và xuất ra định dạng sau:
      “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình lập trình đầu tiên.”
  */
  public static void main(String[] args) {
    //Bước 1: Triển khai thư viện và xác định số lượng biến và kiểu dữ liệu
    Scanner sc = new Scanner(System.in);
    String ten,msv;
    int ns;
    //Bước 2: Gán giá trị cho các biến
    System.out.println("Mời bạn nhập tên: ");
    ten = sc.nextLine();
    System.out.println("Mời bạn nhập năm sinh: ");
    //ns = sc.nextInt();
    //Cách 1: Chèn thêm sc.nextLine(); sau khi sử dụng next<Số> 
    //sc.nextLine(); Không nên sử dụng cách này khi học lập trình
    
    //Cách 2: Thường xuyên sử dụng ép kiểu và không cần phải nhớ next<Số> 
    ns = Integer.parseInt(sc.nextLine());
    System.out.println("Mời bạn nhập msv: ");
    msv = sc.nextLine();
    
    //Bước 3: Thực thi
    System.out.printf("Chào bạn %s | %d  | %s đến với chương trình lập trình đầu tiên.",
            ten,ns,msv);
    //Trôi lệnh chỉ xảy ra khi sau khi sử dụng next<Số> là nextLine
  }
}
