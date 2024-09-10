package DSA.Graph;

class Matrix{

    int vertix;
    int[][] adjustMatrix;

    Matrix(int vertix){
        this.vertix = vertix;
        adjustMatrix = new int[vertix][vertix];

        for (int i = 0 ;i < adjustMatrix.length; i++){
            for(int j = 0 ; j < adjustMatrix[i].length ; j++){
                if( i == j){
                    addEdge(i,j);
                }
            }
            System.out.println();
        }
    }


    public void addEdge(int source , int destination){
        adjustMatrix[source][destination] = 1;
    }

    void print(){

        for (int i = 0 ;i < adjustMatrix.length; i++){
            for(int j = 0 ; j < adjustMatrix[i].length ; j++){
                System.out.print(adjustMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

public class GraphMatrix {
    public static void main(String[] args) {
        Matrix graph = new Matrix(5);
        graph.print();
    }
}
