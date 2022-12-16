import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RecorderToFileTxt extends RecorderToFile {

    @Override
    public void recordFile(Map<String, Double> students) {

        try (FileWriter writer = new FileWriter("file.txt")) {
            for (Map.Entry<String, Double> entry : students.entrySet()) {
                writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.getStackTrace();
        }

    }

}
