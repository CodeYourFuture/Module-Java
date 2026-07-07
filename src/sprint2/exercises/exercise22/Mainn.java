class FileLogger {
    private boolean fileOpen = false;
    public void openFile() {
        if (fileOpen) {
            throw new IllegalStateException("File already open");
        }
        System.out.println("Opening log file...");
        fileOpen = true;
    }
    public void writeLine(String line) {
        if (!fileOpen) {
            throw new IllegalStateException("Cannot write - file not open");
        }
        System.out.println("LOG: " + line);
    }
    public void closeFile() {
        if (!fileOpen) {
            throw new IllegalStateException("File already closed");
        }
        System.out.println("Closing log file...");
        fileOpen = false;
    }
}
class ApplicationLogger {
    private FileLogger logger = new FileLogger();
    public void logInfo(String message) {
        logger.openFile();
        logger.writeLine("[INFO] " + message);
        logger.closeFile();
    }
    public void logError(String message) {
        logger.openFile();
        logger.writeLine("[ERROR] " + message);
        logger.closeFile();
    }
}

public class Mainn {
    public static void main(String[] args) {

        FileLogger fileLogger = new FileLogger();
        fileLogger.openFile();
        fileLogger.writeLine("Application started");
        fileLogger.closeFile();

        ApplicationLogger appLogger = new ApplicationLogger();
        appLogger.logInfo("Application started");
        appLogger.logError("Database connection failed");
    }
}