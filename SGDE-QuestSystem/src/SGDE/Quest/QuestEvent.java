/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SGDE.Quest;

/**
 *
 * @author kdsweenx
 */
public abstract class QuestEvent {
    private String name;
    private String desc;
    
    public QuestEvent(String name, String desc){
        this.name=new String(name);
        this.desc=new String(desc);
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    
    public abstract boolean isDone();
    public abstract void Update();
}
