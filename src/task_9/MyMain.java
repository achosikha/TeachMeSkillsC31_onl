package task_9;

import task_9.employees.*;

public class MyMain {
    public static void main(String[] args) {
        getEmployees(createEmployees());
    }

    public static Employees[] createEmployees(){
        return new Employees[] { // anonymous - no name included
                new Senior(
                        "Senior C# .NET Back-End Developer",
                        "Lead development process and guide other developers.",
                        "Senior+",
                        "Your rating is HIGH."),
                new Middle(
                        "Middle FullStack Java Developer",
                        "Build additional modules for the legacy project.",
                        "Middle",
                        "Your rating is NORMAL"),
                new Junior (
                        "Junior Back-End Java Developer",
                        "Learns legacy project and writes small modules.",
                        "Junior Strong/+",
                        "You just STARTED!")
        };
    }

    public static void getEmployees(Employees[] employees){
        for(Employees employee : employees){
            System.out.println(employee);
            employee.appointTask("General tasks...");
        }
        System.out.println();
    }
}