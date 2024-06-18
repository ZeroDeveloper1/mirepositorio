import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("HOla mundo de Franklin Bermeo");
        //En esta linea encontramos la la tabulacion con la linea de comando \T1\\
        System.out.println("\t1\t2\t3");
        System.out.println("\t50\t60\t80");
        System.out.println("\t100\t200\t300");
        //aqui elimina los caracteres que estan a la izquierda de lo que utilizamos\\
        System.out.println("Hello\b\b world");
        // elimina loq ue encontramos antes de de \r y visualiza unicamente lo que encontramos despues\\
        System.out.println("gretting\r world");
        //clase1
        matriz_car();
        //clase2

        matrizcadena();
        //clase2

        cadena3();
        cadena4();
    }
    //CLASE 1
    public static void matriz_car(){
        System.out.println("Ingrese los caracteres");
    Scanner console = new Scanner(System.in);
    String path = console.nextLine();
        System.out.println("Buscamos caracteres /");

    char[] chars = path.toCharArray();
    for (int i = 0;i < chars.length; i++ )
        if (chars[i] == '/')
            chars[i] = '\\';
    String result = new String(chars);

        System.out.println(result);{

        }
    }
    public static void matrizcadena(){
        System.out.println("Ingrese un caracter");
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        String [] array = path.split("/");
        String result = String.join("\\");
        System.out.println(result);
    }
    public static void cadena3 (){
        System.out.println("ingrese un 3 caracter");
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        String result = path.replace("/","\\");
        System.out.println(result);
    }
    public static void cadena4 (){
        System.out.println("Indentifica la ruta del archivo y su extension");
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        if (path.endsWith(".jpg") || path.endsWith(".jpeg"))
        {
            System.out.println("This is a jpeg!");
        }
        else if (path.endsWith(".htm") || path.endsWith(".html"))
        {
            System.out.println("This is an HTML page");
        }
        else if (path.endsWith(".doc") || path.endsWith(".docx"))
        {
            System.out.println("This is a Word document");
        }
        else
        {
            System.out.println("Unknown format");
        }

    }
}
