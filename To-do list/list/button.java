package list;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class button extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyborder = BorderFactory.createEmptyBorder();
    button(){
        this.setPreferredSize(new Dimension(5000,70));
        this.setBackground(new Color(249,224,112));
        addTask = new JButton("Add Task");
        addTask.setBorder(emptyborder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(addTask);
        this.add(Box.createHorizontalStrut(40));
        clear = new JButton("Clear Completed task");
        clear.setBorder(emptyborder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);
        
    }
    public JButton getAddTask() {
        return addTask;
    }
    public JButton getClear() {
        return clear;
    }
}
