package task_9.employees;

public class Middle extends Employees{
    public Middle(String position, String task, String rank, String rating) {
        super(position, task, rank, rating);
    }

    @Override
    public void appointTask(String task) {
        System.out.println("Task for the Middle developer is: " + task);
    }
}
