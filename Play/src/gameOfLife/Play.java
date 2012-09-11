package gameOfLife;

import game.Board;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author rodrigo salado anaya
 */
public class Play extends Application {

    private static final boolean L = true; //LIVE
    private static final boolean D = false; //DEAD
    private static final int tick = 300;
    private static final String CELL_LIVE_CHAR = " X ";
    private static final String CELL_DEAD_CHAR = "   ";
    private static AnimationTimer timer;
    private static final Board p = new Board();
    private static int LENGTH;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 220, 245));
        final Text text = new Text();
        text.setFont(new Font("Courier", 12.0));
        timer = getTimer(text);
        root.getChildren().add(text);
        primaryStage.show();
        iniBoard();
        timer.start();
    }

    public void iniBoard() {

        boolean[][] initialBoard = {
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, L, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, L, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, L, L, L, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},};

        LENGTH = initialBoard.length;
        p.setBoardLength(LENGTH);
        p.fillBoard(initialBoard);
    }

    private String getText() {
        boolean[][] board = p.getActualBoard();
        String boardStr = "\n";
        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                boardStr += board[i][j] ? CELL_LIVE_CHAR : CELL_DEAD_CHAR;
            }
            boardStr += "\n";
        }
        p.nextStep();
        return boardStr;
    }

    private AnimationTimer getTimer(final Text text) {
        return new AnimationTimer() {
            @Override
            public void handle(long l) {
                text.setText(getText());
                try {
                    Thread.sleep(tick);
                } catch (InterruptedException ex) {
                }
            }
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}
