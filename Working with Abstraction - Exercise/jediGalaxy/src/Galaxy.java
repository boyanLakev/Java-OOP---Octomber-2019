public class Galaxy {
    private Field field;

    public Galaxy(Field feild){
        this.field=feild;
    }

    public int  getLenght(){
       return this.field.getLenght();
    }
    public int getInnerLenght(){
        return this.field.getInnerLenght();
    }

    public void setValue(int row,int col,int newValue){
        this.field.setCell(row,col,newValue);
    }

    public int getStar(int row, int col) {
        return  this.field.getValue(row,col);
    }
}
