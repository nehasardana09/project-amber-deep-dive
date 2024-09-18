import java.io.FileReader;
import java.io.IOException;

void doesFileExist(String path) {
    try (var _ = new FileReader(path)) {
        // Do nothing
    } catch (IOException _) {
        System.out.println(STR."File not found: \{path}");
    }
}

public void main() {
    doesFileExist("//sardaneh/filedoes not exist");
}
