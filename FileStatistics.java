import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String defaultPath = "/home/nt-user/workspace/";
        System.out.print("Enter file name >> ");
        String fileName = scanner.nextLine();

        String fullPath = defaultPath + fileName;
        try {
            Path filePath = Paths.get(fullPath);
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("Path is " + filePath);
            System.out.println("File name is " + filePath.getFileName());
            System.out.println("Folder name is " + filePath.getParent().getFileName());
            System.out.println("File's size is " + attr.size());
            System.out.println("File's creation time is " + attr.creationTime());

        } catch (IOException error)
        {
            System.out.println("IO Exception: " + error.getMessage());
        }
        }
    }
