import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatingLetters {

    public static void main(String[] args)
    {

        String input = "Test otomasyon dersi ödevi test ödevi dersi yapılıyor";

        input = input.toLowerCase();

        String[] strArray = input.split(" ");

        List<String> repeatedWords = new ArrayList<>();
        HashSet<String> uniqueWords = new HashSet<>();

        for(String str : strArray)
        {
            if (!uniqueWords.add(str))
                repeatedWords.add(str);
        }
        System.out.println("Metin içerisinde tekrar eden kelimeler: " +repeatedWords);
        String listString = "";

        for (String s : repeatedWords)
        {
            listString += s;
        }

        System.out.println("Tekrar eden kelimelerden oluşan karakter kümesi: " +listString);
    }

}

