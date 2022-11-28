/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phoneuser;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
interface phone{
    
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    public void powerOn();
    public void powerOff();
    public void volumeUp();
    public void volumeDown();
}
