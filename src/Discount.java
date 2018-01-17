/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muhammad Muizuddin
 */
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double amount;
        double discount;
        double total;
        
        
        System.out.println("PRICE CHECKER VERSION 3.0");
        System.out.println("Sila masukkan jumlah harga pembelian anda: ");
        amount= input.nextDouble();
        
        if (amount<100){
            discount='0';
            
        }
        else if (amount>100)
        {
            discount='5';
        }
        
        discount= (amount*5/100);
        total= (amount-discount);
        
        System.out.println("Harga pembelian anda ialah: "+total);
        
        
    }
}
