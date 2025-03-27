package list;

import javax.swing.*;
import java.awt.*;

public class list extends JPanel {
    list() {
        GridLayout lout = new GridLayout(10, 1);
        lout.setVgap(5);
        this.setLayout(lout);
        this.setBackground(new Color(249,224,112));
    }
    public void updatenum(){
        Component[] listitems = this.getComponents();
        for (int i = 0; i < listitems.length; i++) {
            if(listitems[i] instanceof task){
                ((task)listitems[i]).changeIndex(i+1);
            }
        }
    }
    public void removeCompletedtask(){
        for(Component c : getComponents()){
            if(c instanceof task)
            {
                if(((task)c).getState()){
                    remove(c);
                    updatenum();
                }
            }
        }
    }
}
