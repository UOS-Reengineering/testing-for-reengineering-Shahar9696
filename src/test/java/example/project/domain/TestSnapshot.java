package example.project.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestSnapshot {
    Snapshot s1 = new Snapshot();
    Snapshot s2 = new Snapshot();

    @BeforeEach
    public void init() {
        s1.roadType = "curve";
        s1.weatherCondition = "clean";
        s1.egoCarPos = Arrays.asList(0F, 0F);
        s1.carInFrontPos = Arrays.asList(0.5F, 0.5F);

        s2.roadType = "curve";
        s2.weatherCondition = "clean";
        s2.egoCarPos = Arrays.asList(0F, 0F);
        s2.carInFrontPos = Arrays.asList(0.5F, 0.5F);
    }

    @Test
    public void testEquality()
    {
        assertEquals(s1, s2);
    }

    @Test
    public void testEqualitySimple()
    {
        assertEquals(s1, s2);
    }
}
