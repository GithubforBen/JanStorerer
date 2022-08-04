package FileManager.Frames.JFrameAdd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;

public class JFrameAdd {

    private JFrame jFrameAdd;
    private JPanel namePanel;
    private JTextField jTextFieldName;
    private JButton openFileButton, bestätigen;
    private JFileChooser chooser;

    public JFrameAdd() {
        jFrameAdd = new JFrame("Füge eine sache hinzu");
        namePanel = new JPanel();

        doIt();
        jFrameAdd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jFrameAdd.setSize(400, 600);
        jFrameAdd.setLocationRelativeTo(null);
        jFrameAdd.setVisible(true);
    }

    private void doIt() {
        name();
        description();
        getData();
        best();
    }

    private void best() {
        bestätigen = new JButton();

        bestätigen.setText("OK");
        bestätigen.setIcon(new ImageIcon("src/main/resources/new.gif"));

        namePanel.add(bestätigen);

        bestätigen.setVisible(true);
    }

    private void getData() {
        openFileButton = new JButton();
        openFileButton.setText("Öffnen");
        openFileButton.setPreferredSize(new Dimension(265, 30));

        openFileButton.setVisible(true);

        namePanel.add(openFileButton);

        openFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser();
            }
        });

        openFileButton.setVisible(true);
    }

    private void fileChooser() {
        chooser = new JFileChooser();

        int rueckWert = chooser.showOpenDialog(jFrameAdd);

        if (rueckWert == JFileChooser.APPROVE_OPTION) {
            System.out.println(chooser.getSelectedFile().getName());
            openFileButton.setText("Ändern(" + chooser.getSelectedFile().getName() + ")");
        }
    }

    private void name() {
        namePanel.setLayout(new FlowLayout());
        namePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        jTextFieldName = createJTextField(10,"Bitte name eingeben", true);

        namePanel.add(jTextFieldName);
        namePanel.setVisible(true);

        jFrameAdd.add(namePanel, BorderLayout.CENTER);
    }

    private void description() {
        namePanel.setLayout(new FlowLayout());
        namePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        jTextFieldName = createJTextField(22,"Bitte beschreibung Eingeben", false);

        namePanel.add(jTextFieldName);
        namePanel.setVisible(true);

        jFrameAdd.add(namePanel, BorderLayout.CENTER);
    }

    private JTextField createJTextField(int numberOfLettersWith, String tipp, boolean bold) {
        JTextField jTextField = new JTextField(numberOfLettersWith);
        if (bold) {
            jTextField.setFont(new Font("Arial", Font.BOLD, 24));
        }else {
            jTextField.setFont(new Font("Arial", Font.PLAIN, 12));
        }
        jTextField.setToolTipText(tipp);
        jTextField.setMargin(new Insets(5,10,5,10));

        jTextField.setVisible(true);
        return jTextField;
    }
}
