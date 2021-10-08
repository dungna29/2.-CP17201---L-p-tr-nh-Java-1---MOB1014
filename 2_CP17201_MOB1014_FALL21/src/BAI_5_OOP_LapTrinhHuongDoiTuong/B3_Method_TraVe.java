/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna89
 */
public class B3_Method_TraVe {

  /*
         * Method trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: phương thức trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, đối tượng.... tương ứng với kiểu dữ liệu của phương thức.
   */
  public static void main(String[] args) {
    //1. Cách tương tự void
    //2. Phương thức trả về là 1 giá trị hoặc tập giá trị
    int a = 6;
    tinhTong();//Không thể tự in ra vì nó là 1 giá trị
    System.out.println(tinhTong() +10);
    
    for (int i = 0; i < getAllyeas().length; i++) {
      System.out.println(getAllyeas()[i]);
    }
  }

  //Phần 1: Phương thức trả về không tham số
  public static int tinhTong() {//int kiểu trả về của phương thức
    int a = 9, b = 9;
    return a + b;//Phải trả về đúng kiểu dữ liệu  
  }
  
  public static int[] getAllyeas(){
    int[] arrYears = new int[2022-1900];
    int temp = 1900;
    for (int i = 0; i < arrYears.length; i++) {
      arrYears[i] = temp;
      temp++;
    }
    return arrYears;
  }
}
