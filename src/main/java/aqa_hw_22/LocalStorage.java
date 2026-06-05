package aqa_hw_22;

import java.util.Map;

public class LocalStorage {

    public static Map<String, String> getUSerInfo() {
        return Map.of(
                "vaTest1@example.com", "pass1",
                "vaTest2@example.com", "pass2",
                "vaTest3@example.com", "pass3",
                "vaTest4@example.com", "pass4"
        );
    }

}
