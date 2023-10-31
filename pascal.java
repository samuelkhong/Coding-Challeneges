class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        pascalFiller(pascal, 1, numRows);


        return pascal;

    
 
    }

    public void pascalFiller(List<List<Integer>> triangle, int currentRow, int finalRow) {
        // base case: end recursion if current and final row are the same
        if (currentRow > finalRow) {
            return;
        }
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        
        if (currentRow == 2) {
            row.add(1);
        }

        if (currentRow > 2) {
            List<Integer> previousRow = triangle.get(currentRow - 2);
            for (int i = 1; i < previousRow.size(); i++) {
                int temp = previousRow.get(i - 1) + previousRow.get(i);
                row.add(temp);
            }
            row.add(1);
        }
        

        // add the new row to the Pascal triangle
        triangle.add(row);

        // repeat by going to the next row
        pascalFiller(triangle, currentRow + 1, finalRow);
    }
}