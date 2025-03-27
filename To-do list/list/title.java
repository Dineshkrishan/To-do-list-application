package list;


import javax.swing.*;
import java.awt.*;
public class title extends JPanel {
    public title() {
        this.setPreferredSize(new Dimension(400, 100));
        this.setBackground(new Color(249,224,112));
        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(100,90));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
        this.add(titleText);
    }
}
