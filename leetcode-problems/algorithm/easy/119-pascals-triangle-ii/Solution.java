class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
        for (int n = 0; n < rowIndex + 1; n++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int p = 0; p < n + 1; p++) {
                Integer house = checkHouse(n, p, pascalTriangle);
                row.add(house);
            }
            pascalTriangle.add(row);
        }
        return pascalTriangle.get(pascalTriangle.size()-1);
    }

    public Integer checkHouse(int n, int p, List<List<Integer>> pascalTriangle) {
        if (p == 0 || p == n) {
            return 1;
        }

        List<Integer> previousRow = pascalTriangle.get(n-1);
        return previousRow.get(p-1) + previousRow.get(p);
    }
}
