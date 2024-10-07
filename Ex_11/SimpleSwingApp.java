import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleSwingApp extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button;

    public SimpleSwingApp() {
        // Create a text field
        textField = new JTextField(20);
        // Create a button
        button = new JButton("Click Me");

        // Set layout for the frame
        setLayout(new FlowLayout());

        // Add components to the frame
        add(textField);
        add(button);

        // Register button click event
        button.addActionListener(this);

        // Set up the frame
        setTitle("Simple Swing App");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Set the text in the text field when the button is clicked
        textField.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        // Create the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(SimpleSwingApp::new);
    }
}
