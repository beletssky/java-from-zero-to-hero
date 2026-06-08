package com.course.task09;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task09Test {

    @Test
    void phoneConstructorSetsNumber() {
        Phone p = new Phone("+123");
        assertEquals("+123", p.getNumber());
    }

    @Test
    void phoneCallReturnsCallingMessage() {
        Phone p = new Phone("+123");
        assertEquals("calling +123", p.call());
    }

    @Test
    void smartphoneConstructorSetsAllFields() {
        Smartphone s = new Smartphone("+456", "Android");
        assertEquals("+456", s.getNumber());
        assertEquals("Android", s.getOsName());
    }

    @Test
    void smartphoneRunAppFormatsMessage() {
        Smartphone s = new Smartphone("+456", "Android");
        assertEquals("WhatsApp running on Android", s.runApp("WhatsApp"));
    }

    @Test
    void smartphoneInheritsCall() {
        Smartphone s = new Smartphone("+789", "iOS");
        assertEquals("calling +789", s.call());
    }

    @Test
    void polymorphicReferenceCallsInheritedCall() {
        Phone p = new Smartphone("+789", "iOS");
        assertEquals("calling +789", p.call());
    }
}
