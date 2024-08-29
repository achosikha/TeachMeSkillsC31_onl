package task_9.employees;

// Employee IT position
// IT  task
// Rank
public abstract class Employees implements Tasks{
    private final String position;
    private final String task;
    private final String rank;
    private final String rating;

    public Employees(String position, String task, String rank, String rating) {
        this.position = position;
        this.task = task;
        this.rank = rank;
        this.rating = rating;
    }

    // Override method toString() from super class Object
    @Override
    public String toString() {
        return "Employees: \n" +
                "Position: " + this.position + '\n' +
                "Task: " + this.task + "\n" +
                "Rank: " + this.rank + '\n' +
                "Rating: " + this.rating + "\n";
    }
}