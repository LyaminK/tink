package backend;
import java.util.Scanner;
public class App {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ссылку: ");
        String URL = sc.nextLine();
        BackLinkParser linkParser = new BackLinkParser(URL);
        System.out.println(linkParser.getData());
    }
}
