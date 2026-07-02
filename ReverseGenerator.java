public class Main {

    public static void main(String[] args) {
        // demonstrates StringBuilder class
        StringBuilder sb = new StringBuilder();
        sb.append("Text");
        String forward = sb.toString();
        String reverse = sb.reverse().toString();

        System.out.println(reverse);
    }
}
