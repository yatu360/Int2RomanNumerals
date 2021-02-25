import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Extension implements ActionListener {

    protected static JTextField userText;
    protected static JLabel success;


    public Extension(){

        JFrame frame = new JFrame();
        frame.setSize(100,100);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 5));

;
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel userLabel = new JLabel("Enter Number");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        JButton button = new JButton("Convert");

        panel.add(button);

        button.addActionListener(this);
        success = new JLabel("");
        success.setBounds(25, 110, 300, 25);
        panel.add(success);


        frame.setTitle("Simple Number to Roman Converter");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {


        new Extension();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String input = userText.getText();
        int IntInput = Integer.parseInt(input);
        Roman a = new Roman();
        String output = a.convert(IntInput);
        success.setText("Roman Number is: "+output);
    }
}
