class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //1st attempt :
        int temp = 0;
        
        for(int[] row : image){
            
            for(int i = 0; i<(row.length)/2; i++){
                int j=row.length-i-1;
                temp = row[i];
                row[i] = row[j];
                row[j] = temp;
                
                row[i] ^= 1;
                row[j] ^= 1;
                
                
            }
            if(row.length %2 == 1)
                row[row.length/2] ^= 1;
                
                
                
        }
        
        
        
//         for(int i = 0; i<image.length;i++){
//             for(int j = 0; j<image.length;j++){
//                 if(image[i][j] == 0){
//                     image[i][j] = 1;
//                 }
//                 else if(image[i][j] == 1){
//                     image[i][j] = 0;
//                 }
                
//                 // System.out.print(image[i][j]+" ");
                    
//             }
//             // System.out.println("");
//         }
        
        

        return image;
    }
}