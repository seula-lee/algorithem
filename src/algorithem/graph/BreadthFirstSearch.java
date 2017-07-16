package algorithem.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	private int N = 6;		// 정점 수 
	private int[][] map = new int[N][N]; 		// DFS인접행렬 
	private boolean visit[] = new boolean[N]; 	// 방문여부판별 
	private Queue<Integer> queue;
	
	
	public BreadthFirstSearch(){
		// 클래스 생성자
		// 리스트 초기
		queue = new LinkedList<Integer>();
		
		// map과 visit 변수 할당 		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				map[i][j] = 0;
			}
		}
		
		for(int i=0; i<N; i++){
			visit[i] = false;
		}
	}
	
	public void inputData(int n, int m){
		// 데이터입력함수 
		// n,m 를 넣으면 인접행렬에 값을넣는다 
		// 무방향 그래프이므로 대칭해서 넣어준다 
		map[n][m] = 1;
		map[m][n] = 1;
	}
	
	public void doBFS(int v){
		visit[v] = true;
		queue.add(v);
		
		while(!queue.isEmpty()){
			int node = queue.poll();
			System.out.print(node+" ");
			for(int i=0; i<N; i++){
				if(map[node][i]==1 && !visit[i]){
					visit[i]=true;
					queue.add(i);
				}
			}
		}
	}
}
