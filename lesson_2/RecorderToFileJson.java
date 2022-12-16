import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RecorderToFileJson extends RecorderToFile {

    @Override
    public void recordFile(Map<String, Double> students) {
        try (FileWriter writer = new FileWriter("file.json")) {
            writer.write("{\n");
            int count = 0;
            for (Map.Entry<String, Double> entry : students.entrySet()) {
                count++;
                if (count < 3) {
                    writer.write('"' + entry.getKey() + '"' + ": " + entry.getValue() + ",\n");
                } else {
                    writer.write('"' + entry.getKey() + '"' + ": " + entry.getValue() + "\n");
                }
            }
            writer.write("}");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
