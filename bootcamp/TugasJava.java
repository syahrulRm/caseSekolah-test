/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp;

import java.util.Scanner;

public class TugasJava {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("silahkan isi nama anda");
        String name = sc.nextLine();
        System.out.println("silahkan isi jenis kelamin anda");
        char gender = sc.next().charAt(0);
        System.out.println("silahkan isi umur anda");
        int age = sc.nextInt();
        System.out.println("silahkan isi nomor telepon anda");
        long mobileNo = sc.nextLong();
        System.out.println("silahkan isi panjang ruangan");
        int panjang = sc.nextInt();
        System.out.println("silahkan isi lebar ruangan");
        int lebar = sc.nextInt();
         System.out.println("Buat Id");
        String username = sc.next();
        String password = sc.next();
        
        System.out.println("silahkan isi data data berikut ini");
        System.out.println("Name :" + name);
        System.out.println("Gender :" + gender);
        System.out.println("Age :" + age + "tahun");
        System.out.println("Mobile Number" + mobileNo);
        System.out.println("Username :" + username);
        System.out.println("Password :" + password);
        System.out.println("Luas Ruangan :" +panjang*lebar+ "m2");
        
    }
}
