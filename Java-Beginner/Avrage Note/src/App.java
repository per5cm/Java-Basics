public class App {
    public static void main(String[] args) throws Exception {

        int math = 4;
        int english = 2;
        int history = 1;
        int literature = 3;

        int avrage = calculateAvrageNote(math, english, history, literature);

        System.out.print("My School grade point avrage = ");
        System.out.println(avrage);
    }

    public static int calculateAvrageNote(int math, int english, int history, int literature) {
        return (math + english + history + literature) / 4;
    }
}
