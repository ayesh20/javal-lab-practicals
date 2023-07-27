/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trafficlightsimulation1;

/**
 *
 * @author shali
 */
public class RedLightThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Red Light");
                Thread.sleep(5000); // Wait for 5 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
