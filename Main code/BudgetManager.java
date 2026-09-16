package LifeOS.service;

import LifeOS.model.Student;

public class BudgetManager {

    public static void showBudget(Student s) {

        System.out.println("\n===== BUDGET =====");
        System.out.println("Budget: Rs." + s.getMonthlyBudget());
        System.out.println("Spent: Rs." + s.getTotalExpenses());
        System.out.println("Remaining: Rs." + s.getRemainingBudget());
    }
}