public class VideoGames extends Media {

    @Override
    public void borrow() {
        System.out.println("I shouldnt be borrowable :(");
    }

    @Override
    public void consume() {
        System.out.println("plays game");
    }

    public void interact(){
        System.out.println("The user interacts with a game");
    }
    
}
