package lambda_ex.task9;


import javax.swing.*;
import java.awt.*;

public class Interactions {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // first task
        JButton button = new JButton("Click me button");
        button.addActionListener(event -> System.out.println(event.getActionCommand()));
        frame.add(button);

        // second task
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem item1 = new JMenuItem("Save");
        JMenuItem item2 = new JMenuItem("Edit");

        item1.addActionListener(event -> System.out.println("Menu item selected: " + item1.getText()));
        item2.addActionListener(event -> System.out.println("Menu item selected: " + item2.getText()));

        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // third task
        JLabel sliderLabel = new JLabel("Slider value: 50");
        JSlider slider = new JSlider(0, 100, 50);
        slider.addChangeListener(event -> sliderLabel.setText("Slider value: " + slider.getValue()));
        frame.add(slider);
        frame.add(sliderLabel);

        // fourth task
        JLabel nameLabel = new JLabel("Name:");
        JTextField textField = new JTextField(10);
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(event -> {
            String name = textField.getText();
            if (name.isEmpty()) {
                System.out.println("Validation Fail: Name field is empty");
            } else {
                System.out.println("Validation Pass: Name - " + name);
            }
        });

        frame.add(nameLabel);
        frame.add(textField);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
