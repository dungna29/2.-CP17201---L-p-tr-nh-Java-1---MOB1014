/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

/**
 *
 * @author Dungna89
 */
public class B3_EpKieu {

  /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
   */
  public static void main(String[] args) {
    //1. Ép kiểu từ String về số
    String year = "2020", y = "1", kq;
    kq = year + y;//Hành động cộng chuỗi sử dụng toán tử +
    System.out.println("Năm hiện tại = " + kq);//20201
    //Để có thể cộng các số ở dạng chuỗi thì cần phải ép kiểu
    int kq1 = Integer.parseInt(year) + Integer.parseInt(y);
    System.out.println("Năm hiện tại = " + kq1);//2021
    
    //Ngoài ra còn rất nhiều cách ép kiểu dữ liệu khác nhau từ String về số
        //Integer.parseInt(<String>)
        //Double.parseDouble(<String>)
        //Float.parseFloat(<String>)
        //Byte.parseByte(<String>)
        //..........
        
    //2. Ép kiểu giữa các các số với nhau     
    int a = 5;
    double b = 9.9;
    //b = a;//Ép kiểu tự động
    //a = b; Lỗi do Size kiểu dữ liệu int không thể nhận giá trị từ double
    a =(int) b;//Khi ép kiểu sẽ loại bỏ phần thập phân
    System.out.println(a);
  }
}
