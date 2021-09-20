/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_TOANTU_CAULENHRENHANH;

/**
 *
 * @author Dungna89
 */
public class B5_CauLenhDieuKien_IF {
   /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
    */
  public static void main(String[] args) {
    int nghi = 5;
    if (nghi <=4) {
      System.out.println("Chúc mừng bạn nên nghỉ tiếp đi");
      return;//kết thúc ngay lập tức trong phương thức và code sẽ ko chạy tiếp
    }
    System.out.println("Chúc mừng bạn đã mất 700k");
  }
}
