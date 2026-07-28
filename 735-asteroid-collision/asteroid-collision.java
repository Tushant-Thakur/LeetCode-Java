class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();
        boolean destroyed = false;

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                list.add(asteroid);
            } else {
                while (!list.isEmpty() &&
                       list.get(list.size() - 1) > 0 &&
                       list.get(list.size() - 1) <= Math.abs(asteroid)) {

                    if (list.get(list.size() - 1) == Math.abs(asteroid)) {
                        list.remove(list.size() - 1);
                        destroyed = true;
                        break;
                    }

                    list.remove(list.size() - 1);
                }

                if ((list.isEmpty() || list.get(list.size() - 1) < 0) && !destroyed) {
                    list.add(asteroid);
                }

                destroyed = false;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}