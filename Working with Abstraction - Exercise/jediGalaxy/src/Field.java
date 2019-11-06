public class Field {
    private int[][] matrix;

    public Field(int[][] matrix){
        this.matrix=matrix;
        this.setFieldValue();
    }

    private void setFieldValue() {
        int value = 0;
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix[r].length; c++) {
                matrix[r][c] = value++;
            }
        }
    }

    public int getLenght() {
        return this.matrix.length;
    }

    public int getInnerLenght() {
        return this.matrix[0].length;
    }

    public void setCell(int row,int col,int value) {
        this.matrix[row][col]=value;
    }


    public int getValue(int row, int col) {
        return this.matrix[row][col];
    }
}
