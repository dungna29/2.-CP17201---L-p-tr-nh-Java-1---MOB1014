/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dungna89
 */
public class B5_List {
 
   /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
  public static void main(String[] args) {
    //Phần 1: Khởi tạo List không định kiểu và loại có định kiểu
    
    //Không định kiểu:
    List lstKhongDinhKieu = new ArrayList();
    List lstKhongDinhKieu1;//Khai báo
    lstKhongDinhKieu1 = new ArrayList();//Khởi tạo
    
    //Có định kiểu:
    List<Integer> lstSoNguyen = new ArrayList<>();
    List<Double> lstSoThuc = new ArrayList<Double>();
    List<String> lstChuoi = new ArrayList<>();
    
    //Phần 2: Gán giá trị với phương thức add
    lstKhongDinhKieu.add("1");
    lstKhongDinhKieu.add(1);
    lstKhongDinhKieu.add(true);
    lstKhongDinhKieu.add('a');
    lstKhongDinhKieu.add(0, "abc");//Chèn giá trị vào index 0
   
    lstSoNguyen.add(7);
    lstSoNguyen.add(2);
    lstSoNguyen.add(9);
    lstSoNguyen.add(5);
    
    //Phần 3:Truy xuất phần tử có trong danh sách với phương thức get(index);
    System.out.println(lstKhongDinhKieu.get(0));
    for (int i = 0; i < lstKhongDinhKieu.size(); i++) {//.size có kích thương List
      System.out.println(lstKhongDinhKieu.get(i));
    }
    for (Integer x : lstSoNguyen) {
      System.out.println(x);
    }
    
    //Một vài ví dụ về phương thức
    System.out.println(lstSoNguyen.isEmpty());
    Collections.sort(lstSoNguyen);//Sắp xếp tăng dần
    Collections.reverse(lstSoNguyen);//Đảo ngược danh sách lại
    lstKhongDinhKieu.clear();//Xóa tất cả các phần tử danh sách
  }
}
