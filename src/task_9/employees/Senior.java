package task_9.employees;

public class Senior extends Employees{
    public Senior(String position, String task, String rank, String rating) {
        super(position, task, rank, rating);
    }

    @Override
    public void appointTask(String task) {
        System.out.println("Task for the Senior developer is: " + task);
    }
}
