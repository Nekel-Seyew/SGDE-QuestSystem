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
public class Branch {
    private ArrayList<QuestEvent> tasks;
    int place;
    int branchNum;
    
    public Branch(int branchNum){
        place=0;
        this.branchNum=branchNum;
        tasks=new ArrayList<>();
    }
    public Branch(){
        place=0;
    }
    
    /**
     * This will prioritize Branch A's tasks over Branch B's tasks
     * @param A
     * @param B
     * @return 
     */
    public static Branch merge(Branch A, Branch B){
        ArrayList<QuestEvent> newTasks=new ArrayList<>();
        for(int i=A.place; i<A.tasks.size(); i++){
            newTasks.add(A.tasks.get(i));
        }
        for(int i=B.place; i<B.tasks.size(); i++){
            newTasks.add(B.tasks.get(i));
        }
        
        Branch b=new Branch();
        b.tasks=newTasks;
        return b;
    }
}
