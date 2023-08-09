package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();

        List<String> meat = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), meat);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();

        String family = feline.getFamily();

        assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();

        int kittens = feline.getKittens();

        assertEquals(1, kittens);
    }

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() {
        feline.getKittens(1);
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}