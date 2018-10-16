import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassetteDeckTest {

    CassetteDeck cassetteDeck;

    @Before
    public void before(){
        cassetteDeck = new CassetteDeck("Sony", "9876",2);
    }

    @Test
    public void getMake(){
        assertEquals("Sony", cassetteDeck.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("9876", cassetteDeck.getModel());
    }

    @Test
    public void getNumberOfCassettes(){
        assertEquals(2, cassetteDeck.getNumberOfCassettes());
    }

    @Test
    public void canPlay(){
        assertEquals("Dancing Queen", cassetteDeck.play("Dancing Queen"));
    }
}
