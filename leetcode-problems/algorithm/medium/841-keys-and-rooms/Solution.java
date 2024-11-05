class Solution {
    Boolean[] opensRooms;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        opensRooms = new Boolean[rooms.size()];
        Arrays.fill(opensRooms, false);
        openRoom(0, rooms);
        return Arrays.stream(opensRooms).allMatch(open -> open);
    }

    public void openRoom(Integer current, List<List<Integer>> rooms) {
        List<Integer> room = rooms.get(current);
        opensRooms[current] = true;
        for (Integer key : room) {
            if (opensRooms[key] == false) {
                openRoom(key, rooms);
            }
        }
    }
}
