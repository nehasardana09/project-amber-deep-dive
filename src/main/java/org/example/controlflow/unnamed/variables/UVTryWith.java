import java.io.FileReader;
import java.io.IOException;

void doesFileExist(String path) {
    try (var _ = new FileReader(path)) {
        // Do nothing
        System.out.println("I just want to read a file but i dont have a file object with me");
    } catch (IOException _) {
        System.out.println("File not found: "+ path);
    }
}

public void main() {
    doesFileExist("//sardaneh/filedoes not exist");
}
