package deprecated.stackqueue;

import java.util.*;
import java.util.stream.Collectors;

public class Truck {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Integer> truckWeights = Arrays.stream(truck_weights)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        LinkedList<Integer> crossingBridges = new LinkedList<>();
        Map<Integer, Integer> bridgeLenght = new HashMap<>();
        List<Integer> crossedBridges = new ArrayList<>();

        int second = 1;
        int index = 0;
        while (crossedBridges.size() < truck_weights.length) {
            int totalWeightOnBridge = crossingBridges.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            if (!truckWeights.isEmpty() && totalWeightOnBridge + truckWeights.getFirst() <= weight) {
                if (!truckWeights.isEmpty()) {
                    crossingBridges.offerLast(truckWeights.pollFirst());
                    bridgeLenght.put(index, bridge_length);
                    index++;
                }
            }

            ++second;
            for (final Map.Entry<Integer, Integer> entry : bridgeLenght.entrySet()) {
                entry.setValue(entry.getValue() - 1);
                if (entry.getValue() == 0) {
                    crossedBridges.add(crossingBridges.pollFirst());
                }
            }
        }

        bridgeLenght.clear();
        return second;
    }
}
