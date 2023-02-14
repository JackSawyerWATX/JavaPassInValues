public class Main {
    public static void main(String[] args) {
        //%d is for integers
        //%s is for Strings
        //%f is for floats
        String data = "%d %s costs $%f.";

        int quantity = 5;
        String item = "Snickers";
        double price = 1.52;

        System.out.printf(data, quantity, item, (price*quantity));
    }
}