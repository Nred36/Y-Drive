/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy.drive;

import java.util.Scanner;

/**
 *
 * @author naree1878
 */
public class YyyyyyYYYYYYYYYYyyyyyyyyyyyyyyyyyyyyyyyyyyyyyDRIVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double count = 23;
        System.out.println("Please Enter Your Age");
        Scanner sc = new Scanner(System.in);
        count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 5; i++) {
            System.out.print(count+"^3 ");
            count = Math.pow(count, 3);
            System.out.print(" = "+count+"\n");
            System.out.print(count+"^0.5 ");
            count = Math.sqrt(count);
            System.out.print(" = "+count+"\n");            
        }
        System.out.print("log"+count);
        count = Math.log(count);
        System.out.print(" = "+count+"\n");
        System.out.print("floor "+count);
        count = Math.floor(count);
        System.out.print(" is "+count);
    }

}
