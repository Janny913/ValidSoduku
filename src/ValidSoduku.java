import java.util.HashSet;

/**
 * Created by jianiyang on 16/7/13.
 */
public class ValidSoduku {
    public static boolean isValidSoduku(char[][] board){
        HashSet<Character> set = new HashSet<Character>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;

                set.add(board[i][j]);
            }
            set.clear();
        }
        //set.clear();

        for(int j = 0; j < 9; j++){
            for(int i = 0; i < 9; i++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;

                set.add(board[i][j]);
            }
            set.clear();
        }
        //set.clear();

        for(int k = 0; k < 9; k++){
            for(int i = k/3*3; i < k/3*3+3; i++){
                for(int j = (k%3)*3; j < (k%3)*3+3; j++){
                    if(board[i][j] == '.') continue;
                    if(set.contains(board[i][j])) return false;

                    set.add(board[i][j]);
                }
            }
            set.clear();
        }
        //set.clear();

        return true;
    }

    public static void main(String[] args){
        char[][]  input = {
                {'.','8','7','6','5','4','3','2','1'},
                {'2','.','.','.','.','.','.','.','.'},
                {'2','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','.','.'},
                {'6','.','.','.','.','.','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'8','.','.','.','.','.','.','.','.'},
                {'9','.','.','.','.','.','.','.','.'},
        };

        boolean flag = isValidSoduku(input);
        System.out.println(flag);
    }
}
