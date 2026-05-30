package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task41Test {

    @Test
    void censorWords_basic() {
        assertEquals("hello *** world", Task41.censorWords("hello bad world", new String[]{"bad"}));
    }

    @Test
    void censorWords_caseInsensitive() {
        assertEquals("Java ** cool", Task41.censorWords("Java IS cool", new String[]{"is"}));
    }

    @Test
    void censorWords_multipleOccurrences() {
        assertEquals("*** *** ***", Task41.censorWords("bad Bad BAD", new String[]{"bad"}));
    }

    @Test
    void censorWords_multipleBadWords() {
        assertEquals("*** bar ***",
                Task41.censorWords("foo bar baz", new String[]{"foo", "baz"}));
    }

    @Test
    void censorWords_noMatches() {
        assertEquals("clean text here",
                Task41.censorWords("clean text here", new String[]{"bad"}));
    }

    @Test
    void censorWords_emptyBadWords() {
        assertEquals("nothing to censor",
                Task41.censorWords("nothing to censor", new String[]{}));
    }
}
