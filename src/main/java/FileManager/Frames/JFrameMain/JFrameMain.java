package FileManager.Frames.JFrameMain;

import FileManager.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

public class JFrameMain implements ActionListener {

    private JFrame jFrame;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newEntry;

    public JFrameMain() {
        jFrame = new JFrame();
        jFrame.setTitle("File Manager - Main");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        menuBar();
    }

    private void menuBar() {
        menuBar = new JMenuBar();

        fileMenu = new JMenu("Datei");
        fileMenu.setMnemonic(KeyEvent.VK_D);

        newEntry = new JMenuItem("Neuer eintrag");
        ImageIcon newEntryIcon = new ImageIcon("src/main/resources/new.gif");
        newEntry.setIcon(newEntryIcon);
        newEntry.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newEntry.addActionListener(this);

        fileMenu.add(newEntry);

        menuBar.add(fileMenu);

        jFrame.setJMenuBar(menuBar);
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JMenuItem) {
            System.out.println("sssss");
            Main.getInstance().getjFrameMainDoer().mainDropdown((JMenuItem) e.getSource());
        }
    }
}
