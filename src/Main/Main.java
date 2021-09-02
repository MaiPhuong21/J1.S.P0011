/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Utility.Utility;
import java.util.Scanner;
import Management.Manager;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice=true;
        while (choice) {
            System.out.println("======Convert System======");
            System.out.println("1. Binary");
            System.out.println("2. Decimal");
            System.out.println("3. Hexadecimal");
            int inputBase = Utility.getInt(sc, "Enter input base: ", "[1-4]");
            int outputBase = Utility.getInt(sc, "Enter output base: ", "[1-3]");
            switch (inputBase) {
                case 1:
                    Manager.fromBin(outputBase);
                    break;
                case 2:
                    Manager.fromDec(outputBase);
                    break;
                case 3:
                    Manager.fromHex(outputBase);
                    break;
            }
            choice=Utility.GetYesNo("Do you want to continue (y/n)?");
            
        }

    }
}
