package Algorlism;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphExample1 {
    int vertex;
    LinkedList<Integer> adjList[];
    LinkedList<Integer> queue;
    boolean visited[];

    public GraphExample1(int n) {
        vertex = n;
        visited = new boolean[vertex];
        adjList = new LinkedList[vertex];
        for(int i = 0; i<vertex; i++){
            adjList[i] = new LinkedList<>();
        }
        queue = new LinkedList<>();
    }

    void addEdge(int i, int j) {
        //양방향 그래프
        adjList[i].add(j);
        adjList[j].add(i);
    }

    void BFS(int x){
        //시작점을 큐에다 삽입
        queue.add(x);

        //시작점 색칠
        visited[x] = true;

        //BFS start
        while(queue.size() != 0){
            //큐에서 하나 뺌, 얘가 현재 우리의 위치
            int now = queue.poll();
            System.out.print(now + " ");

            //인접한 모든 정점에게 방문했는지 물어보고 방문을 하지 않았다면 색칠, 큐에 삽입한다.
            Iterator<Integer> iterator = adjList[now].iterator();

            while(iterator.hasNext()){
                int nextNode = iterator.next();

                if(visited[nextNode] == false){
                    visited[nextNode] = true;
                    queue.add(nextNode);
                }
                //모두 완료했다면 다시 3으로 돌아감
            }
        }
    }

    public static void main(String[] args) {
        GraphExample1 graph = new GraphExample1(9);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,5);
        graph.addEdge(2,6);
        graph.addEdge(3,4);
        graph.addEdge(3,6);
        graph.addEdge(3,7);
        graph.addEdge(4,5);
        graph.addEdge(6,7);
        graph.addEdge(7,8);
        graph.BFS(0);

    }
}
