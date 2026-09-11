public class removespaces {
    public static void main(String[] args) {
        String s = "welcome to java";
        String result = s.replaceAll("\\s", "");
        System.out.println("String after removing spaces: " + result);
    }
    
}
