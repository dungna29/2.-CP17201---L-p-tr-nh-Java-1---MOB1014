/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

/**
 *
 * @author Dungna89
 */
public class B1_Array {

  /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
                    - Hai câu lệnh đi kèm vòng lặp: 
                      break; Ngắt vòng lặp
                      continue; Bỏ qua đoạn code phía sau và chạy sang vòng lặp tiếp theo
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
  public static void main(String[] args) {
    //Phần 1: Khai báo mảng
    int a = 5;
    int[] arrNumbers1;//Khai báo 1 mảng số nguyên
    String arrNames[] = {"Tú", "Dũng", "Hoàng", "Long"};//Khai báo 1 mảng String có khởi tạo giá trị ban đầu
    double arrDiemJava[];

    //Để sử dụng được 1 mảng phải khởi tạo với kích thước là 1 số nguyên không âm
    arrNumbers1 = new int[5];//Khởi tạo 1 mảng số nguyên gồm 5 phần tử
    arrDiemJava = new double[10];

    //Phần 2: Gán giá trị cho mảng thì cần biết index
    //arrNumbers1 = 5; Sai vì không xác định đưa gia trị 5 vào đâu
    arrNumbers1[0] = 5;//Gán giá trị vào index 0 trong mảng
    arrNumbers1[1] = 6;
    arrNumbers1[2] = 7;
    arrNumbers1[3] = 8;
    arrNumbers1[4] = 9;
    arrNumbers1[2] = 10;//ghi đè giá trị

    arrDiemJava[0] = 6.5;
    //Phần 3: Truy xuất giá trị trong mảng cũng cần biết index
    //Lấy 1 giá trị
    System.out.println(arrNumbers1[0]);//=5
    System.out.println(arrNumbers1[1]);
    System.out.println(arrNumbers1[2]);
    System.out.println(arrNumbers1[3]);
    System.out.println(arrNumbers1[4]);
    System.out.println("==================");
    //Sử dụng vòng lặp để in
    //Foreach = fore + tab   
    for (var x : arrNumbers1) {
      System.out.println(x + 1);
    }
    System.out.println("====================");
    //for
    //arrNumbers1.length = chính là độ dài của mảng
    for (int i = 0; i < arrNumbers1.length; i++) {
      System.out.println(arrNumbers1[i]);
    }

    //Break và continue
    //Ví dụ 1: Chỉ in ra 3 phần đầu tiên
    for (int i = 0; i < arrNumbers1.length; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(arrNumbers1[i]);
    }
    //Ví dụ 2: Chỉ in ra những index lẻ
    for (int i = 0; i < arrNumbers1.length; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(arrNumbers1[i]);
    }
  }
}
