public class Mp3Player implements IConnect {

    public Mp3Player(){

    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }
}
