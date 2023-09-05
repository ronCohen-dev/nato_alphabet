package core.nato_alphabet.clr;

import core.nato_alphabet.service.NatoAlphabetImpl;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)

public class natoWordRunner implements CommandLineRunner {

     NatoAlphabetImpl natoAlphabet;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Just For Example like in the mail: \n  ");
        String result1 = natoAlphabet.nato("hi");
        String result2 = natoAlphabet.nato("abc");
        String result3 = natoAlphabet.nato("babble");
        String result4 = natoAlphabet.nato("Banana");
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);


    }
}
