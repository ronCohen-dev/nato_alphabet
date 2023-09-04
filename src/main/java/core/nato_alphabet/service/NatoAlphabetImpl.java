package core.nato_alphabet.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NatoAlphabetImpl {

    public static String nato(String word) {
        Map<Character, String> natoAlphabet = new HashMap<>();
        natoAlphabet.put('a', "Alpha");
        natoAlphabet.put('b', "Bravo");
        natoAlphabet.put('c', "Charlie");
        natoAlphabet.put('d', "Delta");
        natoAlphabet.put('e', "Echo");
        natoAlphabet.put('f', "Foxtrot");
        natoAlphabet.put('g', "Golf");
        natoAlphabet.put('h', "Hotel");
        natoAlphabet.put('i', "India");
        natoAlphabet.put('j', "Juliett");
        natoAlphabet.put('k', "Kilo");
        natoAlphabet.put('l', "Lima");
        natoAlphabet.put('m', "Mike");
        natoAlphabet.put('n', "November");
        natoAlphabet.put('o', "Oscar");
        natoAlphabet.put('p', "Papa");
        natoAlphabet.put('q', "Quebec");
        natoAlphabet.put('r', "Romeo");
        natoAlphabet.put('s', "Sierra");
        natoAlphabet.put('t', "Tango");
        natoAlphabet.put('u', "Uniform");
        natoAlphabet.put('v', "Victor");
        natoAlphabet.put('w', "Whiskey");
        natoAlphabet.put('x', "X-ray");
        natoAlphabet.put('y', "Yankee");
        natoAlphabet.put('z', "Zulu");

        StringBuilder result = new StringBuilder();

        for (char letter : word.toLowerCase().toCharArray()) {
            if (natoAlphabet.containsKey(letter)) {
                result.append(natoAlphabet.get(letter)).append(" ");
            }
        }

        return result.toString().trim();
    }
}
