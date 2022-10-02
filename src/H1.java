import javax.swing.*;

public class H1 {
    public static void main(String[] args) {
        String number;
        number = JOptionPane.showInputDialog("Введите трехзначное число:");
        int a = Integer.parseInt(number);
        int resulte = a / 100;
        System.out.println(resulte);

        double resulte1 = (double) a / 100;
        System.out.println(Math.ceil(resulte1));
    }
}
