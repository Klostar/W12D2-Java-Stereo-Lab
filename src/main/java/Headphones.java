public class Headphones implements IConnect {
    public Headphones(){

    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
