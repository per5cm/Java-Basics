public class App {
    public static void main(String[] args) throws Exception {

        short math = 4;
        short english = 2;
        short history = 1;
        short literature = 3;

        float avrage = calculateAvrageNote(math, english, history, literature);

        System.out.print("My School grade point avrage = ");
        System.out.println(avrage);
    }

    public static float calculateAvrageNote(short math, short english, short history, short literature) {
        return (float) ((math + english + history + literature) / 4f);
    }
}
