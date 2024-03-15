import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckItTest {

    @Test
    public void predicateCoverage1() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        CheckIt check = new CheckIt();
        assertEquals("P is true",check.checkIt(a, b, c) );
    }

    @Test
    public void predicateCoverage2() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        assertEquals("P isn't true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverage1() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverage2() {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverage3() {

        boolean a = false;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void clauseCoverage4() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        assertEquals("P isn't true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void caccCoverage1() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void caccCoverage2() {
        boolean a = false;
        boolean b = true;
        boolean c = false;
        assertEquals("P isn't true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void raccCoverage1() {

        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void raccCoverage2() {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }

    @Test
    public void mccCoverage1() {
        boolean a = false;
        boolean b = true;
        boolean c = true;
        assertEquals("P is true",CheckIt.checkIt(a, b, c) );
    }
}