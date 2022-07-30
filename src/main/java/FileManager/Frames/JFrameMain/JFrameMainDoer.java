package FileManager.Frames.JFrameMain;

import FileManager.Frames.JFrameAdd.JFrameAdd;
import FileManager.Main;

import javax.swing.*;

public class JFrameMainDoer {
    public void mainDropdown(JMenuItem jMenuItem) {
        if (jMenuItem.getText().equals("Neuer eintrag")) {
            newEntry(jMenuItem);
            return;
        }
    }

    private void newEntry(JMenuItem item) {
        new JFrameAdd();
    }
}
