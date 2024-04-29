public class Main {
    public static void main(String[] args) {

        Print_Result print = new Print_Result();
        Random_dice dice = new Random_dice();

        dice.work(print.print_scan());
    }
}