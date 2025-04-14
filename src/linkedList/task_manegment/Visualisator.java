package linkedList.task_manegment;

import java.util.LinkedList;

public class Visualisator {
    public static LinkedList<Task> tasks = new LinkedList<>();

    public static void main(String[] args) throws InterruptedException {
        tasks.add(new Task("Ali","Math"));
        tasks.add(new Task("Job","Manegment task"));
        tasks.add(new Task("Smith","IT system task"));
        tasks.add(new Task("Alice","Project"));
        tasks.add(new Task("Johnson","Student system"));

        System.out.println("Orginal list: ");
        printList();
        System.out.println();

        System.out.println("Updated list: ");
        tasks.removeIf(task -> task.name.equals("Smith"));
        tasks.addFirst(new Task("Charlie","Bank manager"));
       printList();


        while (!tasks.isEmpty()){
            for (Task taskss :tasks){
                System.out.println("Task list: " + taskss);
            }
            Task solved = tasks.remove(0);
            Thread.sleep(2000);
            System.out.println("Solved: " + solved);
            System.out.println();

            if(tasks.isEmpty()){
                System.out.println("All tasks solved!");
            }
        }

    }

    public static void printList(){
        for (Task task : tasks){
            System.out.println(task);
        }
        System.out.println();
    }
}
