package squares;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import squares.Square;
/**
 *
 * @author david.hughes
 */
public class SquareLand {
    public static void main(String[] args){
    
        Square squareholder = generateSquare();
               
    }//main
    private static Square generateSquare(){
        
        int[] firstOr = {500,500};
        int firstL = 100;
        Square firstSquare = new Square(firstOr, firstL);
        return firstSquare;
    }//generateSquare()
        private static void drawSquare(Square sq){
            //for loop draws the 4 lines();
            //each draw for each side
            
        }//drawSquare close
    
}//class
