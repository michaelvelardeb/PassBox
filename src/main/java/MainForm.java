import javax.swing.*;
import java.awt.event.*;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JTextField searchBox;
    private JTextArea suggestionArea;
    private JButton searchButton;
    private JButton addNewButton;

    public MainForm () {

        rootPanel = new JPanel();
        searchBox = new JTextField("Enter text to search",25);
        suggestionArea = new JTextArea(35, 40);
        searchBox.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                if(searchBox.getText().equals("Enter text to search")) {
                    searchBox.setText("");
                }
            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
        searchBox.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if(searchBox.getText().equals("Enter text to search"))
                searchBox.setText("");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        addNewButton.setSize(40, 40);
        addNewButton = new JButton("Add New Password");
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                addPasswordForm passwordForm = new addPasswordForm();
                textForm passwordForm = new textForm();
                passwordForm.setVisible(true);

            }
        });

        rootPanel.add(searchBox);
        searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                suggestionArea.append(searchBox.getText());
            }
        });
        rootPanel.add(searchButton);
        rootPanel.add(addNewButton);
        rootPanel.add(suggestionArea);
        this.pack();
        add(rootPanel);
        setTitle("PassBox Yo");
        setSize(370, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
