/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B4_NhapXuatDuLieuTuBanPhim {

  /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
   */
  public static void main(String[] args) {
    //1. Xuất dữ liệu
    System.out.print("Chào các bạn");
    System.out.println(" đến học trong ngành \t UDPM");// \t  = 1 tab
    System.out.print(" năm 2021 \n"); // \n = Xuống dòng

    //Đưa ra template hiển thị
    // Tìm hiểu thêm %s, %f, %d....
    System.out.printf("Chào bạn: %s - Năm sinh: %d \n", "Tú", 2002);
    System.out.println("Chào bạn: " + "Tú -" + " Năm sinh: " + 2020);

    //2. Nhập dữ liệu từ bàn phím
    //Ví dụ: Nhập tên của bạn và in ra màn hình
    //Bước 1: Xác định xem cần bao nhiêu biến và có những kiểu dữ liệu
    String name;
    //Bước 2: Khai báo lớp Scanner
    Scanner sc = new Scanner(System.in);
    //Bước 3: Chỉ dẫn cho người dùng
    System.out.print("Mời bạn Tú nhập tên: ");
    //Bước 4: Nhập dữ liệu từ người dùng
    name = sc.nextLine();//Gán giá trị cho biến thông qua toán tử =
    //sc.nextLine() có kiểu dữ liệu là String
    //Bước 5: In ra màn hình
    System.out.println("Chào bạn: " + name);
  }
}
