/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorymanagementunit;

import java.util.*;


/**
 *
 * @author mahinjm
 */


public class MemoryManagementUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a logical Address:");
        int n = sc.nextInt();
        
        //Stack <Integer> address = new Stack<Integer>();
        String address = "";
        
        address = Integer.toBinaryString(n);
        
        //address = String.format("%4s", address).replace(' ', '0');
        address = String.format("%16s", address).replace(' ', '0');
        
        System.out.println("Logical Address: " +address);
        System.out.println("Length Of Logical Address: " +address.length());
        
        String pageTable[][] =  {                                    
                                    { "010", "1"},
                                    { "001", "1"},
                                    { "110", "1"},
                                    { "000", "1"},
                                    { "100", "1"},
                                    { "011", "1"},
                                    { "000", "0"},
                                    { "000", "0"},
                                    { "000", "0"},
                                    { "101", "1"},
                                    { "000", "0"},
                                    { "111", "1"},
                                    { "000", "0"},
                                    { "000", "0"},
                                    { "000", "0"},
                                    { "000", "0"},
                                };
        
        String indexString = address.substring(0,4);
        
        //System.out.println(indexString);
        
        int index = Integer.parseInt(indexString,2);
        
        //System.out.println("Index: " +index);
        
        String physicalAddress = pageTable[index][0]+address.substring(4,16);
        System.out.println("Physical Address: "+physicalAddress);
        System.out.println("Length Of Physical Address: " +physicalAddress.length());
        
        
    }
    
}
