/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.quiz;

import java.util.Scanner;
import m10119002.pbo.quiz.target.Customer;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi Program Kasir Rock n Roll Haircut
 * main class
 * 
 */
public class Program {
    private static Scanner scanner = new Scanner(System.in);
    
    // ketentuan g. inputan berasal dari keyboard user.
    private static String getInput() {return scanner.nextLine();}
    
    public static void main(String[] args) {
        String test;
        Customer cust = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        cust.setName(getInput());
        System.out.print("Customer Email : ");
        cust.setEmail(getInput());
        cust.displayService();
        System.out.print("Choose (1/2/3): ");
        test = getInput();
        cust.setPriceService(cust.getPrice(Integer.parseInt(test)));
        System.out.print("Are you Member (yes/no) : ");
        test = getInput();
        cust.setMember(cust.checkMemberStatus(test));
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("#******************************#");
        System.out.println("#*******CUSTOMER INVOICE*******#");
        System.out.println("Date Transaction : ".concat(cust.currentTime()));
        System.out.println("Service Price : Rp.".concat(Float.toString(cust.getPriceService())));
        System.out.println("Discount : Rp.".concat(Float.toString(cust.getSale(cust.isMember(), cust.getPriceService()))));
        System.out.println("Total Pay : Rp.");
    }
}
