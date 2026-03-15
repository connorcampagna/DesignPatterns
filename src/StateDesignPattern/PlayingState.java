package StateDesignPattern;

// 2. The Concrete States
public class PlayingState implements State {
    public void pressPlay(MediaPlayer player) {
        System.out.println("Pausing the player.");
        player.setState(new PausedState()); // Transition to Paused
    }
}