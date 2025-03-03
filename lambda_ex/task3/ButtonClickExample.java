package lambda_ex.task3;

import javax.swing.*;

public class ButtonClickExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me button");
        button.addActionListener(event -> System.out.println(event.getActionCommand()));

        frame.add(button);
        frame.setVisible(true);
    }
}
