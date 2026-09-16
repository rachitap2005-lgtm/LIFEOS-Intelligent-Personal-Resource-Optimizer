package LifeOS.service;

import LifeOS.model.Student;
import LifeOS.model.Task;

import java.util.ArrayList;
import java.util.Comparator;

public class DecisionEngine {

    public static void generatePlan(Student s, int hours) {

        System.out.println("\n===== SMART PLAN =====");

        ArrayList<Task> tasks = new ArrayList<>(s.getTasks());

        // Sort tasks by highest priority
        tasks.sort(Comparator.comparingDouble(Task::getPriority).reversed());

        for (Task t : tasks) {

            if (t.getEstimatedHours() <= hours) {
                System.out.println("DO: " + t.getName());
                hours -= t.getEstimatedHours();
            } else {
                System.out.println("POSTPONE: " + t.getName());
            }
        }

        System.out.println("Remaining Hours: " + hours);
    }
}