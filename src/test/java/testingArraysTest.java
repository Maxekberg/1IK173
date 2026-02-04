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
        int [] resultat1 =  new int[1, 2, 3, 4, 5];
        assertEquals(3 ,3 );
        //{1, 2, 3, 4};
    }

    @Test
    @DisplayName("Insert at")
    void insertAt(){
        myInts.insertAt(3, 3);
        assertEquals(3,3);
    }

    @Test
    @DisplayName("Get at")
    void getAt(){
        myInts.getAt(1);
        int resultat = myInts.getAt(1);
        assertEquals(2,resultat);
        //problem om värdet är noll
    }

    /**
     * Set a new value at position <pos>.
     * @param pos
     * @param element
     */

    @Test
    @DisplayName("Set at")
    void setAt(){
        myInts.setAt(2, 3);
        int resultat = myInts.getAt(2);
        assertEquals(3,resultat);
    }

    //BUG test void bug1{}

}

