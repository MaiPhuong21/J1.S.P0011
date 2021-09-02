/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Utility {
    public static int getInt(Scanner sc,String msg, String pattern){
        String line="";
        int result;
        do{
            System.out.print(msg);
            line=sc.nextLine();
            try{
            
            if(line.matches(pattern)){
                result=Integer.parseInt(line);
                break;
            }else continue;
            }catch(Exception ex){
                
            }
        }while(true);
        return result;
    }
    public static String getString(Scanner sc, String msg, boolean isEmpty, String pattern) {
        String line = "";
        do {
            System.out.print(msg);
            line = sc.nextLine();
            if (line.isEmpty() && !isEmpty) {
                continue;
            } else {
                if (pattern.isEmpty()) {
                    break;
                } else if (line.matches(pattern)) {
                    break;
                } else {
                    continue;
                }
            }
        } while (true);
        return line;
    }
    public static boolean GetYesNo(String msg)
    {
        String s = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do
        {
            System.out.print(msg);
            try
            {
                s = sc.next("[yYnN]");
                loop = false;
            }
            catch(Exception e)
            {
                System.out.println(e);
                sc.nextLine();
            }
        }while(loop);
        if(s.charAt(0) == 'y' || s.charAt(0) == 'Y') return true;
        else return false;
    }

}
