public class Main {

    public static void main(String[] args) {
        String sentence = "hello world";
        

        sentence = sentence.replaceAll("\\s", "");
        System.out.println(sentence);
    }
}
