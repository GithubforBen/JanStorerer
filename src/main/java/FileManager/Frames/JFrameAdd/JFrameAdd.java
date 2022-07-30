package FileManager.Frames.JFrameAdd;

import javax.swing.*;

public class JFrameAdd {

    private JFrame jFrameAdd;

    public JFrameAdd() {
        jFrameAdd = new JFrame("Füge eine sache hinzu");

        doIt();
        jFrameAdd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jFrameAdd.setSize(400, 600);
        jFrameAdd.setLocationRelativeTo(null);
        jFrameAdd.setVisible(true);
    }

    private void doIt() {
        jFrameAdd.add(createJTextField(10));
    }

    private JTextField createJTextField(int numberOfLettersWith) {
        JTextField jTextField = new JTextField(numberOfLettersWith);


        jTextField.setVisible(true);
        return jTextField;
    }
}
