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
public interface TaskItem {

    public TaskItem getParent();

    public String getDetails();

    public ArrayList getProjectItems();

    public ArrayList getSubTask();
}
