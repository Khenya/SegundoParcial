package examen2.template.observer;

public interface ISubject {
    void attach (IObserver observer);
    void deattach (IObserver observer);
    void notifyObservers();
}
