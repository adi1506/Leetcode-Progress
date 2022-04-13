class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //1st attempt :
//         int temp = 0;
        
//         //looping over the matrix
//         for(int[] row : image){
//             //swapping the values for each row from front and back
//             for(int i = 0; i<(row.length)/2; i++){
//                 int j=row.length-i-1;
//                 temp = row[i];
//                 row[i] = row[j];
//                 row[j] = temp;
                
//                 //using XOR bitwise operator to convert 1 to 0 and vice versa
//                 row[i] ^= 1;
//                 row[j] ^= 1;
                
                
//             }
//             if(row.length %2 == 1)
//                 row[row.length/2] ^= 1;
                
//         }
        
        
        
//         for(int i = 0; i<image.length;i++){
//             for(int j = 0; j<image.length;j++){
//                 if(image[i][j] == 0){
//                     image[i][j] = 1;
//                 }
//                 else if(image[i][j] == 1){
//                     image[i][j] = 0;
//                 }
                
//             }
//             
//         }
        // return image;
        
        //2nd attempt: very short and beautiful answer
        int n = image.length;
        
        for(int[] row : image){
            for(int i =0; i *2 < n; i++){
                if(row[i] == row[n-i-1])
                    row[i] = row[n-i-1]  ^= 1;
            }
        }
        
        return image;
        
        

        
    }
}