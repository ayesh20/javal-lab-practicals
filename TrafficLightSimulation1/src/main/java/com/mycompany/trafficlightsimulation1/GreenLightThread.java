/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficlightsimulation1;

/**
 *
 * @author shali
 */
public class GreenLightThread extends Thread{
    public void run() {
        try {
            while (true) {
                System.out.println("Green Light");
                Thread.sleep(10000); // Wait for 10 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
