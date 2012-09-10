package gameOfLife;

import game.Board;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author rodrigo salado anaya
 */
public class Play extends Application {

    private static final boolean L = true; //LIVE
    private static final boolean D = false; //DEAD
    private final int tick = 1000;
    private static final String CELL_LIVE_CHAR = " x ";
    private static final String CELL_DEAD_CHAR = " - ";
    private AnimationTimer timer;
    private static Board p = new Board();
    private static int LENGTH;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 200, 300));
        final Text text = new Text();
        iniBoard();
        timer = getTimer(text);
        root.getChildren().add(text);
        primaryStage.show();
        timer.start();
    }

    public void iniBoard() {

        boolean[][] initialBoard = {
            {L, D, L, D, D, L, D, D, L, D, D, L, D, D, L, D, L},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {L, D, L, D, L, L, L, D, D, D, L, L, L, D, L, D, L},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, L, D, D, D, D, L, D, L, D, D, D, D, L, D, D},
            {D, D, L, D, D, D, D, L, D, L, D, D, D, D, L, D, D},
            {D, D, L, D, D, D, D, L, D, L, D, D, D, D, L, D, D},
            {D, D, D, D, L, L, L, D, D, D, L, L, L, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, L, L, L, D, D, D, L, L, L, D, D, D, D},
            {D, D, L, D, D, D, D, L, D, L, D, D, D, D, L, D, D},
            {D, D, L, D, D, D, D, L, D, L, D, D, D, D, L, D, D},
            {D, D, L, D, D, D, D, L, D, L, D, D, D, D, L, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {L, D, L, D, L, L, L, D, D, D, L, L, L, D, L, D, L},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {L, D, L, D, D, L, D, D, L, D, D, L, D, D, L, D, L},};
        
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
        p.nextExolution();
        System.out.println(boardStr + "===============");
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
