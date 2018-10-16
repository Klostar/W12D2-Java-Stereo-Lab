public class CdPlayer extends Component implements IPlay {

    private int numberOfCds;

    public CdPlayer(String make, String model, int numberOfCds){
        super(make,model);
        this.numberOfCds = numberOfCds;
    }

    public int getNumberOfCds(){
        return this.numberOfCds;
    }

    public String play(String song){
        return song;
    }
}
