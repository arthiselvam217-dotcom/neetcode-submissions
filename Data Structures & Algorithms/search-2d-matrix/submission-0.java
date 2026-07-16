class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        HashSet<Integer>arthi=new HashSet<>();
       for(int i=0;i<matrix.length;i++)
       {
        for(int j=0;j<matrix[i].length;j++)
        {
            arthi.add(matrix[i][j]);
        }
       }
       return arthi.contains(target);
        
    }
}
