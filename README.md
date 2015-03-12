# MazeSolver
A program to solve mazes with a queue

<img src="https://cloud.githubusercontent.com/assets/10458699/6612086/b3947534-c832-11e4-92ab-a823a69f1fed.PNG"
 alt="Maze GUI" title="mazegui" align="center" />

## Solving Process

1. A Queue of spaces to explore within the maze keeps track of what needs to happen.
2. Spaces are taken out of the queue one at a time and marked as visited.
3. The current space is checked to see if it is the goal.
4. If not, look at all neighboring spaces and add any that have not yet been visited to the queue. 
5. The algorithm then repeats until the goal is found, or the queue becomes empty (which means that the maze is not solvable).
