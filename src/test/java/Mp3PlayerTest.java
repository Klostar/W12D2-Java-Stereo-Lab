import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    Mp3Player mp3Player;
    Stereo stereo;

    @Before
    public void before(){
        mp3Player = new Mp3Player();
        stereo = new Stereo("Stereo2");
    }

    @Test
    public void canConnect(){
        assertEquals("Stereo2", mp3Player.connect(stereo));
    }
}
