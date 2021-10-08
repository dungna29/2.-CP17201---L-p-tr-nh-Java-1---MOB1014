/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

import java.util.List;

/**
 *
 * @author Dungna89
 */
public class B2_Method_PhuongThucKhongTraVe {

  /*
         *  Bài Hàm -Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểvà còn nhiều kiểu khác.
         *u trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường hoặc hoa chữ cái đầu 
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
   */
  public static void main(String[] args) {
    //1. Khi sử dụng phương thức cần phải biết tên phương thức và phương thức nằm ở Class nào   
    //phepTinhCong1; Lỗi vì kết thúc phương thức khi gọi cần phải có ();
    phepTinhCong1();

    //2. Đối với phương có tham số lưu ý truyền đủ số tham số mà phương thức cần, truyền đúng kiểu dữ liệu
    //phepTinhCong2(); Không truyền đủ tham số cho phương thức
    //phepTinhCong2(1); Truyền thiếu tham số
    phepTinhCong2(5, 7);
    
    //3. Khi gọi các phương thức sử dụng nạp chồng chỉ cần truyền số lượng tham số sẽ gọi đúng cái phương thức cần gọi  
    phepNhan();
    phepNhan(5, 5, 5, 5);

  }

  //Phần 1:  Phương thức không trả về cũng không tham số
  public static void phepTinhCong1() {
    int a = 10, b = 100;
    System.out.printf("%d + %d = %d", a, b, a + b);
  }

  //Phần 2: Phương thức không trả về có tham số
  public static void phepTinhCong2(int a, int b) {
    System.out.printf("%d + %d = %d", a, b, a + b);
  }

  //Phần 3: Nạp chồng phương thức trong tính đa hình OOP Overloading
  public static void phepNhan() {
    int a = 10, b = 100;
    System.out.printf("%d + %d = %d", a, b, a + b);
  }

  public static void phepNhan(int a, int b) {
    System.out.printf("%d + %d = %d", a, b, a + b);
  }

  public static void phepNhan(int a, int b, int c) {
    System.out.printf("%d + %d = %d", a, b, a + b);
  }

  public static void phepNhan(int a, int b, int c, int d) {
    System.out.printf("%d + %d = %d", a, b, a + b);
  }
  
  //Các tham số có thể đa dạng có thể là tất cả các kiểu dữ liệu mà các bạn đã được học hoặc sẽ học trong tương lai
  public void method1(int[] arr, SinhVien sv, List<SinhVien> lst){
    
  }
}
