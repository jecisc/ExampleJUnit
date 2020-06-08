import org.junit.*;

public class PatternDetectorTest3 {

    protected static PatternDetector detector;

    @BeforeClass
    public static void setUp() {
        PatternDetectorTest3.detector = new PatternDetector();
    }

    @AfterClass
    public static void tearDown() {
        PatternDetectorTest3.detector = null;
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(detector.isPalindrome("kayak"));
        Assert.assertFalse(detector.isPalindrome("canoe"));
    }

    @Test
    public void testIsIsogram() {
        Assert.assertFalse("kayak should not be an isogram", detector.isIsogram("kayak"));
        Assert.assertTrue("canoe is an isogram", detector.isIsogram("canoe"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsIsogramWithNumber() {
        detector.isIsogram("toto12");
    }
}