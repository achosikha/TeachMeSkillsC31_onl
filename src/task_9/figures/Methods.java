package task_9.figures;

public interface Methods {
    void getParameter();

    default void getDefaultMethod(){
        System.out.println("Default message");
    }
}