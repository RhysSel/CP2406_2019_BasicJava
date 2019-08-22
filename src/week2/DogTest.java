package week2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DogTest {

    void testDefault() {
        Dog dog = new Dog();
        assertNull(dog.name);
        assertNull(dog.breed);
        assertNull(dog.shotStatus);
        assertEquals(0, dog.age);
    }
}