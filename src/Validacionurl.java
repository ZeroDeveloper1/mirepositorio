public class Validacionurl {

public static void main(String[] args) {
    String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
    for (String url : urls){
        String protocol = checkProtocol(url);
        String domainExtension = checkDomaininExtension(url);
        System.out.println("URL adrress: "+ url + ", network protocol -" + protocol + ", domain extension - " + domainExtension);

    }
}
public static String checkProtocol(String url) {
    if (url.startsWith("https")) {
        return "https";
    } else if (url.startsWith("http")) {
        return "http";
    } else {
        return "desconocido";
    }
}
public static String checkDomaininExtension(String url){
    if (url.startsWith("com")){
    return "com";
    } else if (url.endsWith("net")) {
        return "net";
    } else if (url.endsWith("org")){
        return "org";
    } else if (url.endsWith("us")) {
        return "us";
    }else {
        return "desconocido";

    }
    }
}
