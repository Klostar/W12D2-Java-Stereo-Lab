import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void beofre(){
        recordDeck = new RecordDeck("Sony","1234",1 );
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("1234", recordDeck.getModel());
    }
    @Test
    public void hasPlaySpeed(){
        assertEquals(1, recordDeck.getPlaySpeed());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Dancing Queen", recordDeck.play("Dancing Queen"));
    }
}
