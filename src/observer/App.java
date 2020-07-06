package observer;

public class App {

    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.setNews("US president tweets covid19 is FAKE NEWS!");
        System.out.println("News in channel1> " + channel1.getNews());
        System.out.println("News in channel2> " + channel2.getNews());
    }

}
