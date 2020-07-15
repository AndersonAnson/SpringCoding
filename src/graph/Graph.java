package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
	private ArrayList<String> vertexList;// 顶点用arraylist存储
	private int[][] edges;
	private int numOfEdges;
	private boolean[] isVisited;

	public Graph(int n) {
		edges = new int[n][n];
		vertexList = new ArrayList<String>(n);
		numOfEdges = 0;
		isVisited = new boolean[n];
	}

	// 对一个节点进行深度优先遍历算法
	public void dfs(boolean[] isVisited, int i) {
		System.out.println(this.getValueByIndex(i) + "->");
		isVisited[i] = true;
		int w = this.getFirstNeighbor(i);
		while (w != -1) {
			// 如果没有被访问
			if (!isVisited[w]) {
				dfs(isVisited, w);
			}
			w = this.getNextNeighbor(i, w);
		}
	}

	// 对所有的结点进行深度优先遍历
	public void dfs() {
		for (int i = 0; i < this.getVertexNumber(); i++) {
			if (!isVisited[i]) {
				dfs(isVisited, i);
			}
		}
	}

	// 一个结点进行广度优先遍历
	public void bfs(boolean[] isVisited, int i) {
		int u;// 表示队列的头结点对应的下标
		int w;// 邻接结点w
		LinkedList<Integer> queue = new LinkedList<>();
		System.out.println(this.getValueByIndex(i) + "->");
		isVisited[i] = false;
		queue.addLast(i);
		while (!queue.isEmpty()) {
			// 取出队列的头结点下表
			u = queue.removeFirst();
			// 得到第一个邻接节点的下表w
			w = this.getFirstNeighbor(u);
			if (w != -1) {
				if (!isVisited[w]) {
					System.out.println(this.getValueByIndex(w) + "->");
					isVisited[w] = true;
					queue.addLast(w);
				}
				w = this.getNextNeighbor(u, w);// 体现出我们的广度优先算法
			}
		}
	}

	// 遍历所有的结点
	public void bfs() {
		for (int i = 0; i < vertexList.size(); i++) {
			if (!isVisited[i]) {
				bfs(isVisited, i);
			}
		}
	}

	public int getFirstNeighbor(int index) {
		for (int j = 0; j < vertexList.size(); j++) {
			if (edges[index][j] > 1) {
				return j;
			}
		}
		return -1;
	}

	// 根据前一个邻接节点的下表来获取下一个邻接节点
	public int getNextNeighbor(int v1, int v2) {
		for (int j = v2 + 1; j < vertexList.size(); j++) {
			if (edges[v1][j] > 0) {
				return j;
			}
		}
		return -1;
	}

	// 插入节点
	public void insertVertex(String vertex) {
		vertexList.add(vertex);
	}

	// 添加边
	public void addEdge(int v1, int v2, int weight) {
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
		numOfEdges++;
	}

	// 返回节点的个数
	public int getVertexNumber() {
		return vertexList.size();
	}

	public int getNumOfEdges() {
		return this.numOfEdges;
	}

	public String getValueByIndex(int i) {
		return vertexList.get(i);
	}

	public int getWeight(int v1, int v2) {
		return edges[v1][v2];
	}

	// 显示图
	public void show() {
		for (int[] link : edges) {
			System.err.println(Arrays.toString(link));
		}
	}

}
