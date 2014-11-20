package ua.artcode.week2.day2.Chernobyl;




public class Chernobyl {
    private AtomicStation atomicStation;
    public Chernobyl(AtomicStation atomicStation) {
        this.atomicStation = atomicStation;
    }
    public void run(){
        atomicStation.startAS();
    }
    public AtomicStation getAtomicStation() {
        return atomicStation;
    }
    public void setAtomicStation(AtomicStation atomicStation) {
        this.atomicStation = atomicStation;
    }
}