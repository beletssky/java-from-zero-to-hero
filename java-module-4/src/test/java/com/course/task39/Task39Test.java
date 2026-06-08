package com.course.task39;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import static org.junit.jupiter.api.Assertions.*;

public class Task39Test {

    @Test
    void maxPlayersConstantShouldBe100() {
        assertEquals(100, GameConfig.MAX_PLAYERS);
    }

    @Test
    void versionConstantShouldBeOneDotZero() {
        assertEquals("1.0", GameConfig.VERSION);
    }

    @Test
    void getInfoShouldReturnFormattedString() {
        assertEquals("Version 1.0, max 100 players", GameConfig.getInfo());
    }

    @Test
    void constructorShouldBePrivate() throws NoSuchMethodException {
        Constructor<GameConfig> ctor = GameConfig.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(ctor.getModifiers()));
    }

    @Test
    void getInfoShouldBeStatic() throws NoSuchMethodException {
        assertTrue(Modifier.isStatic(GameConfig.class.getDeclaredMethod("getInfo").getModifiers()));
    }
}
