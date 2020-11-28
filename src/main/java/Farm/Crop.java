package Farm;


import Interfaces.Produce;


import java.util.ArrayList;
import java.util.List;

public class Crop<T extends Crop> implements Produce {
    private String name;
    private List<Crop> cropRow;

    public Crop(String name) {
        this.name = name;
        this.cropRow = new ArrayList<>();
    }

    @Override
    public void yield(Silo silo) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Crop> getCropRow() {
        return cropRow;
    }

    public void setCropRow(List<Crop> cropRow) {
        this.cropRow = cropRow;
    }
}
