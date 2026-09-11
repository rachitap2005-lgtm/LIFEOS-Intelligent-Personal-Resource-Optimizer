package LifeOS.model;
public class Task {

    private String name;
    private int difficulty;
    private int importance;
    private int estimatedHours;
    private int daysLeft;

    public Task(String name, int difficulty, int importance,
                int estimatedHours, int daysLeft) {

        if (estimatedHours <= 0 || daysLeft < 0) {
            throw new IllegalArgumentException("Invalid task data");
        }

        this.name = name;
        this.difficulty = difficulty;
        this.importance = importance;
        this.estimatedHours = estimatedHours;
        this.daysLeft = daysLeft;
    }

    public double calculatePriority() {

        double urgency = 10.0 / (daysLeft + 1);

        return (importance * 2)
                + difficulty
                + urgency
                + (estimatedHours * 0.5);
    }

    public String getName() {
        return name;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public double getPriority() {
        return calculatePriority();
    }

    @Override
    public String toString() {

        return name
                + " | Hours: " + estimatedHours
                + " | Days Left: " + daysLeft
                + " | Priority: "
                + String.format("%.2f", calculatePriority());
    }
}