public class Player {
    private Galaxy galaxy;
    private long point;

    public Player(Galaxy galaxy) {
        this.galaxy = galaxy;
    }

    public void star(int row, int col){
        while (row >= 0 && col < galaxy.getInnerLenght()) {
            if (row >= 0 && row < galaxy.getLenght() && col >= 0 && col < galaxy.getInnerLenght()) {
                this.point += galaxy.getStar(row,col);
            }

            col++;
            row--;
        }


    }

    public long getPoint() {
       return this.point;
    }
}
