public class Restagle {
    private Poin bottomLeft;
    private Poin topRight;

    public Restagle(Poin bottomLeft, Poin topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Poin poin){
        boolean bX=poin.getCoodinatX()>=bottomLeft.getCoodinatX()
                && poin.getCoodinatX()<=topRight.getCoodinatX();
        boolean bY=poin.getCoodinatY()>=bottomLeft.getCoodinatY()
                && poin.getCoodinatY()<=topRight.getCoodinatY();
        return bX && bY;

    }

}
