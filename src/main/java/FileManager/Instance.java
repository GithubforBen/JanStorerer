package FileManager;

import FileManager.Frames.JFrameMain.JFrameMain;
import FileManager.Frames.JFrameMain.JFrameMainDoer;
import FileManager.Logs.Logging;
import FileManager.Logs.Priority.GenPriority;
import FileManager.Logs.saveLogs.SaveLogs;

public class Instance {

    private Logging logging;
    private SaveLogs saveLogs;
    private GenPriority genPriority;
    private JFrameMain jFrameMain;
    private JFrameMainDoer jFrameMainDoer;

    public Instance() {
        logging = new Logging();
        saveLogs = new SaveLogs();
        genPriority = new GenPriority();
        jFrameMain = new JFrameMain();
        jFrameMainDoer = new JFrameMainDoer();
    }

    public Logging getLogging() {
        return logging;
    }

    public SaveLogs getSaveLogs() {
        return saveLogs;
    }

    public GenPriority getGenPriority() {
        return genPriority;
    }

    public JFrameMain getjFrameMain() {
        return jFrameMain;
    }

    public JFrameMainDoer getjFrameMainDoer() {
        return jFrameMainDoer;
    }
}
