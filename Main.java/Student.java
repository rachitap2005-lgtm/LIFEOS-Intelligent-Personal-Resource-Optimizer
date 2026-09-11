package LifeOS.model;
import java.util.ArrayList;
public class Student {

    private String name;
    private double monthlyBudget;

    private ArrayList<Task> tasks = new ArrayList<>();
    private ArrayList<Expense> expenses = new ArrayList<>();

    public Student(String name, double monthlyBudget) {
        this.name = name;
        this.monthlyBudget = monthlyBudget;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public String getName() {
        return name;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public double getTotalExpenses() {
        double total = 0;

        for (Expense e : expenses) {
            total += e.getAmount();
        }

        return total;
    }

    public double getRemainingBudget() {
        return monthlyBudget - getTotalExpenses();
    }
}