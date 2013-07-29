/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Quest;

import java.util.ArrayList;

/**
 *
 * @author kdsweenx
 */
public abstract class Quest {
    public static final int LEVEL_1 =1;
    public static final int LEVEL_2 =2;
    public static final int LEVEL_3 =3;
    public static final int LEVEL_4 =4;
    public static final int LEVEL_5 =5;
    
    private int priorityLevel;
    private String name;
    private ArrayList<QuestEvent> tasks;
    private ArrayList<Branch> branches;
    int place;
    int numOfBranches;
    
    public Quest(int PriorityLevel, String name){
        this.priorityLevel=PriorityLevel;
        this.name=new String(name);
        tasks= new ArrayList<QuestEvent>();
        place=0;
        construct();
    }
    
    public abstract void construct();
    
    public boolean isDone(){
        return place>=tasks.size();
    }
    
    public void Update(){
        if(tasks.get(place).isDone()){
            place++;
        }
        
        tasks.get(place).Update();
    }
    
    public QuestEvent getCurrentEvent(){
        return tasks.get(place);
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public String getName() {
        return name;
    }
    
    public void createBranch(){
        
    }
    
    public void mergeBranch(int i, int j){
        Branch newBranch=Branch.merge(branches.get(i), branches.get(j));
    }
}
