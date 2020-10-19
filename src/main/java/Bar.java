public class Bar {

    public boolean happyhour;
    public BarObserver observers;

    public Bar(BarObserver observers) {
        this.happyhour = false;
        this.observers = observers;
    }


    public boolean isHappyHour() {
        return this.happyhour;
    }

    public void startHappyHour() {
        this.happyhour = true;
    }

    public void endHappyHour() {
        this.happyhour = false;
    }

    void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
