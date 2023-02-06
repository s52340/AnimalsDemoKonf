import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal dog;

    @BeforeEach
    void setUp() {
        dog = new Animal("Bello", 3,"Dog", "wuff");
    }

    @Test
    @DisplayName("Test Konstruktor")
    void testAgeSmallerThenZero(){
        Animal cat = new Animal("Minki", -1, "cat", "miau");
        assertEquals("Minki", cat.getName());
        assertEquals(0, cat.getAge());
        assertEquals("cat", cat.getSpecies());
        assertEquals("miau", cat.getAnimalLoud());
    }


    @Test
    void giveAnimalLoud() {
        String expected = "wuff";
        String actual = dog.giveAnimalLoud();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNameAndAge() {
        String expected = "Name: Bello, Alter: 3";
        Assertions.assertEquals(expected,dog.getNameAndAge());
    }

    @Test
    void ageCategory() {
        assertEquals("young animal", dog.ageCategory());

        dog.setAge(8);
        assertEquals("old animal", dog.ageCategory());

        dog.setAge(1);
        assertEquals("baby animal", dog.ageCategory());
    }

    /**
    @Test
    void isABabyAnimal(){
        assertTrue();
    }
     hier fehlt etwas letzten 30 Min
     */
}