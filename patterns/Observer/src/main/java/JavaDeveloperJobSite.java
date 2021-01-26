import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObserver();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }

}
