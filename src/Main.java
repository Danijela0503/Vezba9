public class Main {

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Zbir je: " + kalkulator.add(50.0,20.0));
        System.out.println("Razlika je: " + kalkulator.sub(50.0,20.0));
        System.out.println("Proizvod je: " + kalkulator.mul(50.0,20.0));
        System.out.println("Kolicnik je: " + kalkulator.div(50.0,20.0));



    }
}