package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Task task1 = new Task("Java Collections", "Write List Interface",
                "Ann", Status.IN_QUEUE, Priority.LOW);
        Task task2 = new Task("Java Collections", "Write Set Interface",
                "Ann", Status.ASSIGNED, Priority.MED);
        Task task3 = new Task("Java Collections", "Write Map Interface",
                "Bob", Status.IN_QUEUE, Priority.HIGH);

        Task task4 =new Task("unassigned","Java Collection","Write something",Status.IN_QUEUE,Priority.LOW);

        Set<Task> taskSet1 = new HashSet<>();
        taskSet1.add(task1);
      //  taskSet1.add(task2);

        Set<Task> taskSet2 = new HashSet<>();
        taskSet2.add(task3);

        Set<Task> taskSet3 = new HashSet<>(); // This set is empty as there are no tasks for Carol

        Set<Task> unassigned = new HashSet<>();
        unassigned.add(task4);

        TaskData taskData = new TaskData(taskSet1, taskSet2, taskSet3, unassigned);

        Set<Task> anns=taskData.getTasks("ann");
        Set<Task> bobs=taskData.getTasks("bob");
        System.out.println("***********************************************");
        System.out.println(anns);
        System.out.println("***********************************************");
        System.out.println(bobs);
        System.out.println("***********************************************");
        System.out.println(taskData.getUnion(anns,bobs ));

        StringSet.findUniqueWords();


    }
}
