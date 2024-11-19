class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> candy = new ArrayList<Boolean>();
        int higherNumber = 0;

        for (int c : candies) {
            if (c > higherNumber) {
                higherNumber = c;
            }
        }

        for (int c : candies) {
            candy.add(c + extraCandies >= higherNumber);
        }

        return candy;
    }
}
