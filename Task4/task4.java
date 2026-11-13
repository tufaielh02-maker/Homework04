package Task4;

import java.io.File;
import java.util.Scanner;

public class task4 {
    public static long getSize(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long total = 0;
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                total += getSize(f);
            }
        }
        return total;
    }

    public static void printDirectorySizes(File dir, String indent) {
        long size = getSize(dir);
        System.out.println(indent + dir.getName() + " : " + size + " bytes");
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    printDirectorySizes(f, indent + "  ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String path = sc.nextLine();
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Error: Directory does not exist!");
            return;
        }
        long totalBytes = getSize(dir);
        double totalKB = totalBytes / 1024.0;
        double totalMB = totalKB / 1024.0;
        System.out.println("Total size: ");
        System.out.println(totalBytes + " bytes");
        System.out.println(totalKB + " KB");
        System.out.println(totalMB + " MB");
        System.out.println("\nAdditional Functionality - Each directory:");
        printDirectorySizes(dir, "");
    }
}