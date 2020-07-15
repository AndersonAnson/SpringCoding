package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
	private ArrayList<String> vertexList;// ������arraylist�洢
	private int[][] edges;
	private int numOfEdges;
	private boolean[] isVisited;

	public Graph(int n) {
		edges = new int[n][n];
		vertexList = new ArrayList<String>(n);
		numOfEdges = 0;
		isVisited = new boolean[n];
	}

	// ��һ���ڵ����������ȱ����㷨
	public void dfs(boolean[] isVisited, int i) {
		System.out.println(this.getValueByIndex(i) + "->");
		isVisited[i] = true;
		int w = this.getFirstNeighbor(i);
		while (w != -1) {
			// ���û�б�����
			if (!isVisited[w]) {
				dfs(isVisited, w);
			}
			w = this.getNextNeighbor(i, w);
		}
	}

	// �����еĽ�����������ȱ���
	public void dfs() {
		for (int i = 0; i < this.getVertexNumber(); i++) {
			if (!isVisited[i]) {
				dfs(isVisited, i);
			}
		}
	}

	// һ�������й�����ȱ���
	public void bfs(boolean[] isVisited, int i) {
		int u;// ��ʾ���е�ͷ����Ӧ���±�
		int w;// �ڽӽ��w
		LinkedList<Integer> queue = new LinkedList<>();
		System.out.println(this.getValueByIndex(i) + "->");
		isVisited[i] = false;
		queue.addLast(i);
		while (!queue.isEmpty()) {
			// ȡ�����е�ͷ����±�
			u = queue.removeFirst();
			// �õ���һ���ڽӽڵ���±�w
			w = this.getFirstNeighbor(u);
			if (w != -1) {
				if (!isVisited[w]) {
					System.out.println(this.getValueByIndex(w) + "->");
					isVisited[w] = true;
					queue.addLast(w);
				}
				w = this.getNextNeighbor(u, w);// ���ֳ����ǵĹ�������㷨
			}
		}
	}

	// �������еĽ��
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

	// ����ǰһ���ڽӽڵ���±�����ȡ��һ���ڽӽڵ�
	public int getNextNeighbor(int v1, int v2) {
		for (int j = v2 + 1; j < vertexList.size(); j++) {
			if (edges[v1][j] > 0) {
				return j;
			}
		}
		return -1;
	}

	// ����ڵ�
	public void insertVertex(String vertex) {
		vertexList.add(vertex);
	}

	// ��ӱ�
	public void addEdge(int v1, int v2, int weight) {
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
		numOfEdges++;
	}

	// ���ؽڵ�ĸ���
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

	// ��ʾͼ
	public void show() {
		for (int[] link : edges) {
			System.err.println(Arrays.toString(link));
		}
	}

}
