class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int top = 0;
        int down = n-1;
        int left = 0;
        int right = n-1;
        
        int dir = 0;
        
        int ctr = 1;
        
        while(top <= down && left <= right){
            switch(dir){
                    case 0 -> {
                        for(int i = left; i<= right; i++){
                            res[top][i] = ctr;
                            ctr++;
                        }
                        top++;
                    }
                    case 1 -> {
                        for(int i = top; i<= down; i++){
                            res[i][right] = ctr;
                            ctr++;
                        }
                        right--;
                    }
                    case 2 -> {
                        for(int i = right; i>= left; i--){
                            res[down][i] = ctr;
                            ctr++;
                        }
                        down--;
                    }
                    case 3 -> {
                        for(int i = down; i>= top; i--){
                            res[i][left] = ctr;
                            ctr++;
                        }
                        left++;
                    }
            }
            dir = (dir+1) % 4;
        }
        return res;
    }
}