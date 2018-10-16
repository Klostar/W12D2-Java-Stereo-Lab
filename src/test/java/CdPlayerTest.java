import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer("Sony" ,"5432",4);
    }

    @Test
    public void getMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("5432", cdPlayer.getModel());
    }

    @Test
    public void getNumberOfCds(){
        assertEquals(4, cdPlayer.getNumberOfCds());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Dancing Queen", cdPlayer.play("Dancing Queen"));
    }
}
