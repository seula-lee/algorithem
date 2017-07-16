package algorithem.graph;

import java.util.Stack;

/**
 * 
 * 
 * 문제 > 출발점에서 목적지까지 가는 모든 경우의 수 구하기 
 * 
 * @author http://javannspring.tistory.com/174
 * @author http://bumbums.tistory.com/1
 * @author http://ktko.tistory.com/68
 */
public class DepthFirstSearch {
	private int N = 6;		// 정점 수 
	private int[][] map = new int[N][N]; 		// DFS인접행렬 
	private boolean visit[] = new boolean[N]; 	// 방문여부판별 
	private Stack<Integer> stack;
	
	
	public DepthFirstSearch(){
		// 클래스 생성자
		// 스택 초기화 
		stack = new Stack<Integer>();
		
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

	// DFS 구현 
	public void doDFS(int v){
		visit[v] = true;
		System.out.print(v+" ");
	
		
		for(int i=0; i<N; i++){
			// 노드가 이어져 있고 방분하지 않았을 경우
			if(map[v][i] == 1 && !visit[i]){
				doDFS(i);
			}
		}		
	}
	
	// DFS 구현부분 (모든경로) 
	public void doDFS(int v, int goal){
		visit[v] = true;
	
		stack.push(v);	// stack에 값을 넣는다

	
		// 목표 노드 도달시 스택값을 출력하고 DFS를 빠져나온다 
		if(v == goal){
			int count = stack.size();
			System.out.print("BFS 경로 >> ");
			for(int i=0; i<count; i++){
				System.out.print(stack.elementAt(i)+" ");
			}
			System.out.println("");
			
			stack.pop(); // DFS에서 빠져나온다 
			return;
		}
		
		
		for(int i=0; i<N; i++){
			// 노드가 이어져 있고 방분하지 않았을 경우
			if(map[v][i] == 1 && !visit[i]){
				doDFS(i,goal);
				visit[i] = false;	// DFS에서 빠져나오면 해당노드는 방문하지 않은 것으로 간주 
			}
		}
		
		stack.pop();
	}
	
	
}
