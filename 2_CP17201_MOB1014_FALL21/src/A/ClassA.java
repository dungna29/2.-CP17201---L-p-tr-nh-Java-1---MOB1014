/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

/**
 *
 * @author Dungna89
 */
public class ClassA {

  private int a; //Chỉ được gọi bên trong của class
  public int b; //Gọi ở bất cứ đâu 
  int c;//Default //Chỉ được gọi bên trong Package
  protected int d; //Chỉ được gọi khi là lớp con của nó bên ngoài package
}
