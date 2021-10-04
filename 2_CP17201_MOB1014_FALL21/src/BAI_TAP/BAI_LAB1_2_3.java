/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BAI_LAB1_2_3 {
  
  /*
         * Bài tập ôn tập tổng hợp:
         * Viết 1 chương trình có menu sử dụng switch case và vòng lặp:
         *         ------Chương trình 1-------
         *       1. In bảng cửu chương đơn
         *       2. In bảng cửu theo khoảng
         *       3. Kiểm tra học lực Sinh Viên Poly
         *       4. Nhập thông tin người yêu cũ
         *       5. Thoát.
         
         * Giải thích:
         *1. In bảng cửu chương đơn: Mời người dùng nhập vào tên 1 bảng cửu chương mà họ muốn sau đó in ra màn hình.
         
         *2. In bảng cửu theo khoảng: Mời người dùng nhập vào tên bảng cửu chương theo khoảng. Ví dụ: từ bảng nhân 5 đến nhân 8.
         
         *3. Kiểm tra học lực Sinh Viên Poly: Cho sinh viên POLY nhập vào điểm tổng kết môn C# và thông báo xếp loại học lực:
         *  diem<=5 --> Yếu
         *  diem<=7 --> Khá 
         *  diem<=8 --> Tiên Tiến
         *  diem<=9 --> Giỏi
         *  diem<=10 --> Xuất sắc
         
         *  4. Nhập thông tin nhiều người yêu cũ: Nhập các thông tin của NY Cũ thông tin sau: Tên, Năm Sinh, Giới tính, Chiều cao (Sử dụng mảng)
         * - Tên người yêu:
         * - Năm sinh:
         * - Tuổi người yêu:         
         * - Giới tính:            
         * - Chiều cao:        
           
        THANG ĐIỂM LẤY ĐIỂM LAB:
        - Làm đủ và đúng các mục đề bài đưa ra là: 8 điểm
        - Clean Code + || - 1 ĐIỂM
        - Áp dụng được kiến thức của đầu bài đưa ra + || - 1 Điểm
        - Copy bài có sẵn hoặc copy code ở bài cũ vào mặc định 0 điểm.
   */
  public static void main(String[] args) {
    //Bài 2: Khoảng BCC
    int khoang1 = 7, khoang2 = 5;
    //Cách 1: sử dụng hoán vị để giải quyết
//    if (khoang1 > khoang2) {
//      int temp = khoang1;
//      khoang1 = khoang2;
//      khoang2 = temp;
//    }

    for (int i = Math.min(khoang1, khoang2); i <= Math.max(khoang1, khoang2); i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d  x %d = %d\n", i, j, i * j);
      }
    }

    //Bài 3: Có 1 số bạn code chưa tối ưu
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        if (i ==7) {
          break;
        }
        System.out.printf("%d  x %d = %d\n", i, j, i * j);
      }
    }
    //Bài 4: NYC
    Scanner sc= new Scanner(System.in);
    String arrTenNYC[];
    int arrNsNYC[];
    int size;
    System.out.println("Mời bạn nhập số lượng NYC: ");
    size = Integer.parseInt(sc.nextLine());
    //Sau khi có được số lượng phần tử cần khởi tạo mảng
    arrTenNYC = new String[size];
    arrNsNYC = new int[size];
    for (int i = 0; i < arrTenNYC.length; i++) {
      System.out.println("Mời bạn nhập tên: ");
      arrTenNYC[i] = sc.nextLine();
      System.out.println("Mời bạn nhập Năm sinh: ");
      arrNsNYC[i] = Integer.parseInt(sc.nextLine());
    }
    System.out.println("Danh sách NYC bạn nhập vào là: ");
    for (int i = 0; i < arrTenNYC.length; i++) {
      System.out.printf("%s %d %d \n",arrTenNYC[i],arrNsNYC[i],2021 - arrNsNYC[i]);
    }
  }
}
