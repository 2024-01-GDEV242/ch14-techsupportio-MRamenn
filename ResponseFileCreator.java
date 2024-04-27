import java.io.FileWriter;
import java.io.IOException;

public class ResponseFileCreator {
    public void createResponseFile() {
        try {
            FileWriter writer = new FileWriter("responses.txt");
            writer.write("crash, crashes\n");
            writer.write("Well, it never crashes on our system. It must have something\n");
            writer.write("to do with your system. Tell me more about your configuration.\n\n");
            writer.write("slow\n");
            writer.write("I think this has to do with your hardware. Upgrading your processor\n");
            writer.write("should solve all performance problems. Have you got a problem with\n");
            writer.write("our software?\n");
            writer.close();
            System.out.println("responses.txt file created successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ResponseFileCreator creator = new ResponseFileCreator();
        creator.createResponseFile();
    }
}
