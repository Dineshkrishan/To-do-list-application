package list;

import javax.swing.*;
import java.awt.*;
public class task extends JPanel {
    private JLabel index;
    private JTextField taskname;
    private JButton done;
    private boolean checked;
    task(){
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(new Color(254,84,84));
        this.setLayout(new BorderLayout());
        checked = false;
        index=new JLabel(" ");
        this.setPreferredSize(new Dimension(20,20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);
        taskname = new JTextField(" ");
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(new Color(254,84,84));
        this.add(taskname,BorderLayout.CENTER);
        done = new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done,BorderLayout.EAST);
    }
    public JButton getDone() {
        return done;
    }
    public boolean getState(){
        return checked;
    }

    public void changeIndex(int num){
        this.index.setText( "   "  +num+"    ");
        this.revalidate();
    }
    public void changeState(){
        this.setBackground(new Color(84,244,100));
        taskname.setBackground(new Color(84,244,100));
        checked=true;
    }
}
