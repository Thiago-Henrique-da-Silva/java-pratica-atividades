package statico.test;

import statico.classes.Conversor;

public class conversorTest {
    public static void main(String[] args) {
        double metros = Conversor.kmParaMetros(2);
        double fahrenheit = Conversor.celciusParaFahrenheit(25);

        System.out.println(metros);
        System.out.println(fahrenheit);
    }
}
