class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        //1st attempt : brute force
        
        List<Integer> res = new ArrayList<Integer>();
        
        int top =0;
        int down = mat.length -1;
        int left = 0;
        int right = mat[0].length -1;
        
        int dir = 0;
        
        while(top <= down && left <= right){
            switch(dir){
                case 0 -> {
                    for(int i = left; i<= right; i++) res.add(mat[top][i]);
                    top++;
                }
                case 1 -> {
                    for(int i = top; i<= down; i++) res.add(mat[i][right]);
                    right--;  
                }
                case 2 -> {
                    for(int i = right; i>= left; i--) res.add(mat[down][i]);
                    down--;  
                }
                case 3 -> {
                    for(int i = down; i>= top; i--) res.add(mat[i][left]);
                    left++;  
                }
                    
            }
            // System.out.print(top+" "+right+" "+down+" "+left+" | ");
            dir = (dir+1)%4;
            // System.out.println(dir);
        }
        
        return res;
    }
}