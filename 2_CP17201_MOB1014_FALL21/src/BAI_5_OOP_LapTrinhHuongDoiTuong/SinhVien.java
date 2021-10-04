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
public class SinhVien {//Tên Class bắt buộc phải viết hoa chữ cái đầu củ từ

  // Phần 1: Liệt kê tất cả các thuộc tính mà đối tượng cần
  private String msv;//Khi private thì các thuộc tính chỉ được gọi bên trong class
  private int ns;
  private String truong;
  private String nganh;

  //Phần 2: Contructor khi mới học luôn có 2 Contructor
  /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên
            trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số  
        - Nếu khi khởi tạo đối tượng mà đối tượng không có contructor nào thì chương trình sẽ tự động khởi tạo cho đối tượng đó 1 contructor mặc định đó là contructor không tham số.
   */
  
  // 2.1 Contructor không tham số: alt + insert hoặc chuột phải chọn Insert code

  public SinhVien() {
  }
  
  // 2.2 Contructor có tham số: Tương tự cách trên nhưng Select All Thuộc tính

  public SinhVien(String msv1, int ns, String truong, String nganh) {
    msv = msv1;
    this.ns = ns;
    this.truong = truong;
    this.nganh = nganh;
    //this: Tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    //base: Tham chiếu đến thuộc tính và phương thức của lớp cha
  }

  //Phần 3: Getter và Setter: Chuột Phải chọn Insert Code
  /*
  Bởi các thuộc tính bị private nên phải sử dụng Getter và Setter để lấy giá trị
  và gán giá trị cho thuộc tính của đối tượng.
   */
  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public int getNs() {
    return ns;
  }

  public void setNs(int ns) {
    this.ns = ns;
  }

  public String getTruong() {
    return truong;
  }

  public void setTruong(String truong) {
    this.truong = truong;
  }

  public String getNganh() {
    return nganh;
  }
  
  public void setNganh(String nganh) {
    this.nganh = nganh;
  }

  //Phần 4: Các phương thức của đối tượng
  //Phương thức toString = alt + insert chọn toString
  
  @Override
  public String toString() {
    return "SinhVien{" + "msv=" + msv + ", ns=" + ns + ", truong=" + truong + ", nganh=" + nganh + '}';
  }

  //Tự viết 1 phương thức in ra màn hình riêng
  void inThongTinSVRaManHinh() {
    System.out.printf("Tên: %s %d %s %s \n",msv,ns,truong,nganh);
  }
}
