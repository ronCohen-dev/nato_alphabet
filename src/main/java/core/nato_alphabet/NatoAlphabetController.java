package core.nato_alphabet;

import core.nato_alphabet.service.NatoAlphabetImpl;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class NatoAlphabetController {

     NatoAlphabetImpl natoAlphabet;

    @GetMapping("/convertLetters")
    public String convertToNATOAlphabet(@RequestParam String word) {
        return natoAlphabet.nato(word);
    }
}
