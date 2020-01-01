import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ala ma kota", text -> text.toUpperCase());
        poemBeautifier.beautify("Ala ma kota", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Ala ma kota", text -> text.substring(3,7));
        poemBeautifier.beautify("ALA MA KOTA", text -> text.toLowerCase());
    }
}
