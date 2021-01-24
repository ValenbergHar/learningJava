package methods;

import methods.ann.Generator;

public class PasswordGeneratorSecond {
    static {
        System.out.println("passwordGeneratorSecond");
    }

    @Generator
    public String generatePassword() {
        return "Second";
    }
}
