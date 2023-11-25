import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationForm extends JFrame
{
    private JTextField phoneNoTextField;
    private JComboBox<String> courseComboBox;
    private JButton okButton;

    public InformationForm()
    {
        setTitle("Information Form");

        setLayout(new java.awt.FlowLayout());

        JLabel label = new JLabel("Please enter your phone no, select preferred course and click on OK. Shortly we will contact with you.");
        add(label);

        phoneNoTextField = new JTextField(15);
        add(phoneNoTextField);

        String[] courseOptions = {"HNDIT", "HNDA", "HNDM"};
        courseComboBox = new JComboBox<>(courseOptions);
        add(courseComboBox);

        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
        add(okButton);

        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of InformationForm
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InformationForm();
            }
        });
    }
}
