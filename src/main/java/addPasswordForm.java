import javax.swing.*;

public class addPasswordForm extends JFrame{
    private JPanel panel1;
    private JTextField nameInput;
    private JTextField passwordInput;
    private JTextField securityAnswerInput;
    private JTextField HyperLinkInput;
    private JTextField CategoryInput;
    private JTextArea NotesTextArea;
    private JButton saveButton;
    private JLabel nameLabel;
    private JLabel passwordLabel;
    private JLabel securityLabel;
    private JLabel hyperLinkLabel;
    private JLabel CategoryLabel;
    private JLabel NotesLabel;

    public addPasswordForm() {

        panel1 = new JPanel();
        nameInput = new JTextField("Enter Name for Entry", 30);
        passwordInput = new JTextField("Enter Password", 30);
        securityAnswerInput = new JTextField("Enter Answer to Security question", 30);
        HyperLinkInput = new JTextField("Enter HyperLink", 30);
        CategoryInput = new JTextField("Enter Category", 30);
        NotesTextArea = new JTextArea("Ente additional Notes here", 30, 30);
        saveButton = new JButton("Save");
        nameLabel = new JLabel("Name");
        passwordLabel = new JLabel("Password");
        securityLabel = new JLabel("Security Answer");
        hyperLinkLabel = new JLabel("HyperLink");
        CategoryLabel = new JLabel("Category");
        NotesLabel = new JLabel("Notes");

        panel1.add(nameInput);
        panel1.add(nameLabel);
        panel1.add(passwordInput);
        panel1.add(passwordLabel);
        panel1.add(securityAnswerInput);
        panel1.add(securityLabel);
        panel1.add(HyperLinkInput);
        panel1.add(hyperLinkLabel);
        panel1.add(CategoryInput);
        panel1.add(CategoryLabel);
        panel1.add(NotesTextArea);
        panel1.add(NotesLabel);
        panel1.add(saveButton);

        this.pack();
        this.add(panel1);
        setTitle("Add Password");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

