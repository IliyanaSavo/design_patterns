package observer;

import java.util.ArrayList;
import java.util.List;

public class Publication implements Subject{
	private List<Observer> observers;
    private String publication;

    public Publication() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers){
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.publication;
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setPublication(this);
    }

    public void setPublication(String publication){
    	this.publication = publication;
        this.notifyObservers();
    }

}
