public class Main {

    public static void main(String[] args) {
        // demonstrates StringBuilder class
        StringBuilder sb = new StringBuilder();
        sb.append("sever la odnalbah");
        String forward = sb.toString();
        String reverse = sb.reverse().toString();

        System.out.println(reverse);
    }
}