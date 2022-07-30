package FileManager.Logs;

import FileManager.Logs.Priority.Priority;

import java.util.Date;

public interface Log {
    //the date when the log was sent
    public Date date();
    //the content of the Log
    public String message();
    //the priority of the log
    public Priority priority();
    //the full String
    public String fullString();
}
