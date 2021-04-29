package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null) {
            throw new IllegalArgumentException("Not valid phonebook inputs");
        }
        if (output == null) {
            throw new IllegalArgumentException("Not valid file where phonebook will be written");
        }

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            writeLines(writer, contacts);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private void writeLines(BufferedWriter writer, Map<String, String> contacts) throws IOException {

        List<String> lines = new ArrayList<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            lines.add(entry.getKey() + ": " + entry.getValue());
        }
        String result = String.join(", ", lines);
        writer.write(result);
    }
}
