package java_hw_3;
import java.util.Scanner;

public class ProgramDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter program (idea, git, java): ");
        String program = scanner.nextLine();

        System.out.println("Enter OS (linux, macos, windows): ");
        String os = scanner.nextLine();

        String result = getLink(program, os);
        System.out.println(result);
    }
    public static String getLink(String program, String os) {
        switch (program) {
            case "idea":
                switch (os) {
                    case "linux":
                        return "https://www.jetbrains.com/idea/download/?section=linux";
                    case "macos":
                        return "https://www.jetbrains.com/idea/download/?section=mac";
                    case "windows":
                        return "https://www.jetbrains.com/idea/download/?section=windows";
                    default:
                        return "This OS doesn't exist";
                }
            case "git":
                switch (os) {
                    case "linux":
                        return "https://git-scm.com/install/linux";
                    case "macos":
                        return "https://git-scm.com/install/mac";
                    case "windows":
                        return "https://git-scm.com/install/windows";
                    default:
                        return "This OS doesn't exist";
                }
            case "java":
                switch (os) {
                    case "linux":
                        return "https://www.oracle.com/ua/java/technologies/downloads/#jdk26-linux";
                    case "macos":
                        return "https://www.oracle.com/ua/java/technologies/downloads/#jdk26-mac";
                    case "windows":
                        return "https://www.oracle.com/ua/java/technologies/downloads/#jdk26-windows";
                    default:
                        return "This OS doesn't exist";
                }
            default:
                return "This program doesn't exist";
        }
    }
}
