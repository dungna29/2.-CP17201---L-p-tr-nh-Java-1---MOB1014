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
public class B2_KhaiBaoBien {

  /*
      *********** Biến khái niệm cơ bản ***********
      Định nghĩa: Dùng để lưu trữ giá trị trong lập trình. Biến được lưu trữ ở trong Ram.
      Công thức: <kiểu dữ liệu> <tên biến> [=giá trị khởi đầu];
      <kiểu dữ liệu>: Giúp định nghĩa giá trị muốn lưu trữ có kiểu dữ liệu là gì
      <tên biến>:Giúp định danh và gọi biến đó khi sử dụng. Có phân biệt chữ hoa chữ thường.
      [=giá trị khởi đầu]: Đưa giá trị đúng kiểu dữ liệu
  
      *********** Quy tắc đặt tên ***********
      Tên biến có phân biệt chữ hoa và chữ thường. Nên đặt tên biến bằng Tiếng Anh
         String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
         String FirstName; //Kiểu CamelCase //Sử dụng khi tên Class có 2 từ trở lên hoặc 1 từ
         String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
         Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
         int int = 5; //Vi phạm nguyên tắc đặt biến
         Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
      *********** Các kiểu dữ liệu có trong java ***********  
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean (true, false)
            + Kiểu var: tự định nghĩa theo giá trị
  
      *********** Biến toàn cục và biến cục bộ ***********        
      + Biến toàn bộ: Khai báo bên ngoài của phương thức
        - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
        Ví dụ đặt tên: _firtName, _firstName;
      + Biến cục bộ: Khai báo bên trong phương thức. Biến cục bộ sẽ chỉ được sử dụng ở bên trong của 1 phương thức.  
   */
  static int _temp;//Khai báo 1 biến toàn cục    

  public static void main(String[] args) {
    //1. Char kiểu ký tự
    char c1 = 'a';
    char c2 = '/';
    char c3 = '1';
    char c4 = '+';
    char c5, c6, c7 = '4';

    //2. String kiểu chuỗi
    String s1 = "FPOLY";//Khai báo biến tên s1 có kiểu dữ liệu là string và có khởi tạo giá trị ban đầu.
    String s2;//Khai báo biến tên s2 có kiểu dữ liệu là string và không khởi tạo giá trị ban đầu.
    String s3, s4, s5 = "FPOLY";//Khai báo nhiều tên biến nhưng phải có kiểu cùng kiểu dữ liệu và có thể khởi tạo hoặc không khởi tạo giá trị ban đầu.

    //3. int kiểu số nguyên
    int a1 = 5;

    //4. double, float kiểu số thực
    double d1 = 9.6;
    float f1 = 9.6f;//f có thể viết hoa hoặc viết thường

    //5. boolean kiểu logic
    boolean b1 = true;//Chỉ nhận 2 giá trị true và false

    //6. var
    //var name;//Khi sử dụng var bắt buộc phải khởi tạo giá trị
    var v1 = "Fpoly";
    var v2 = 1;
    var v3 = 9.6;
    var v4 = 'a';

  }
}
