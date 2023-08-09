package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    String sex;

    boolean hasMane;

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "говна кусок. Тестовые данные: {0} {1}")
    public static Object[][] parametersOfLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }


    @Test
    public void doesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);

        boolean actual = lion.doesHaveMane();

        assertEquals(hasMane, actual);
    }
}
