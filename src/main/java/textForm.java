import javax.swing.*;

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

    public textForm() {

        this.add(formPanel);

        this.setSize(450, 400);

    }
}
