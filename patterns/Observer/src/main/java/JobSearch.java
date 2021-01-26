public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite = new JavaDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("First Java Position");
        javaDeveloperJobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Zianon Pazniak");
        Observer secondSubscriber = new Subscriber("Balakhovich Stas");

        javaDeveloperJobSite.addObserver(firstSubscriber);
        javaDeveloperJobSite.addObserver(secondSubscriber);

        javaDeveloperJobSite.addVacancy("Third Java Position");

        javaDeveloperJobSite.removeVacancy("Third Java Position");
    }
}
