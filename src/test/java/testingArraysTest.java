import org.junit.jupiter.api.*;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class testingArraysTest {
    private testingArrays myInts;
/*
public testingArrays myInts;
 */

@BeforeEach
    void setUp() {
        myInts = new testingArrays();
        myInts.Zarray = new int[] {1, 2, 3, 4};
    }


    @Test
    @DisplayName("Find Average ")
    void getAverage() {
        double expected = 2.5;
        assertEquals(expected, myInts.getAverage(), 0.001);
        System.out.println(myInts.getAverage());
    }

    @Test
    @DisplayName("Should throw exception if Zarray contains negative numbers")
    void getAverageShouldThrowExceptionForNegativeNumbers() {
        myInts.Zarray = new int[]{1,-2,3,4};
        assertThrows(IllegalArgumentException.class, () -> myInts.getAverage());
    }

    @Test
    @DisplayName("Array får inte vara null")
    void throwExceptionForNullArray() {
        myInts.Zarray = null;
        assertThrows(IllegalArgumentException.class, () -> myInts.getAverage());
    }

    @Test
    @DisplayName("Array får inte vara tom")
    void throwExceptionForTom() {
        myInts.Zarray = new int[]{};
        assertThrows(IllegalArgumentException.class, () -> myInts.getAverage());
    }

    @Nested
    @DisplayName("Tests for finding positions")
    class testFindingPositions {
        @BeforeEach
        void setUp() {
            myInts = new testingArrays();
            myInts.Zarray = new int[] {1, 3, 2, 3};
        }

        @Test
        @DisplayName("Find Position")
        void findPositions(){
            myInts.findPositions(3);

            assertEquals(2,myInts.Zarray.length );
            System.out.println(Arrays.toString(myInts.Zarray));
        }

        @Test
        @DisplayName("No position found")
        void noPositionFound(){
            assertThrows(IllegalArgumentException.class, () -> myInts.findPositions(5));
        }

        @Test
        @DisplayName("Alla siffror har tagits med")
        void allNumbersAreOk(){
            int[] k = new int[]{1, 3};
            myInts.findPositions(3);
            assertArrayEquals(k, myInts.Zarray);
            //Ganska lik den första med mer specifik
        }
    }


    @Nested
    @DisplayName("Tests for appendLast")
    class testAppendLast {
        @Test
        @DisplayName("AppendLast")
        void appendLast(){
            int[] k = new int[]{1, 2, 3, 4, 5};
            myInts.appendLast(5);
            assertArrayEquals(k, myInts.Zarray);

            //Kontroll:
            System.out.println(Arrays.toString(myInts.Zarray));
        }

        @Test
        @DisplayName("Should work on an empty array")
        void shouldWorkWithEmptyArray() {
            myInts.Zarray = new int[]{};
            myInts.appendLast(5);

            assertEquals(1, myInts.Zarray.length);
            assertEquals(5, myInts.Zarray[0]);
            System.out.println(Arrays.toString(myInts.Zarray));
        }

    }


    @Nested
    @DisplayName("Tests for insertAt")
    class testInsertAt {
        @Test
        @DisplayName("Insert at")
        void insertAt(){
            myInts.insertAt(3, 3);
            int[] k = new int[]{1, 2, 3, 3,};
            assertArrayEquals(k,myInts.Zarray);
        }
        @Test
        @DisplayName("Kontrollera att positionen finns i arrayen")
        void throwExceptionIfPositionDosentExit(){
            assertThrows(IndexOutOfBoundsException.class, () -> myInts.insertAt(7,10));
        }
        @Test
        @DisplayName("Should throw exception if pos is a negative numbers")
        void throwExceptionIfPosIsNegativeNumbers() {
            assertThrows(IllegalArgumentException.class, () -> myInts.insertAt(-1,10));
        }
    }

    @Nested
    @DisplayName("Tests for getAt")
    class testGetAt {
        @Test
        @DisplayName("Get at")
        void getAt(){
            assertEquals(1,myInts.getAt(0));
    }

    @Test
    @DisplayName("Position cannot be negative")
        void throwExceptionIfPositionIsNegative(){
            assertThrows(IllegalArgumentException.class, () -> myInts.getAt(-1));
    }

    @Test
        @DisplayName("Position is out of bounds")
        void throwExceptionIfPositionIsOutOfBounds(){
            assertThrows(IndexOutOfBoundsException.class, () -> myInts.getAt(5));
    }

}

    @Nested
    @DisplayName("tests for setAt")
    class testSetAt {
        @Test
        @DisplayName("Set at")
        void setAt(){
        myInts.setAt(1, 3);
        int[] k = new int[]{1, 3, 3, 4,};
        assertArrayEquals(k,myInts.Zarray);
            System.out.println(Arrays.toString(myInts.Zarray));
    }
}

    @Nested
    @DisplayName("Tests for deleteAt")
    class testDeleteAt{
    @Test
    @DisplayName("test delete at")
    void deleteAt(){
                myInts.deleteAt(3);
                int[] k = new int[]{1, 3, 3, 4,};
            }
        }




    //BUG test void bug1{}
    //Delete at utanför Zarray, samma med set at
    //något som är tomt är altlid något att kolla.

}

