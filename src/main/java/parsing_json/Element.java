package parsing_json;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Element extends ElementCollection {
private String name;
private String appearance;
private Double Atomic_mass;
private Double boil;
private String category;
private String color;
private Double density;
private String discovered_by;
private Double melt;
private Double molar_heat;
private String named_by;
private Object number;
private Object period;
private String phase;
private String source;
private String spectral_img;
private String summary;
private String symbol;
private Object xpos;
private Object ypos;
private ArrayList<Integer> shells;

private List<Element> elements = new ArrayList<>();


    public Element(String name, String appearance, Double Atomic_mass, Double boil, String category, String color, Double density, String discovered_by, Double melt, Double molar_heat, String named_by, Object number, Object period, String phase, String source, String spectral_img, String summary, String symbol, Object xpos, Object ypos, ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.Atomic_mass = Atomic_mass;
        this.boil = boil;
        this.category = category;
        this.color = color;
        this.density = density;
        this.discovered_by = discovered_by;
        this.melt = melt;
        this.molar_heat = molar_heat;
        this.named_by = named_by;
        this.number = number;
        this.period = period;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.summary = summary;
        this.symbol = symbol;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public Double getAtomic_mass() {
        return Atomic_mass;
    }

    public Double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public Double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public Double getMelt() {
        return melt;
    }

    public Double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public Object getNumber() {
        return number;
    }

    public Object getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public Object getXpos() {
        return xpos;
    }

    public Object getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }
    public List<Element> getElements(){
        return elements;
    }
    public void setElements(List<Element> elements){
        this.elements = elements;
    }

    @Override
    public Stream stream() {
        return null;
    }
}