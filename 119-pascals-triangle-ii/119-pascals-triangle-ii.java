class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        //1st attempt
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> tempRow,prev = null;
        
        for(int i = 0; i<= rowIndex; i++){
            tempRow = new ArrayList<Integer>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    tempRow.add(1);
                }
                else{
                    tempRow.add(prev.get(j-1) + prev.get(j));
                }
            }
            prev = tempRow;
            if(i == rowIndex){
                row.addAll(tempRow);
            }
        }
        
        return row;
    }
}