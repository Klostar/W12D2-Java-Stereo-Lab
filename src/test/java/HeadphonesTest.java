import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadphonesTest {
    Headphones headphones;
    Stereo stereo;

    @Before
    public void before(){
        headphones = new Headphones();
        stereo = new Stereo("Stereo1");

    }

    @Test
    public void canConnect(){
        assertEquals("Stereo1", headphones.connect(stereo));
    }
}
