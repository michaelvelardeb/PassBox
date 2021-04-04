import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textForm extends JFrame {

    private JPanel formPanel;
    private JTextField nameTextField;
    private JLabel nameLabel;
    private JTextField passwordField;
    private JLabel passwordLabel;
    private JTextField securityField;
    private JLabel securityQuestionLabel;
    private JTextField securityAnswerField;
    private JLabel securityAnswerLabel;
    private JTextField categoryField;
    private JTextField hyperLinkField;
    private JTextArea notesArea;
    private JLabel notesLabel;
    private JButton saveButton;
    private JTextField userName;
    private JLabel userLabel;

    public textForm() {

        this.add(formPanel);
        this.setSize(450, 400);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Password passwordElement = new Password();
                passwordElement.setTitle(nameTextField.getText());
                passwordElement.setUserName(userName.getText());
                passwordElement.setPassword(passwordField.getText());
                passwordElement.setCategory(categoryField.getText());
                passwordElement.setSecurityAnswer(securityAnswerField.getText());
                passwordElement.setSecurityQuestion(securityField.getText());
                passwordElement.setHyperLink(hyperLinkField.getText());

                notesArea.append(passwordElement.title+  "\n");
                notesArea.append(passwordElement.password + "\n");
                notesArea.append(passwordElement.category + "\n");
                notesArea.append(passwordElement.securityQuestion + "\n");
                notesArea.append(passwordElement.securityAnswer + "\n");
                notesArea.append(passwordElement.hyperLink + "\n");

                textForm.super.dispose();


            }
        });

    }
}
