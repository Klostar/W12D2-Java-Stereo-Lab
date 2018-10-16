public class RecordDeck extends Component implements IPlay {

    private int playSpeed;


    public RecordDeck(String make, String model, int playSpeed){
        super(make,model);
        this.playSpeed = playSpeed;

    }

    public int getPlaySpeed(){
        return this.playSpeed;
    }

    public String play(String song){
        return song;
    }

}
