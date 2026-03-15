package StateDesignPattern;

public class PausedState implements State {
    public void pressPlay(MediaPlayer player) {
        System.out.println("Resuming playback.");
        player.setState(new PlayingState()); // Transition to Playing
    }
}