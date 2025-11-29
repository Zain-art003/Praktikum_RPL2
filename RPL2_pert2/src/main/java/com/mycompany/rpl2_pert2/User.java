/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_pert2;

/**
 *
 * @author Zain
 */
//public class User {
//    String nama;
//    String email;
//    String npm;
//    
//    
//    
//    public void login(){
//        System.out.println("User Melakukan Login");
//    }
//    
//    public void logout(){
//        System.out.println("User Melakukan Logout");
//        
//        
//    }
//}
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println(name + " melakukan login");
    }

    public void logout() {
        System.out.println(name + " melakukan logout");
    }
}