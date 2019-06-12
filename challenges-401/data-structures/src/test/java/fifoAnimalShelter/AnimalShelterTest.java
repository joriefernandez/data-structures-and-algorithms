package fifoAnimalShelter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    //test animal shelter
    AnimalShelter test;

    //Initialize test
    @Before
    public void initialize(){
        test = new AnimalShelter();
    }

    // Test enqueue
    @Test
    public void testEnqueue(){
        AnimalShelter.Animal dog1 = new AnimalShelter.Animal("dog");
        test.enqueue(dog1);
        assertEquals("Animal shelter should contain a dog or a cat.", "dog", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "dog", test.back.value.type);
        test.enqueue(new AnimalShelter.Animal("cat"));
        assertEquals("Animal shelter should contain a dog or a cat.", "dog", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.back.value.type);
    }

    // Test enqueue with invalid animal type
    @Test (expected = IllegalArgumentException.class)
    public void testEnqueueInvalid(){
        test.enqueue(new AnimalShelter.Animal("lion"));
    }

    // Test dequeue if invalid preference
    @Test
    public void testDequeueInvalid(){
        test.enqueue(new AnimalShelter.Animal("dog"));
        test.enqueue(new AnimalShelter.Animal("cat"));
        test.enqueue(new AnimalShelter.Animal("dog"));
        test.enqueue(new AnimalShelter.Animal("cat"));

        assertEquals("Animal shelter should return null if not a dog or cat.", null, test.dequeue("lion"));
        assertEquals("Animal shelter should contain a dog or a cat.", "dog", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.back.value.type);

    }

    // Test dequeue if queue is empty
    @Test
    public void testDequeueEmpty(){
        assertNull("Animal shelter should return null if not a dog or cat.", test.dequeue("lion"));
    }

    // Test dequeue with values
    @Test
    public void testDequeue(){
        test.enqueue(new AnimalShelter.Animal("dog"));
        test.enqueue(new AnimalShelter.Animal("cat"));
        test.enqueue(new AnimalShelter.Animal("dog"));
        test.enqueue(new AnimalShelter.Animal("cat"));

        assertEquals("Animal shelter should return a dog or cat.", "dog", test.dequeue("dog").type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.back.value.type);

        assertEquals("Animal shelter should return a dog or cat.", "dog", test.dequeue("dog").type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.back.value.type);

        assertEquals("Animal shelter should return a dog or cat.", null, test.dequeue("lion"));
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "cat", test.back.value.type);

    }

    // Test dequeue to empty
    @Test
    public void testDequeueUntilEmpty(){
        test.enqueue(new AnimalShelter.Animal("dog"));
        test.dequeue("dog");

        assertNull("Animal shelter should return a dog or cat.",  test.dequeue("dog"));


    }

    // Test dequeue if valid preferred but not in the list
    @Test
    public void testDequeueNotPreferred(){
        test.enqueue(new AnimalShelter.Animal("dog"));

        assertNull("Animal shelter should return a dog or cat.",  test.dequeue("cat"));
        assertEquals("Animal shelter should contain a dog or a cat.", "dog", test.front.value.type);
        assertEquals("Animal shelter should contain a dog or a cat.", "dog", test.back.value.type);


    }

}