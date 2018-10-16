public class CassetteDeck extends Component implements IPlay{

    private int numberOfCassettes;

    public CassetteDeck(String make, String model, int numberOfCassettes){
        super(make,model);
        this.numberOfCassettes = numberOfCassettes;
    }

    public int getNumberOfCassettes(){
        return this.numberOfCassettes;
    }

    public String play(String song){
        return song;
    }

}
