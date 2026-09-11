package LifeOS.service;
import LifeOS.model.Student;

public class WhatIfAnalyzer {

    public static void checkBudget(Student s, double extraExpense) {

        double remaining = s.getRemainingBudget() - extraExpense;

        System.out.println("\n===== WHAT-IF ANALYZER =====");
        System.out.println("Extra Expense: Rs." + extraExpense);
        System.out.println("Budget After Expense: Rs." + remaining);

        if (remaining < 0) {
            System.out.println("WARNING: Budget exceeded!");
        } else {
            System.out.println("Decision: Expense is affordable.");
        }
    }
}