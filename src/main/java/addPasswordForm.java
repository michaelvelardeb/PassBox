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
        NotesTextArea = new JTextArea("Ente additional Notes here", 10, 35);
        saveButton = new JButton("Save");
        nameLabel = new JLabel("Name", 10);
        passwordLabel = new JLabel("Password", 10);
        securityLabel = new JLabel("Security Answer", 10);
        hyperLinkLabel = new JLabel("HyperLink", 10);
        CategoryLabel = new JLabel("Category", 10);
        NotesLabel = new JLabel("Notes", 10);

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
        saveButton.setAlignmentX(1000);
        panel1.add(saveButton);


        this.add(panel1);

//        this.pack();
        setTitle("Add Password");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

