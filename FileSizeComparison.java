import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import java.util.*;
public class FileStatistics
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String choice;
      Path file1 =
         Paths.get("/home/nt-user/workspace/example.txt");
      Path file2 =
         Paths.get("/home/nt-user/workspace/example2.txt");
      try
      {
         BasicFileAttributes attr1 =
            Files.readAttributes(file1, BasicFileAttributes.class);
         System.out.println("Enter file name >> ");
         choice = kb.nextLine();
         if(choice.equals("example.txt"))
         {
            System.out.println("File name is " + file1.getFileName());
            //folder name
            //path
            System.out.println("File's creation time is " + attr1.creationTime());
            System.out.println("File's size is " + attr1.size());
         }
         else
             System.out.println("File name is " + file2.getFileName());
            //folder name
            //path
            System.out.println("File's creation time is " + attr1.creationTime());
            System.out.println("File's size is " + attr1.size());
      }
      catch(IOException e)
      {
         System.out.println("IO Exception");
      }
   }
}
