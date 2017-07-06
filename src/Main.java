import java.util.*;

/**
 * alibaba 测验
 */
public class Main {

        public static void main(String[] args) {

        ArrayList<Integer> _ids = new ArrayList<Integer>();
        ArrayList<Integer> _parents = new ArrayList<Integer>();
        ArrayList<Integer> _costs = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (line != null && !line.isEmpty()) {
            if (line.trim().equals("0")) break;
            String[] values = line.trim().split(" ");
            if (values.length != 3) {
                break;
            }
            _ids.add(Integer.parseInt(values[0]));
            _parents.add(Integer.parseInt(values[1]));
            _costs.add(Integer.parseInt(values[2]));
            line = in.nextLine();
        }
        int res = resolve(_ids, _parents, _costs);

        System.out.println(String.valueOf(res));
    }

    // write your code here
    public static int resolve(ArrayList<Integer> ids, ArrayList<Integer> parents, ArrayList<Integer> costs) {
        Map<Integer, Integer> idToValue = new HashMap<Integer, Integer>();
        int count = 0;
        for (Integer parent : parents) {
            if (parent != 0) {
                int index = ids.lastIndexOf(parent);
                if (idToValue.get(parent) == null) {//第一次放入
                    idToValue.put(parent, costs.get(index) + costs.get(count));
                } else {
                    Integer value = costs.get(index) + costs.get(count);
                    if (idToValue.get(parent) > value) {
                        continue;
                    } else {
                        idToValue.put(parent, costs.get(index) + costs.get(count));
                    }
                }
            }
            if (parent == 0) {
                Integer value = costs.get(count);
                if (idToValue.get(0) != null) {
                    if (idToValue.get(0) > value) {
                        continue;
                    } else {
                        idToValue.put(0, value);
                    }
                } else {
                    idToValue.put(0, value);
                }
            }
            count++;
        }
        int maxValue = 0;
        Iterator<Map.Entry<Integer, Integer>> entries = idToValue.entrySet().iterator();
        while (entries.hasNext()) {
            int nextValue = entries.next().getValue();
            if (nextValue > maxValue) {
                maxValue = nextValue;
            }
        }
        return maxValue;
    }
}