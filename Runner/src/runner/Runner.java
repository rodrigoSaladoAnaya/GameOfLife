package runner;

import game.Play;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author rodrigo salado anaya
 */
public class Runner extends Application {

    private static final boolean LIVE = true;
    private static final boolean DEAD = false;
    private static final String CELL_LIVE_CHAR = " x ";
    private static final String CELL_DEAD_CHAR = "   ";
    private Timeline timeline;
    private AnimationTimer timer;
    private static Play p = new Play();
    private static int LENGTH;

    public void play() {
        timeline.play();
        timer.start();
    }

    @Override
    public void stop() {
        timeline.stop();
        timer.stop();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 300, 300));
        final Text text = new Text();
        iniBoard();
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                text.setText(getText());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        };
        root.getChildren().add(text);
        primaryStage.show();
        play();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void iniBoard() {

        boolean[][] initialBoard = {
            {LIVE, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE, DEAD, LIVE, LIVE, LIVE, DEAD, DEAD, DEAD, LIVE, LIVE, LIVE, DEAD, LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, LIVE, LIVE, LIVE, DEAD, DEAD, DEAD, LIVE, LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, LIVE, LIVE, LIVE, DEAD, DEAD, DEAD, LIVE, LIVE, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, LIVE, DEAD, DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE, DEAD, LIVE, LIVE, LIVE, DEAD, DEAD, DEAD, LIVE, LIVE, LIVE, DEAD, LIVE, DEAD, LIVE},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {LIVE, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, DEAD, LIVE, DEAD, LIVE},};
        LENGTH = initialBoard.length;
        p.setLength(LENGTH);
        p.fillBoard(initialBoard);
    }

    public String getText() {
        boolean[][] board = p.getActualBoard();
        String boardStr = "\n";
        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                boardStr += board[i][j] ? CELL_LIVE_CHAR : CELL_DEAD_CHAR;
            }
            boardStr += "\n";
        }
        p.nextExolution();
        System.out.println(boardStr + "===============");
        return boardStr;
    }
}
