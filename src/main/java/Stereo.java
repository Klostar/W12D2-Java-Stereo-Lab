import java.util.ArrayList;

public class Stereo {

    private String name;
    private ArrayList<IPlay>components;
    private Radio radio;

    public Stereo(String name){
        this.radio = new Radio("Heart");
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(IPlay component){
        components.add(component);

    }

    public String getName() {
        return this.name;
    }

    public int componentCount() {
        return components.size();
    }

    public Radio getRadio() {
        return radio;
    }

    public String playSong(IPlay component, String song) {
        return component.play(song);
    }
}
