import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatternDetectorTest2 {

    PatternDetector detector;

    @Before
    public void setUp() {
        this.detector = new PatternDetector();
    }

    @After
    public void tearDown() {
        this.detector = null;
    }

    @Test
    public void testIsPalindrome(){
        Assert.assertTrue(detector.isPalindrome("kayak"));
        Assert.assertFalse(detector.isPalindrome("canoe"));
    }

    @Test
    public void testIsIsogram(){
        Assert.assertFalse("kayak should not be an isogram", detector.isIsogram("kayak"));
        Assert.assertTrue("canoe is an isogram", detector.isIsogram("canoe"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsIsogramWithNumber(){
        detector.isIsogram("toto12");
    }
}
