class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int p = 0; p < n + 1; p++) {
                Integer house = checkHouse(n, p, pascalTriangle);
                row.add(house);
            }
            pascalTriangle.add(row);
        }
        return pascalTriangle;
    }

    public Integer checkHouse(int n, int p, List<List<Integer>> pascalTriangle) {
        if (p == 0 || p == n) {
            return 1;
        }

        List<Integer> previousRow = pascalTriangle.get(n-1);
        return previousRow.get(p-1) + previousRow.get(p);
    }
}
