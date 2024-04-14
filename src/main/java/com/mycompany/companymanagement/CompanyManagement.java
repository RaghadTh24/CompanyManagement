/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.companymanagement;

/**
 *
 * @author Raghad
 */
public class CompanyManagement {
public static void main(String[] args) {
        Manager manager = new Manager("Alice", 5000, "HR");
        Worker worker = new Worker("Bob", 2000, 40);

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nWorker Details:");
        worker.displayDetails();
    }
}
