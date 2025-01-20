package Assigment_3.Interfaces.Task18;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        for (int i = 1; i < items.size(); i++) {
            Person first = items.get(i);
            Person second = items.get(i - 1);
            first.pull(second);
        }
    }
}
