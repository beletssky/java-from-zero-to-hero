package com.course.task32;

import java.util.Collection;
import java.util.Iterator;

/**
 * Описание коллекции через явный Iterator API (c.iterator(), hasNext, next).
 * Формат: "Collection size=N, items: [a, b, c]" или "Collection is empty".
 */
public class Task32 {

    public String describe(Collection<String> c) {
        // TODO: реализуй
        if (c == null || c.isEmpty()) {
            return "Collection is empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Collection size=").append(c.size()).append(", items: [");

        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());

            if (it.hasNext()) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
