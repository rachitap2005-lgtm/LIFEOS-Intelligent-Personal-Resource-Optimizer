package LifeOS;
import java.util.Scanner;
import LifeOS.model.*;
import LifeOS.service.*;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student("Rachita", 5000);

        // Sample data
        student.addTask(new Task(
                "Java Assignment", 4, 5, 3, 1
        ));

        student.addTask(new Task(
                "Math Revision", 3, 4, 2, 3
        ));

        student.addExpense(new Expense("Food", 200));
        student.addExpense(new Expense("Travel", 100));

        int choice;

        do {

            System.out.println("\n===== LIFEOS =====");
            System.out.println("Student: " + student.getName());

            System.out.println("\n1. View Tasks");
            System.out.println("2. View Budget");
            System.out.println("3. Generate Smart Plan");
            System.out.println("4. What-If Analysis");
            System.out.println("5. Exit");

            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n===== TASKS =====");

                    for (Task task : student.getTasks()) {
                        System.out.println(task);
                    }
                    break;

                case 2:
                    BudgetManager.showBudget(student);
                    break;

                case 3:
                    System.out.print("Enter available hours: ");
                    int hours = sc.nextInt();

                    DecisionEngine.generatePlan(student, hours);
                    break;

                case 4:
                    System.out.print("Enter extra expense: ");
                    double expense = sc.nextDouble();

                    WhatIfAnalyzer.checkBudget(student, expense);
                    break;

                case 5:
                    System.out.println("\nThank you for using LifeOS!");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
