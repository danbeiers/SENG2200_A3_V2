import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Widget implements Comparator<Widget>{
    private String id;
    private ArrayList<Double> entryTime;
    private ArrayList<Double> exitTime;
    private ArrayList<Double> processTime;
    private ArrayList<String> path;

    public Widget() {}

    public Widget(String id) {
        this.id = id;
        entryTime = new ArrayList<Double>();
        exitTime = new ArrayList<Double>();
        processTime = new ArrayList<Double>();
        path = new ArrayList<String>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Double> getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(List<Double> entryTime) {
        this.entryTime = (ArrayList<Double>) entryTime;
    }

    public List<Double> getProcessTime() {
        return processTime;
    }

    public void setProcessTime(List<Double> processTime) {
        this.processTime = (ArrayList<Double>) processTime;
    }

    public List<Double> getExitTime() {
        return exitTime;
    }

    public void setExitTime(List<Double> exitTime) {
        this.exitTime = (ArrayList<Double>) exitTime;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = (ArrayList<String>) path;
    }

    public void addEntryTime(double t) {
        entryTime.add(t);
    }

    public void addProcessTime(double t) { processTime.add(t); }

    public void addExitTime(double t) {
        exitTime.add(t);
    }

    public void addPath(String id) {
        path.add(id);
    }

    public int compare(Widget a, Widget b) {
        if((a.exitTime.get(a.exitTime.size()-1) - b.exitTime.get(b.exitTime.size()-1)) == 0)
            return 0;
        return ((a.exitTime.get(a.exitTime.size()-1) - b.exitTime.get(b.exitTime.size()-1)) <= 0 ? -1 : 1);
    };

    @Override
    public String toString(){
        return("ID:" + id + "\nPath: " + path.toString() + "\nEntryTimes: " + entryTime.toString() +
                "\nProcessTime:" + processTime.toString() + "\nExitTime: " + exitTime.toString() + "\n");
    }
}