import java.io.File;
import java.util.Scanner;
public class LsSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();

        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File f : files) {
                    String type = f.isDirectory() ? "< DIR >" : "< FILE >";

                    String r = f.canRead() ? "r" : "-";
                    String w = f.canWrite() ? "w" : "-";
                    String h = f.isHidden() ? "h" : "-";

                    System.out.printf("%s %s %s%s%s%n", f.getAbsolutePath(), type, r, w, h);
                }
            }
        } else {
            System.out.println("Invalid path or directory does not exist.");
        }
    }
}
