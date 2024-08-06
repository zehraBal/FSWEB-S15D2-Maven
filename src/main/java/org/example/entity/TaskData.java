package org.example.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks =new HashSet<>();
    private Set<Task> bobsTasks=new HashSet<>();
    private Set<Task> carolsTasks=new HashSet<>();
    private Set<Task> unassignedTasks=new HashSet<>();

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getUnion(Set<Task> task1, Set<Task> task2){
        Set<Task> allTasks=new HashSet<>(task1);
   ;    allTasks.addAll(task2);
        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2){
        Set<Task> intersect=new HashSet<>(task1);
        intersect.retainAll(task2);
        return intersect;

    }

    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2){
        Set<Task> differ =new HashSet<>(task1);
        differ.removeAll(task2);
        return differ;
    }

    public Set<Task> getAllTasks(){
        Set<Task> allTask=new HashSet<>();
        allTask.addAll(annsTasks);
        allTask.addAll(bobsTasks);
        allTask.addAll(carolsTasks);
        allTask.addAll(unassignedTasks);
        return allTask;
    }

    public Set<Task> getTasks(String name){
        return switch (name) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            case "all" -> getAllTasks();
            default -> null;
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskData taskData = (TaskData) o;
        return Objects.equals(annsTasks, taskData.annsTasks) && Objects.equals(bobsTasks, taskData.bobsTasks) && Objects.equals(carolsTasks, taskData.carolsTasks) && Objects.equals(unassignedTasks, taskData.unassignedTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
    }


    @Override
    public String toString() {
        return "TaskData{" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolsTasks=" + carolsTasks +
                ", unassignedTasks=" + unassignedTasks +
                '}';
    }
}
