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
public class Task implements TaskItem {

    private String name;
    private ArrayList subtask = new ArrayList();
    private String details;
    private TaskItem parent;
    private String EOL_STRING = "\n";
    private boolean primaryTask = false;

    public Task(TaskItem newParent) {
        this(newParent, "", "");
    }

    public Task(TaskItem newParent, String newName, String newDetails) {
        parent = newParent;
        name = newName;
        details = newDetails;
    }

    public String getDetails() {
        if (primaryTask) {
            return details;
        } else {
            return parent.getDetails() + EOL_STRING + "\t" + details;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList getSubTask() {
        return subtask;
    }

    public TaskItem getParent() {
        return parent;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setParent(TaskItem newParent) {
        parent = newParent;
    }

    public void setDetails(String newDetails) {
        details = newDetails;
    }

    public void addSubTask(TaskItem element) {
        if (!subtask.contains(element)) {
            subtask.add(element);
        }
    }

    public void removeSubTask(TaskItem element) {
        subtask.remove(element);
    }

    @Override
    public ArrayList getProjectItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
