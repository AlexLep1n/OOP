import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RecorderToFileXml extends RecorderToFile {

    @Override
    public void recordFile(Map<String, Double> students) {
        try (FileWriter writer = new FileWriter("file.xml")) {
            writer.write("<?xml version=" + 1.0 + " encoding=" + '"' + "utf-" + 8 + '"' + " ?>\n");
            writer.write("<students>\n");
            for (Map.Entry<String, Double> entry : students.entrySet()) {
                writer.write("<student>\n");
                writer.write("<name>" + entry.getKey() + "</name>\n");
                writer.write("<grade>" + entry.getValue() + "</grade>\n");
                writer.write("</student>\n");
            }
            writer.write("</students>");
        } catch (IOException e) {
            e.getStackTrace();
        }

    }

}
