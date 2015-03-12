
public class position 
{
	private int row, col;
	public position()
	{
		row = 0;
		col = 0;
	}
	public position(int _row, int _col)
	{
		row = _row;
		col = _col;
	}
	
	public void setRow(int _row)
	{
		row = _row;
	}
	public void setCol(int _col)
	{
		col = _col;
	}
	
	public int getRow()
	{
		return row;
	}
	public int getCol()
	{
		return col;
	}

    public String toString()
    {
        return " ("+row+", "+col+")";
    }
}
