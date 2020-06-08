import org.junit.Assert;
import org.junit.Test;

public class PatternDetectorTest {
    @Test
    public void testIsPalindrome(){
        PatternDetector detector = new PatternDetector();
        Assert.assertTrue(detector.isPalindrome("kayak"));
        Assert.assertFalse(detector.isPalindrome("canoe"));
    }

    @Test
    public void testIsIsogram(){
        PatternDetector detector = new PatternDetector();
        Assert.assertFalse("kayak should not be an isogram", detector.isIsogram("kayak"));
        Assert.assertTrue("canoe is an isogram", detector.isIsogram("canoe"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsIsogramWithNumber(){
        PatternDetector detector = new PatternDetector();
        detector.isIsogram("toto12");
    }
}
