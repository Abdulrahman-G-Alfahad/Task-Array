//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] temps = {21.2, 22.3, 26.4, 19.1, 34.7};

        temps[2] = 48.9;

        for (int i = 0; i < temps.length; i++) {
            System.out.println(temps[i]);
        }
    }
}