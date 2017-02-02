/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.behavioral.chainofresponsibility;

import java.util.Iterator;

/**
 *
 * @author dotrungduchd
 */
public class RunPattern {

    public static void main(String[] arguments) {
        Project project = new Project("Project 01", "Detail of Project 01");
        detailInfor(project);
        project = new Project("Project 01", "Detail of Project 01");
        detailInfor(project);
    }

    private static void detailInfor(TaskItem item) {
        System.out.println("TaskItem: " + item.toString());
        System.out.println(" Details: " + item.getDetails());
        System.out.println();
        if (item.getSubTask() != null) {
            Iterator subElements = item.getSubTask().iterator();
            while (subElements.hasNext()) {
                detailInfor((TaskItem) subElements.next());
            }
        }
    }
}
