
public class MazeSolverQueue implements MazeGUIListener
{
	private MazeGUI gui;
	private LinkedQueue<position> pos;
	
	public MazeSolverQueue()
	{
		gui = new MazeGUI();
		pos = new LinkedQueue<position>();
	}
	@Override
	public void start(Maze m) 
	{
		gui.setStatusText("Solving...");
		pos.clear();
		position p = new position(m.getStartRow(),m.getStartCol());
		pos.enqueue(p);
	}

	@Override
	public void step(Maze m) 
	{
        String currentQ = pos.toString();
        gui.setStatusText("Solving...Queue: " + currentQ);
//		You will use a Queue as your "agenda" of spaces to explore within the maze. 
//		For each step of the solution your algorithm will take the next space from the agenda (the queue),
//		mark the space as "explored" (visited), and 
		m.markCellVisited(pos.first().getRow(), pos.first().getCol());
//		check to see if that space is the goal. 
		if (pos.first().getRow() == m.getGoalRow() && pos.first().getCol() == m.getGoalCol())
		{
			gui.setStatusText("Maze Solved!");
			gui.stopAnimation();
		}
//		If not, it will scan all neighboring (above, below, right and left) spaces and 
//		add any that have not yet been visited to the queue. 
		scanAdjacent(m);
		pos.dequeue();
//		The algorithm then repeats until the goal is found, or 
//		the queue becomes empty (which means that the maze is not solvable).
		if (pos.isEmpty())
		{
			gui.setStatusText("Maze is Unsolvable :(");
			gui.stopAnimation();
		}
		
	}
	
	public static void main(String[] args) 
	{
		MazeSolverQueue mazeSolver = new MazeSolverQueue();
		mazeSolver.gui.addMazeGUIListener(mazeSolver);

			
	}

	private void scanAdjacent(Maze m)
	{
		int r = pos.first().getRow();
		int c = pos.first().getCol();
		//enqueue all adjacent spaces that have not been visited
		if (!(m.visited(r+1, c)) && m.getCell(r+1, c) != '#')
		{
			position p = new position(r+1, c);
			pos.enqueue(p);
		}
		if (!(m.visited(r-1, c)) && m.getCell(r-1, c) != '#')
		{
			position p = new position(r-1, c);
			pos.enqueue(p);
		}
		if (!(m.visited(r, c+1)) && m.getCell(r, c+1) != '#')
		{
			position p = new position(r, c+1);
			pos.enqueue(p);
		}
		if (!(m.visited(r, c-1)) && m.getCell(r, c-1) != '#')
		{
			position p = new position(r, c-1);
			pos.enqueue(p);
		}
	}
}
