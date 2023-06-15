
package com.mycompany.mavenproject7;


public class Rectangle extends Shape {
    private float lenth;
    private float width;
    
  public Rectangle(float lenth,float width){
      this.lenth=lenth;
      this.width=width;
  }
  public float calculateArea(){
      area=lenth*width;
      return area;
  }
}
