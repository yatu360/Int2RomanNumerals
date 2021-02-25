import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Extension implements ActionListener {

    protected static JTextField userText;


    public Extension(){

        JFrame frame = new JFrame();
        frame.setSize(100,100);


        //button.add

        JLabel label = new JLabel("Number of clicks:0 ");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 5));

;
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        JButton button = new JButton("Click me");

        panel.add(button);
        panel.add(label);
        button.addActionListener(this);
        JLabel success = new JLabel("");
        success.setBounds(10, 110, 300, 25);


        frame.setTitle("Test");
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
        System.out.println(output);
    }
}
