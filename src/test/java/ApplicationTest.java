import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;



class ApplicationTest {

    Application testApp = new Application();
    List<List<Integer>> testMatrix = List.of( List.of(3), List.of(1,2,3), List.of(4,5,6), List.of(7,8,9));
    List<List<Integer>> testMatrix2 = List.of( List.of(5),
            List.of(10,23,34,45,51),
            List.of(45,50,67,71,89),
            List.of(78,89,90,10,32),
            List.of(45,51,67,70,89),
            List.of(71,89,99,10,30));
                    // 250 -334

    List<List<Integer>> testMatrix3 = List.of( List.of(4),
                            List.of(1,0,0,-1),
                            List.of(0,1,-2,0),
                            List.of(0,-3,1,0),
                            List.of(-4,0,0,1));


/*    @Test
    void canAppGetFirstDiagonal() {
        assertEquals(15, testApp.diagonalDifference(testMatrix));
    }

    @Test
    void canAppGetSecondDiagonal() {
        assertEquals(15,testApp.diagonalDifference(testMatrix));
    }*/

    @Test
    void diagonalDifference() {
        assertEquals(0, testApp.diagonalDifference(testMatrix));
    }
    @Test
    void diagonalDifferenceWithMatrix5() {
        assertEquals(-84, testApp.diagonalDifference(testMatrix2));
    }
    @Test
    void diagonalDifferenceWithMatrix4() {
        assertEquals(-6, testApp.diagonalDifference(testMatrix3));
    }
}