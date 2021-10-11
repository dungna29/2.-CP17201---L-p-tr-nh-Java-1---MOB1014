/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

import A.ClassA;

/**
 *
 * @author Dungna89
 */
public class ClassB {
   public ClassB() {
    ClassA classA = new ClassA();
    //classA.a = 1; Lỗi vì private
    classA.b = 2;
    //classA.c = 3; Vì default chỉ được gọi bên trong 1 packae
    //classA.d = 4;
  }
}
