package com.course.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task45Test {

    @Test
    void newLogIsEmpty() {
        Task45 log = new Task45();
        assertEquals(0, log.count());
    }

    @Test
    void addIncreasesCount() {
        Task45 log = new Task45();
        log.add("started");
        log.add("processing");
        assertEquals(2, log.count());
    }

    @Test
    void filterByTextReturnsMatchingSubset() {
        Task45 log = new Task45();
        log.add("user login");
        log.add("user logout");
        log.add("system reboot");
        Task45.Event[] userEvents = log.filterByText("user");
        assertEquals(2, userEvents.length);
    }

    @Test
    void filterByTextNoMatchIsEmpty() {
        Task45 log = new Task45();
        log.add("user login");
        assertEquals(0, log.filterByText("nothing").length);
    }

    @Test
    void filterByTextSingleMatch() {
        Task45 log = new Task45();
        log.add("error occurred");
        log.add("all good");
        Task45.Event[] errors = log.filterByText("error");
        assertEquals(1, errors.length);
        assertEquals("error occurred", errors[0].getMessage());
    }

    @Test
    void getEventsReturnsCopy() {
        Task45 log = new Task45();
        log.add("started");
        Task45.Event[] first = log.getEvents();
        first[0] = null;
        assertNotNull(log.getEvents()[0]);
    }

    @Test
    void addStoresMessage() {
        Task45 log = new Task45();
        log.add("hello");
        assertEquals("hello", log.getEvents()[0].getMessage());
    }

    @Test
    void eventGettersAndEquals() {
        Task45.Event a = new Task45.Event(1000L, "boot");
        Task45.Event b = new Task45.Event(1000L, "boot");
        assertEquals(1000L, a.getTimestamp());
        assertEquals("boot", a.getMessage());
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void eventToStringNotNull() {
        Task45.Event a = new Task45.Event(1000L, "boot");
        assertNotNull(a.toString());
    }

    @Test
    void logToStringHasPrefix() {
        Task45 log = new Task45();
        assertTrue(log.toString().startsWith("EventLog"));
    }
}
