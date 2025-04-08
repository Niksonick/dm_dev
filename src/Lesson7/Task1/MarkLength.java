package Lesson7.Task1;

import java.util.List;
import java.util.ListIterator;

public final class MarkLength {
    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    private MarkLength() {
    }

    public static void markLength4(List<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() == TARGET_LENGTH) {
                iterator.set(TARGET_VALUE);
                iterator.add(s);
            }
        }
    }
}
