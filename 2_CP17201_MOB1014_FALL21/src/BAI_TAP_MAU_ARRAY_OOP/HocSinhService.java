/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_ARRAY_OOP;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Dungna89
 */
public class HocSinhService {//Lớp dùng để code các chức năng của Học Sinh
  //Các biến toàn cục phải được khai báo ở đây

  HocSinh[] _arrHSs;
  String _input;
  Scanner _sc = new Scanner(System.in);

  public HocSinhService() {
  }

  public void addHs() {
    System.out.println("Mời bạn nhập số lượng: ");
    _input = _sc.nextLine();
    _arrHSs = new HocSinh[Integer.parseInt(_input)];
    for (int i = 0; i < _arrHSs.length; i++) {
      _arrHSs[i] = new HocSinh();//Phải khởi tạo đối tượng thì mới sử dụng đc
      //Sau khi khởi tạo mới gán giá trị
      System.out.println("Mời bạn nhập mã: ");
      _arrHSs[i].setMahs(Integer.parseInt(_sc.nextLine()));
      System.out.println("Mời bạn nhập tên: ");
      _arrHSs[i].setTen(_sc.nextLine());
      System.out.println("Mời bạn nhập cấp học: ");
      _arrHSs[i].setCapHoc(Integer.parseInt(_sc.nextLine()));
      System.out.println("Mời bạn nhập tên lớp: ");
      _arrHSs[i].setLop(_sc.nextLine());
    }
  }

  public void suaHs() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrHSs.length; i++) {
      if (_arrHSs[i].getMahs() == Integer.parseInt(_input)) {
        System.out.println("Mời bạn nhập tên cần sửa: ");
        _arrHSs[i].setTen(_sc.nextLine());
        System.out.println("Sửa thành công");
        return;
      }
    }
    System.out.println("Không tìm thấy hs bạn cần");
  }

  public void xoaHs() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrHSs.length; i++) {
      if (_arrHSs[i].getMahs() == Integer.parseInt(_input)) {
        _arrHSs[i] = new HocSinh();
        System.out.println("Xóa thành công");
        return;
      }
    }
    System.out.println("Không tìm thấy hs bạn cần");
  }

  public void timKiemHs() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrHSs.length; i++) {
      if (_arrHSs[i].getMahs() == Integer.parseInt(_input)) {        
        System.out.println(_arrHSs[i].toString());
        return;
      }
    }
    System.out.println("Không tìm thấy hs bạn cần");
  }
  public void inDsHs(){
    for (HocSinh x : _arrHSs) {
      System.out.println(x.toString());
    }
  }
}
