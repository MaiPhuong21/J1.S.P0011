/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;
import Utility.Utility;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Manager {
    static Scanner sc=new Scanner(System.in);
    
//    public static String DectoHex(int num){
//        int remain;
//        String  result="";
//        while (num > 0) {            
//            remain = num % 16;    
//            switch(remain){
//                case 10:
//                    result="A"+result;                    
//                    break;
//                case 11:
//                    result="B"+result;                    
//                    break;
//                case 12:
//                    result="C"+result;                    
//                    break;
//                case 13:            
//                    result="D"+result;                    
//                    break;
//                case 14:
//                    result="E"+result;                    
//                    break;
//                case 15:
//                    result="F"+result;                    
//                    break;
//                default:
//                    result=remain+result;
//                    break;
//            }            
//            num=num/16;
//        }
//        return result;
//    }
    public static void fromBin(int out){
        String num=Utility.getString(sc, "Enter value to convert: ", false, "[0-1]*");
        if(out==2){
            System.out.println("Convert "+num+" from binary to decimal");
            System.out.println("Your result: "+BinToDec(num));
        }
        if(out==3){
            System.out.println("Convert "+num+" from binary to hexadecimal");
            System.out.println("Your result: "+DecToHex(BinToDec(num)));
        }
    }
    
    public static void fromDec(int out){
        int num=Utility.getInt(sc, "Enter value to convert: ","[0-9]*");
        if(out==1){
            System.out.println("Convert "+num+" from Decimal to Binary");
            System.out.println("Your result: "+DecToBin(num));
        }
        if(out==3){
            System.out.println("Convert "+num+" from Decimal to Hexadecimal");
            System.out.println("Your result: "+DecToHex(num));
        }
    }

    public static void fromHex(int out){
        String num=Utility.getString(sc, "Enter value to convert: ", false, "[0-9A-F]*");
        if(out==1){
            System.out.println("Convert "+num+" from Hexadecimal to Binary");
            System.out.println("Your result: "+DecToBin(HexToDec(num)));
        }
        if(out==2){
            System.out.println("Convert "+num+" from Hexadecimal to Decimal");
            System.out.println("Your result: "+HexToDec(num));
        }
    }
       
    public static String DecToHex(int num){
        String hex=Integer.toHexString(num);
        return hex.toUpperCase();
    }
    public static int HexToDec(String num){
        int dec=Integer.valueOf(num,16);
        return dec;
    }
    public static int BinToDec(String num){
        int dec=Integer.valueOf(num, 2);
        return dec;
    }
    public static String DecToBin(int num){
        String bin=Integer.toBinaryString(num);
        return bin;
    }
}
