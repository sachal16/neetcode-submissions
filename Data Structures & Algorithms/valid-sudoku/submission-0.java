class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        //Rows
        for(int i = 0 ; i < 9 ; i++ ){
            HashSet<Character> row = new HashSet<>();
            for(int j =0; j < 9; j++){
                char cell = board[i][j];

                if(cell != '.'){
                    if(row.contains(cell)){
                        return false;
                    }
                    row.add(cell);
                }
                
            }
        }
        

        //Columns
        for(int i =0 ; i < 9 ; i++ ){
            HashSet<Character> columns = new HashSet<>();
                for(int j = 0; j < 9; j++){
                    char cell = board[j][i];

                    if(cell != '.'){
                        if(columns.contains(cell)){
                            return false;
                        }
                        columns.add(cell);
                    }
                
            }
        }
        

        //3x3 boxes
        for(int boxRow= 0; boxRow < 9; boxRow += 3){
            for(int boxCol= 0; boxCol < 9; boxCol += 3){
               HashSet<Character> box = new HashSet<>();
               for(int i = 0; i <3 ; i++){
                for(int j = 0; j < 3 ; j++){
                    char cell = board[boxRow + i][boxCol + j];
                    if(cell != '.'){
                        if(box.contains(cell)){
                            return false;
                        }
                        box.add(cell);
                    }
                }
               }
            }
        }
        return true;
    }
}
