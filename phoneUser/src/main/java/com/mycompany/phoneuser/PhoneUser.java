/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.phoneuser;
import java.util.Scanner;
/**
 *
 * @author Judecca_GilangFibarkah_21103062 
 */
public class PhoneUser {

    public static void main(String[] args) {
        
        int cho;
        
         // membuat objek HP
            phone xiaomi = new xiaomi();
            phone iphone = new iphone();
            phone samsung = new samsung();
            phone oppo = new oppo();
   
        // membuat objek user
        User A = new User(xiaomi);
        User B = new User(iphone);
        User C = new User(samsung);
        User D = new User(oppo);
        
        Scanner input = new Scanner(System.in);
       
        do {
            System.out.println("Silahkan pilih HP");
            System.out.println("1. Xiaomi");
            System.out.println("2. Iphone");
            System.out.println("3. Samsung");
            System.out.println("4. Oppo");
            System.out.println("0. Keluar Aplikasi");
            System.out.println("");
            System.out.print("Pilih   : ");
            cho = input.nextInt();

            System.out.println("");
            System.out.println("");

            switch (cho) {
                case 1 -> {
                    do {
                        System.out.println("%%% Menu HP Xiaomi %%%");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        cho = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (cho) {
                            case 1 -> A.turnOnThePhone();
                            case 2 -> A.turnOffThePhone();
                            case 3 -> A.makePhoneLouder();
                            case 4 -> A.makePhoneSilent();
                            case 0 -> main(args);
                            default -> System.out.println("Incorect Input!!!");
                        }

                    } while (cho != 0);
                }
                    
                case 2 -> {
                    do {
                        System.out.println("@@@ Menu HP Iphone @@@");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        cho = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (cho) {
                            case 1 -> B.turnOnThePhone();
                            case 2 -> B.turnOffThePhone();
                            case 3 -> B.makePhoneLouder();
                            case 4 -> B.makePhoneSilent();
                            case 0 -> main(args);
                            default -> System.out.println("Incorect Input!!!");
                        }
                    } while (cho != 0);
                }
                    
                case 3 -> {
                    do {
                        System.out.println("### Menu HP Samsung ###");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        cho = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (cho) {
                            case 1 -> C.turnOnThePhone();
                            case 2 -> C.turnOffThePhone();
                            case 3 -> C.makePhoneLouder();
                            case 4 -> C.makePhoneSilent();
                            case 0 -> main(args);
                            default -> System.out.println("Incorect Input!!!");
                        }
                    } while (cho != 0);
                }
                    
                case 4 -> {
                    do {
                        System.out.println("$$$ Menu HP Oppo $$$");
                        System.out.println("1. Nyalakan HP");
                        System.out.println("2. Matikan HP");
                        System.out.println("3. Perbesar Volume");
                        System.out.println("4. Perkecil Volume");
                        System.out.println("0. Keluar");
                        System.out.print("Silahkan pilih : ");
                        cho = input.nextInt();

                        System.out.println("");
                        System.out.println("");

                        switch (cho) {
                            case 1 -> D.turnOnThePhone();
                            case 2 -> D.turnOffThePhone();
                            case 3 -> D.makePhoneLouder();
                            case 4 -> D.makePhoneSilent();
                            case 0 -> main(args);
                            default -> System.out.println("Incorect Input!!!");
                        }
                    } while (cho != 0);
                }
                case 0 -> {
                    System.out.println("BYE BYE...");
                    System.out.println("");
                    System.out.println("");
                    System.exit(0);
                }
                default -> System.out.println("Incorect Input!!!");
            }
        } while (cho != 0);
    }
}
