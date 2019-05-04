package cs1302.arcade.gameTetris.shapes;
import java.util.Random;

/**
 *  represents L shape 
 */
public class LShape extends Piece{
    Random r  = new Random();
    //  int [][] coordinates;
    /**
     * Generates a random type of L shape
     */
    public LShape()
        {            
            int num = r.nextInt(4);//random 0-4 

            if(num == 0)
            {
                shape0();
            }

            if(num == 1)
            {
                shape1();
            }

            if(num ==2)
            {
                shape2();
            }
            else
            {
                shape3();
            }
            
        }

    public void shape0()
        {

            int[][] coordinates = {
                {1, 1},
                {0, 1},
                {0, 1}
            };
            main = coordinates;
/*
                   **
                    *
                    *
                       shape size */
        }

public void shape1()
        {
            int[][] coordinates ={ {0, 0, 1}, {1, 1, 1} };
            main = coordinates;
            /*
       *
     ***
     */
        }
    public void shape2()
        {
            int[][] coordinates={  {1, 0},
                           {1, 0},
                           {1, 1} };
            main = coordinates;
            /* L
             */
        }
    public void shape3()
        {
            int[][] coordinates={ {1, 1, 1}, {1, 0, 0} };
            main = coordinates;
/*
           ***
           *
           */
        }
}
