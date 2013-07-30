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
    private ArrayList<Branch> child;
    int place; 
    QuestEvent parent;
    boolean done;
    
    public Branch( QuestEvent parent){
        place=0;
        tasks=new ArrayList<>();
        child=new ArrayList<>();
        this.parent=parent;
    }
    public Branch(){
        place=0;
    }
    
    public void branchOff(QuestEvent task){
        tasks.add(task);
        child.add(new Branch(task));
    }
    
    public void add(QuestEvent e){
        tasks.add(e);
    }
    
    public Branch getChild(int i){
        if(i>=child.size()){
            return null;
        }else{
            return child.get(i);
        }
    }
    
    public void Update(){
        try{
            if(tasks.get(place).isDone()){
                place++;
            }
            tasks.get(place).Update();
        }catch(IndexOutOfBoundsException e){
            done=true;
        }
    }
    
    public boolean isDone(){
        return done;
    }
    
    private void downTheRabbitHoleUpdate(){
        
    }
    
}
