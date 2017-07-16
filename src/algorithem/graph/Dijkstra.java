package algorithem.graph;

public class Dijkstra {
	private static int nCount;		// 노드의 수 			
	private static int maps[][];	// 노드간의 가중치 변수
	
	public Dijkstra(int count){
		this.nCount  = count;
		maps = new int[nCount+1][nCount+1];
	}
	
	public void input(int vt1, int vt2, int v){
		maps[vt1][vt2] = v;
		maps[vt2][vt1] = v;
	}
	
	public static void doDijkstra(int v){
		
		int distance[] = new int[nCount+1];
		boolean[] check = new boolean[nCount+1];
		
		// distance 초기화  
		for(int i=0; i<nCount+1; i++){
			distance[i] = Integer.MAX_VALUE;
		}
		
		// 시작노드값 초기화  
		distance[v] = 0;
		check[v] = true;
		
		// 연결 노드 distance 갱신  
		for(int i=1; i<nCount+1; i++){
			if(!check[i] && maps[v][i] != 0){
				distance[i] = maps[v][i];
			}
		}
		
		
		for(int a=0; a<nCount-1; a++){
			// 모든 노드가 true가 될때까지 확인 
			int min = Integer.MAX_VALUE;
			int minIdx = -1;
			
			// 최소값 찾기  
			for(int i=1; i<nCount+1; i++){
				if(!check[i] && distance[i] != Integer.MAX_VALUE){
					if(distance[i]<min){
						min = distance[i];
						minIdx = i;
					}
				}
			}
			
			check[minIdx] = true; 	// 최소인 노드 체크값 true로 변경 
			
			for(int i=1; i<nCount+1; i++){
				if(!check[i] && maps[minIdx][i] != 0){
					if(distance[i]>distance[minIdx]+maps[minIdx][i]){
						distance[i] = distance[minIdx]+maps[minIdx][i];
					}
				}
			}
		}
		
		for(int i=1; i<nCount+1; i++){
			System.out.print(distance[i]+ " ");
		}
		System.out.println("");
	}
}
