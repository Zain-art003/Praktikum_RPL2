/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2_pert2;

/**
 *
 * @author Zain
 */
public class RPL2_pert2 {

    public static void main(String[] args) {
//        User user = new User();
//        user.login();
//        user.logout();
//        
//        Seller seller = new Seller();
//        seller.addProduct("Nasi Goreng");
//        
//        Buyer buyer = new Buyer();
//        buyer.login();
//        buyer.logout();
//        
//        Admin admin = new Admin();
//        admin.login();
//        admin.logout();
//    }
    
   User user = new User("Rakha", "rakha@user.com");
        user.login();
        user.logout();

        Admin admin = new Admin("Zain", "admin@abang.com");
        admin.login();
        admin.manageUser();

        Buyer buyer = new Buyer("Favor", "buyer@adeadean.com");
        buyer.login();
        buyer.logout();
    }
}
