/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trafficlightsimulation1;

/**
 *
 * @author shali
 */
public class TrafficLightSimulation1 {

    public static void main(String[] args) {
       
        RedLightThread redLightThread = new RedLightThread();
        GreenLightThread greenLightThread = new GreenLightThread();
        YellowLightThread yellowLightThread = new YellowLightThread();

        redLightThread.start();
        greenLightThread.start();
        yellowLightThread.start();
    }
    
}
