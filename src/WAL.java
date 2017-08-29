public class WAL {
	/*
	 * The WAL Class stores the row, column and old value of the variable for the undo and redo stacks
	 */
	private int rowIndex;
	private int colIndex;
	private int oldValue;
	
	//Create a new WAL object and store the values to local vars
    public WAL(int rowIndex, int colIndex, int oldValue) {
    	if((rowIndex<0)||(colIndex<0)){
    		throw new IllegalArgumentException();
    	}
    	this.rowIndex = rowIndex;
    	this.colIndex = colIndex;
    	this.oldValue = oldValue;
    }

    //Return the old value of the cell
    public int getOldValue() {
       return oldValue;
    }
    
    //Return the row index of the cell
    public int getRowIndex() {
        return rowIndex;
    }

    //Return the column index of the cell
    public int getColIndex() {
      return colIndex;
    }

}
