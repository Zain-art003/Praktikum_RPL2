/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_pert2;

/**
 *
 * @author Zain
 */
//public class Buyer extends User {
//    @Override
//    public void login(){
//        System.out.println("Buyer Melakukan Login");
//    }
//    
//    @Override
//    public void logout(){
//        System.out.println("Buyer Melakukan Logout");
//    }
//}
class Buyer extends User {
    public Buyer(String name, String email) {
        super(name, email);
    }

    @Override
    public void login() {
        System.out.println("Buyer masuk ke toko online");
    }
}