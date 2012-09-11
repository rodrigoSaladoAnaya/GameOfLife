package game;

import java.util.Timer;
import java.util.TimerTask;

public class Main { 
    public static void main( String ... args ) { 
        boolean L = true; //LIVE
        boolean D = false; //DEAD
        
        final Board b = new Board();
        b.setBoardLength(17);
        b.fillBoard(new boolean[][]{
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
            {L, D, L, D, D, L, D, D, L, D, D, L, D, D, L, D, L}});




       new Timer().schedule( new TimerTask() {
            StringBuilder builder = new StringBuilder("\n");       
           public void run() { 
                boolean[][] board = b.getActualBoard();
                int size = board.length;
                builder.delete(0, builder.length() -1);
                for( int i = 0 ; i < size; i++ ) { 
                    for( int j = 0 ; j < size ; j++ ) {                         
                        builder.append( board[i][j] ? " x ": "   ");
                    }
                    builder.append("\n");
                }
                System.out.println( builder );
                                System.out.println( "----------------------------------------------------" );
                b.nextStep();
           }
       }, 0, 200 );

    }
}

