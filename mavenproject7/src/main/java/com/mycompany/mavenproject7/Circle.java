
package com.mycompany.mavenproject7;


public class Circle extends Shape{
    
    private float radius;
    
  public Circle(float radius){
      this.radius=radius;
  }
  public float calculateArea(){
      area=3.14f*radius*radius;
      return area;
  }
}
