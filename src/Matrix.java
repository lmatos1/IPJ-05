public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        double[] dot_a = new double[] {1,1,1};
        double[] dot_b = new double[] {1,2,3};
        double dot_out = matrix.dot(dot_a, dot_b);
        System.out.println("Dout product of {1,1,1} and {1,2,3} is "+dot_out);
//
        double[][] transpose_in = new double[][] {{1,2,3},{4,5,6}};
        double[][] transpose_out = matrix.transpose(transpose_in);
        System.out.println("Before transpose");
        matrix.print(transpose_in);
        System.out.println("After transpose");
        matrix.print(transpose_out);
//
        double[][] multiplication_out = matrix.multiply(transpose_in, transpose_out);
        System.out.println("Multiplication of above two matrices");
        matrix.print(multiplication_out);
//
        double[] vm_vector = {1,1,1};
        double[][] vm_matrix = {{1,2,3},{1,2,3},{1,2,3}};
        double[] vm_out = matrix.multiply(vm_vector,vm_matrix);
        System.out.println("Vector-matrix product of {1,1,1} {{1,2,3},{1,2,3} and {1,2,3}}");
        matrix.print(vm_out);
        double[] mv_out = matrix.multiply(vm_matrix,vm_vector);
        System.out.println("Matrix-vector product of {{1,2,3},{1,2,3},{1,2,3}} and {1,1,1}");
        matrix.print(mv_out);
    }
    public void print(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void print(double[] vector) {
        for(int i=0;i<vector.length;i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }

    public double dot(double[] a,double[] b) {
        int min = a.length > b.length ? b.length : a.length;
        double output = 0;
        for(int i=0;i<min;i++) {
            output += a[i]*b[i];
        }
        return output;
    }

    public double[][] transpose(double[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] output = new double[cols][rows];
        for(int i=0;i<cols;i++) {
            for(int j=0;j<rows;j++) {
                output[i][j] = matrix[j][i];
            }
        }
        return output;
    }

    public double[][] multiply(double[][] a,double[][] b){
        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;
        double[][] product = new double[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    public double[] multiply(double[][] matrix, double[] vector) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        double[] result = new double[rows];
        for (int row = 0; row < rows; row++) {
            double sum = 0;
            for (int column = 0; column < columns; column++) {
                sum += matrix[row][column]
                        * vector[column];
            }
            result[row] = sum;
        }
        return result;
    }

    public double[] multiply(double[] vector, double[][] matrix) {
        int rows = vector.length;
        int columns = matrix[0].length;
        double[] result = new double[columns];
        for (int row = 0; row < rows; row++) {
            double sum = 0;
            for (int column = 0; column < columns; column++) {
                sum += matrix[column][row]
                        * vector[column];
            }
            result[row] = sum;
        }
        return result;
    }
}