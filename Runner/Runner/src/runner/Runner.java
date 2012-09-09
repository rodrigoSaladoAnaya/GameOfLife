package runner;

import game.Play;
import javafx.application.Application;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Game of life");
        Text text = new Text();
        text.setText(getText());
        StackPane root = new StackPane();
        root.getChildren().add(text);
        primaryStage.setScene(new Scene(root, 120, 120));
        primaryStage.show();
    }

    public String getText() {
        Play p = new Play();
        boolean[][] initialBoard = {
            {DEAD, DEAD, DEAD, DEAD, LIVE, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, LIVE, DEAD, DEAD, LIVE, DEAD},
            {DEAD, DEAD, LIVE, DEAD, DEAD, DEAD},
            {DEAD, DEAD, DEAD, DEAD, LIVE, DEAD}};
        int length = initialBoard.length;
        p.setLength(length);
        p.fillBoard(initialBoard);

        p.nextExolution();
        boolean[][] board = p.getActualBoard();
        String boardStr = "";

        for (int i = 0; i != length; i++) {
            for (int j = 0; j != length; j++) {
                boardStr += board[i][j] ? CELL_LIVE_CHAR : CELL_DEAD_CHAR;
            }
            boardStr += "\n";
        }
        return boardStr;
    }
}
