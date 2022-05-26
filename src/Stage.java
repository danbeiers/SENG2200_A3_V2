public class Stage {
    private String id;
    private int M;
    private int N;
    private boolean blocked;
    private boolean starved;
    private double startBlockedTime;
    private double endBlockedTime;
    private double startStarvedTime;
    private double endStarvedTime;
    private Stage[] nextStage;
    private Stage[] prevStage;
    private Storage storageQueue;
    private Storage supplyQueue;
    private Widget currentWidget;


    public boolean hasNextStage(){
        if(nextStage == null || nextStage.length == 0)
            return false;
        return true;
    }

    public boolean hasPrevStage(){
        if(prevStage == null || prevStage.length == 0)
            return false;
        return true;
    }

    public boolean hasStorage(){
        return (storageQueue != null);
    }

    public boolean hasSupply(){
        return (supplyQueue != null);
    }

    //Default getters and setters follow here
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getM() {
        return M;
    }

    public void setM(int m) {
        M = m;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }


    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isStarved() {
        return starved;
    }

    public void setStarved(boolean starved) {
        this.starved = starved;
    }

    public Stage[] getNextStage() {
        return nextStage;
    }

    public void setNextStage(Stage[] nextStage) {
        this.nextStage = nextStage;
    }

    public Stage[] getPrevStage() {
        return prevStage;
    }

    public void setPrevStage(Stage[] prevStage) {
        this.prevStage = prevStage;
    }

    public Storage getStorageQueue() {
        return storageQueue;
    }

    public void setStorageQueue(Storage storageQueue) {
        this.storageQueue = storageQueue;
    }

    public Storage getSupplyQueue() {
        return supplyQueue;
    }

    public void setSupplyQueue(Storage supplyQueue) {
        this.supplyQueue = supplyQueue;
    }

    public double getStartBlockedTime() {
        return startBlockedTime;
    }

    public void setStartBlockedTime(double startBlockedTime) {
        this.startBlockedTime = startBlockedTime;
    }

    public double getEndBlockedTime() {
        return endBlockedTime;
    }

    public void setEndBlockedTime(double endBlockedTime) {
        this.endBlockedTime = endBlockedTime;
    }

    public double getStartStarvedTime() {
        return startStarvedTime;
    }

    public void setStartStarvedTime(double startStarvedTime) {
        this.startStarvedTime = startStarvedTime;
    }

    public double getEndStarvedTime() {
        return endStarvedTime;
    }

    public void setEndStarvedTime(double endStarvedTime) {
        this.endStarvedTime = endStarvedTime;
    }

    public Widget getCurrentWidget() {
        return currentWidget;
    }

    public void setCurrentWidget(Widget currentWidget) {
        this.currentWidget = currentWidget;
    }
}
