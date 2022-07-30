package FileManager;

public class Main {
    private static Instance instance;

    public static void main(String[] args) {
        instance = new Instance();
    }

    public static Instance getInstance() {
        return instance;
    }
}
