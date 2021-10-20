/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU_LIST_OOP;

import BAI_TAP_MAU_ARRAY_OOP.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Dungna89
 */
public class HocSinhService {

  List<HocSinh> _lstHs;
  HocSinh _HocSinh;
  String _input;
  Scanner _sc = new Scanner(System.in);

  public HocSinhService() {
    _lstHs = new ArrayList<>();
  }

  public void addHs() {
    System.out.println("Mời bạn nhập số lượng: ");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _HocSinh = new HocSinh();//Khởi tạo đối tương
      //Gán giá trị cho đối tượng
      System.out.println("Mời bạn nhập mã: ");
      _HocSinh.setMahs(Integer.parseInt(_sc.nextLine()));
      System.out.println("Mời bạn nhập tên: ");
      _HocSinh.setTen(_sc.nextLine());
      System.out.println("Mời bạn nhập cấp học: ");
      _HocSinh.setCapHoc(Integer.parseInt(_sc.nextLine()));
      System.out.println("Mời bạn nhập lớp: ");
      _HocSinh.setLop(_sc.nextLine());
      //Sau khi gán xong thì phải tiến hành add đối tượng vào List
      _lstHs.add(_HocSinh);
    }

  }

  public void suaHs() {    
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstHs.size(); i++) {
      if (_lstHs.get(i).getMahs() == Integer.parseInt(_input)) {
        System.out.println("Mời bạn nhập tên cần sửa: ");
        _lstHs.get(i).setTen(_sc.nextLine());
        System.out.println("Sửa thành công");        
        return;
       
      }
    }
    
    System.out.println("Không tìm thấy hs bạn cần");
  }

  public void xoaHs() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstHs.size(); i++) {
      if (_lstHs.get(i).getMahs() == Integer.parseInt(_input)) {
        _lstHs.remove(i);
        System.out.println("Xóa thành công");
        return;
      }
    }
    System.out.println("Không tìm thấy hs bạn cần");
  }

  public void timKiemHs() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstHs.size(); i++) {
      if (_lstHs.get(i).getMahs() == Integer.parseInt(_input)) {
        System.out.println(_lstHs.get(i).toString());    
        return;
      }
    }
    System.out.println("Không tìm thấy hs bạn cần");
  }

  public void inDsHs() {
    for (HocSinh x : _lstHs) {
      System.out.println(x.toString());
    }
  }

  //Ứng dụng phuowg thức trả về giúp lười hơn trong lập trình
  public void addHs1() {
    _input = getInput("Số lượng");
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _lstHs.add(new HocSinh(getInput("Tên"), Integer.parseInt(getInput("Cấp học")), Integer.parseInt(getInput("mã hs")), getInput("lớp")));
    }
  }

  public String getInput(String msg) {
    System.out.printf("Mời bạn nhập %s: ", msg);
    return _sc.nextLine();
  }

  public void timKiemHs3() {
    System.out.println(_lstHs.get(getIndex(getInput("mã hs"))).toString());
  }

  public int getIndex(String mhs) {
    for (int i = 0; i < _lstHs.size(); i++) {
      if (_lstHs.get(i).getMahs() == Integer.parseInt(_input)) {
        return i;
      }
    }
    return -1;
  }

  //Hướng dẫn sắp xếp đối tượng
  public void sort(){
    //Cách 1: Sử dụng Comparator
//    Collections.sort(_lstHs, new Comparator<HocSinh>() {
//      @Override
//      public int compare(BAI_TAP_MAU_LIST_OOP.HocSinh o1, BAI_TAP_MAU_LIST_OOP.HocSinh o2) {
//      //return o1.getTen().compareTo(o2.getTen());//Sắp xếp chuỗi ASC
//      //return -o1.getTen().compareTo(o2.getTen());//Sắp xếp chuỗi DES
//        if (o1.getMahs() > o2.getMahs()) {
//          return 1;
//        }
//        return -1;
//      }
//    });
    
    //Cách 2: Sử dụng Comparable
    Collections.sort(_lstHs);
    
     //Cách 3: Học thuộc lòng lambda
    //_lstHs.sort((o1, o2) -> o1.getTen().compareTo(o2.getTen()));
   
    //Lambda expression for sorting theo điểm
    //_lstHs.sort((HocSinh s1, HocSinh s2)->s1.getMahs()-s2.getMahs());  
    
     Collections.sort(_lstHs, Comparator.comparing(HocSinh::getMahs));//Cái này dễ thuộc nhất

  }
}
