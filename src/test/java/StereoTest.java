import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Stereo 1");
    }

    @Test
    public void hasName(){
        assertEquals("Stereo 1", stereo.getName());
    }

    @Test
    public void componentCount(){
        assertEquals(0, stereo.componentCount());
    }

    @Test
    public void addComponent(){
       RecordDeck recordDeck = new RecordDeck("Sony","2345",1);
        stereo.addComponent(recordDeck);
        assertEquals(1, stereo.componentCount());
    }

    @Test
    public void hasRadio(){
        assertEquals("Heart", stereo.getRadio().tune());
    }

    @Test
    public void canPlay(){
        RecordDeck recordDeck = new RecordDeck("Sony","2345",1);
        assertEquals("Dancing Queen", stereo.playSong(recordDeck, "Dancing Queen"));
    }


}
