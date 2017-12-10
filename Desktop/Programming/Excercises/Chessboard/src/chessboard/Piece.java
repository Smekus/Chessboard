
package chessboard;


public class Piece {
    
    private String naam;
    private int posx, posy;
    
    public Piece(String naam, int posx, int posy){
        this.naam = naam;
        this.posx = posx;
        this.posy = posy;
    }
    
    public int getPosx(){
        return posx;
    }
    
    
        public int getPosy(){
        return posy;
    }
        
        public void setPosx(int posx){
            this.posx = posx;
        }
        
        public void setPosY(int posy){
            this.posy = posy;
        }
    
}
