class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (rows.get(i) == null || rows.get(i).isEmpty()) {
                    rows.put(i, new HashSet<>());
                    rows.get(i).add(board[i][j]);
                } else if (rows.get(i).contains(board[i][j]))
                    return false;
                else
                    rows.get(i).add(board[i][j]);

                if (cols.get(j) == null || cols.get(j).isEmpty()) {
                    cols.put(j, new HashSet<>());
                    cols.get(j).add(board[i][j]);
                } else if (cols.get(j).contains(board[i][j]))
                    return false;
                else
                    cols.get(j).add(board[i][j]);

                String key = (i / 3) + "," + (j / 3);
                if (square.get(key) == null || square.get(key).isEmpty()) {
                    square.put(key, new HashSet<>());
                    square.get(key).add(board[i][j]);
                } else if (square.get(key).contains(board[i][j]))
                    return false;
                else
                    square.get(key).add(board[i][j]);
            }
        }
        return true;
    }
}
