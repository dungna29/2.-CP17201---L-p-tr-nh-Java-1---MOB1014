/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_3_VONGLAP;

/**
 *
 * @author Dungna29
 */
public class S2_VongLap_Foreach {

    /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
     */
    public static void main(String[] args) {
        String[] arrFPT = {"FPT", "FPT1", "FPT2"};
        for (String x : arrFPT) {
            System.out.println(x);
        }
        for (int i = 0; i < arrFPT.length; i++) {
            System.out.println(arrFPT[i]);
        }
    }
}
