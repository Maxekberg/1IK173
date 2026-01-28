import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class testingArraysTest {

    private testingArrays myInts;

    @BeforeEach
    void setUp() {
        myInts = new testingArrays();
        myInts.array = new int[] {1, 2, 3, 4};

    }

    @Test
    @DisplayName("Find Average ")
    void getAverage() {
        double expected = 2.5;
        assertEquals(expected, myInts.getAverage(), 0.001);
        System.out.println(myInts.getAverage());
    }

    @Test
    @DisplayName("Find Position")
    void findPositions(){
        int[] result = myInts.findPositions(3);
        int[] expected = {2};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("AppendLast")
    void appendLast(){
        myInts.appendLast(3);
        assertEquals(3,3);
    }


}

