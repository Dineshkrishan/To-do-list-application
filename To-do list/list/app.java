package list;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class app extends JFrame {
    private title tile;
    private list lst;
    private button btn;
    private JButton addTask;
    private JButton clear;

    app(){
        tile = new title();
        lst = new list();
        btn = new button();

        this.setSize(400,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(tile,BorderLayout.NORTH);
        this.add(btn,BorderLayout.SOUTH);
        this.add(lst,BorderLayout.CENTER);

        addTask = btn.getAddTask();
        clear = btn.getClear();

        addListeners();


    }
    public void addListeners(){
        addTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                task tsk = new task();
                lst.add(tsk);
                lst.updatenum();

                tsk.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        tsk.changeState();
                        revalidate();
                    }
                });
                revalidate();
            }
        });
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lst.removeCompletedtask();
                repaint();
            }
        });
    }
}
