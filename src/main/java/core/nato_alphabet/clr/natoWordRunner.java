package core.nato_alphabet.clr;

import core.nato_alphabet.service.NatoAlphabetImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class natoWordRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Just For Example like in the mail: \n  ");
        String result1 = NatoAlphabetImpl.nato("hi");
        String result2 = NatoAlphabetImpl.nato("abc");
        String result3 = NatoAlphabetImpl.nato("babble");
        String result4 = NatoAlphabetImpl.nato("Banana");
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);


    }
}
