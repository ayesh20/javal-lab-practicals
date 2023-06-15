
package com.mycompany.mavenproject7;

public abstract class Shape {
    
    protected float area;
    public abstract float calculateArea();
    public void display(){
        System.out.println("area is:"+area);
    }
}
