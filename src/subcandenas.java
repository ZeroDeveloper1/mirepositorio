
import java.util.Scanner;
public class subcandenas {
    public static String procesadorURL() {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese la barras");
        String path = console.nextLine();

        int index = path.indexOf("//");
        int index2 = path.indexOf("/", index + 2);

        String first = path.substring(0,index + 2);
        String last = path.substring(index);
        String result = first + "codegym.cc" + last;
        return result;
}
}