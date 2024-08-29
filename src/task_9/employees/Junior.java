package task_9.employees;

public class Junior extends Employees{
    public Junior(String position, String task, String rank, String rating) {
        super(position, task, rank, rating);
    }

    @Override
    public void appointTask(String task) {
        System.out.println("Task for the Junior developer is: " + task);
    }
}