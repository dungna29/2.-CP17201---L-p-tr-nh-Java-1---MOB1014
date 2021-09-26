/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;

/**
 *
 * @author Dungna89
 */
public class B4_ArrayList {
   /*
    Bài ArrayList
        - Định nghĩa: Lớp ArrayList trong java được sử dụng như một mảng động để lưu trữ các phần tử. 
                      ArrayList được tạo với một kích cỡ ban đầu. Khi kích cỡ này bị vượt, collection 
                      tự động được tăng. Khi các đối tượng bị gỡ bỏ, ArrayList có thể bị giảm kích cỡ.
        + Lưu ý:
                -   Có thể chứa các phần tử trùng lặp.
                -   Duy trì thứ tự của phần tử được thêm vào.
                -   Không đồng bộ (non-synchronized).
                -   Cho phép truy cập ngẫu nhiên, tốc độ truy xuất (get) phần tử nhanh vì nó lưu dữ liệu theo chỉ mục.
                -   Thao tác thêm/ xóa (add/ remove) phần tử chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào thêm/ xoá khỏi danh sách.
    
        + Phương thứ ArrayList    
                - boolean add(Object o)	Thêm phần tử được chỉ định vào cuối một danh sách.
                - void add(int index, Object element) || add(Object value) Chèn một phần tử được chỉ định 
                  tại vị trí (index) được chỉ định vào danh sách. 
                  Ném IndexOutOfBoundsException nếu index này ở bên ngoài dãy (index < 0 hoặc index > size()).
                - boolean addAll(Collection c)	Thêm tất cả các phần tử trong collection được chỉ định vào 
                  cuối của danh sách gọi phương thức, theo thứ tự chúng được trả về bởi bộ lặp iterator.
                - boolean addAll(int index, Collection c)	Thêm tất cả các phần tử trong collection được 
                  chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. 
                  Ném NullPointerException nếu collection đã cho là null.
                - Object get(int index)	Trả về phần tử tại index đã cho. 
                  Ném IndexOutOfBoundsException nếu index đã cho là ở bên ngoài dãy 
                  (index < 0 hoặc index >= size()).
                - int indexOf(Object o)	Lấy vị trí (index) trong danh sách với sự xuất hiện đầu tiên
                của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - int lastIndexOf(Object o) Lấy vị trí (index) trong danh sách với sự xuất hiện cuối
                cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - Object remove(int index) Gỡ bỏ phần tử tại index đã cho. 
                Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - void retainAll(Collection c)	Xóa những phần tử không thuộc collection c và 
                không thuộc list hiện tại khỏi list hiện tại. 
                Ném NullPointerException nếu collection đã cho là null.
                - void removeAll(Collection c)	Xóa những phần tử thuộc collection c và thuộc list hiện 
                tại khỏi list hiện tại. Ném NullPointerException nếu collection đã cho là null.
                - Object set(int index, Object element)	Thay thế phần tử tại vị trí đã cho trong list này với phần tử đã xác định. Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - Object[] toArray()	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Ném NullPointerException nếu mảng này là null.
                - Object[] toArray(Object[] a)	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Kiểu runtime là của mảng trả về giống như mảng đã xác định.
                - Object clone()	Tạo một bản sao của ArrayList.
                - void clear()	Xóa tất cả các phần tử từ danh sách.
                - void trimToSize()	Cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại.
     */
  public static void main(String[] args) {
    //Phần 1: Khởi tạo ArrayList không định kiểu và loại có định kiểu
    
    //Không định kiểu:
    ArrayList arrLstKhongDinhKieu = new ArrayList();
    ArrayList arrLstKhongDinhKieu1;//Khai báo
    arrLstKhongDinhKieu1 = new ArrayList();//Khởi tạo
    
    //Có định kiểu:
    ArrayList<Integer> arrLstSoNguyen = new ArrayList<>();
    ArrayList<Double> arrLstSoThuc = new ArrayList<Double>();
    ArrayList<String> arrLstChuoi = new ArrayList<>();
    
    //Phần 2: Gán giá trị với phương thức add
    arrLstKhongDinhKieu.add("1");
    arrLstKhongDinhKieu.add(1);
    arrLstKhongDinhKieu.add(true);
    arrLstKhongDinhKieu.add('a');
    arrLstKhongDinhKieu.add(0, "abc");//Chèn giá trị vào index 0
    
  
  }
}
