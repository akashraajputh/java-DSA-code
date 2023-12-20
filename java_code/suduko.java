import java.util.*;

class sudoco {
    public boolean helper(char[][] board,int row, int col){
        int nrow=0;
        int ncol = 0;
        if(col == board.length-1){
            nrow= nrow+1;
            ncol =0;
    
        }else{
            nrow = row;
            ncol = col+1;
        }
        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }else{
            //fill the place
            for(int i=1;i<=9;i++){
                if(issafe(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if()
                }
            }
        }
    }

}
