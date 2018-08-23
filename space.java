public class Main {

    public static void main(String[] args) {
        String sentence = "aab xxy";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}
