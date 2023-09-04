package core.nato_alphabet;

import core.nato_alphabet.service.NatoAlphabetImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NatoAlphabetController {

    @GetMapping("/convertLetters")
    public String convertToNATOAlphabet(@RequestParam String word) {
        return NatoAlphabetImpl.nato(word);
    }
}
