package runner;

import game.Play;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author rsa
 */
public class Runner extends Application {

    private static final boolean LIVE = true;
    private static final boolean DEAD = false;
    private static final char CELL_LIVE_CHAR = '*';
    private static final char CELL_DEAD_CHAR = '-';
    private Timeline timeline;
    private AnimationTimer timer;
    private static Play p = new Play();
    private static int LENGTH;

    private void init(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 100, 100));
        final Text text = new Text("".toString());
        iniBoard();
        final StackPane stack = new StackPane();
        stack.getChildren().addAll(text);
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
        root.getChildren().add(stack);
    }

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
        init(primaryStage);
        primaryStage.show();
        play();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void iniBoard() {
        
        boolean[][] initialBoard = {
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, LIVE, LIVE, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, LIVE, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, DEAD, DEAD}};
        LENGTH = initialBoard.length;
        p.setLength(LENGTH);
        p.fillBoard(initialBoard);
    }

    public String getText() {


        p.nextExolution();
        boolean[][] board = p.getActualBoard();
        String boardStr = "";

        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                boardStr += board[i][j] ? CELL_LIVE_CHAR : CELL_DEAD_CHAR;
            }
            boardStr += "\n";
        }
        return boardStr;
    }
}
