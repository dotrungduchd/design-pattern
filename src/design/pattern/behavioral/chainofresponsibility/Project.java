/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.behavioral.chainofresponsibility;

import java.util.ArrayList;

/**
 *
 * @author dotrungduchd
 */
public class Project implements TaskItem {

    private String name;
    private String details;
    private ArrayList subtask = new ArrayList();

    public Project() {
    }

    public Project(String newName, String newDetails) {
        name = newName;
        details = newDetails;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return name + ":\t" + details;
    }

    public TaskItem getParent() {
        return null;
    }

    public ArrayList getSubTask() {
        return subtask;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDetails(String newDetails) {
        details = newDetails;
    }

    public void addTask(TaskItem element) {
        if (!subtask.contains(element)) {
            subtask.add(element);
        }
    }

    public void removeProjectItem(TaskItem element) {
        subtask.remove(element);
    }

    @Override
    public ArrayList getProjectItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
