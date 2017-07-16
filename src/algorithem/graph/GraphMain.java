package algorithem.graph;

public class GraphMain {
	
	public static void main(String[] args){
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.inputData(1, 2);
		dfs.inputData(1, 3);
		dfs.inputData(2, 3);
		dfs.inputData(2, 5);
		dfs.inputData(3, 4);
		dfs.inputData(3, 5);
		dfs.inputData(4, 5);
		
		dfs.doDFS(1);
//		dfs.doDFS(1,4);

		System.out.println("");
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.inputData(1, 2);
		bfs.inputData(1, 3);
		bfs.inputData(2, 3);
		bfs.inputData(2, 5);
		bfs.inputData(3, 4);
		bfs.inputData(3, 5);
		bfs.inputData(4, 5);
		
		bfs.doBFS(1);
		
		
		
/*		Dijkstra g = new Dijkstra(8);;
		
		g.input(1, 2, 3);
		g.input(1, 5, 4);
		g.input(1, 4, 5);
		g.input(2, 3, 2);
		g.input(3, 4, 1);
		g.input(3, 8, 3);
		g.input(4, 5, 2);
		g.input(4, 7, 6);
		g.input(5, 6, 4);
		g.input(7, 6, 3);
		g.input(6, 8, 2);
		
		Dijkstra.doDijkstra(1);
*/
	}
	
	
}
