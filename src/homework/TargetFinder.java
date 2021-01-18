package homework;

import java.util.Arrays;

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int aiX = aiCoords[0];
        int aiY = aiCoords[1];

        int index = -1;
        double distance = Double.MAX_VALUE;

        for (int i = 0; i < targets.length; i++) {
            double currentDistance = getDistance(aiX, aiY, targets[i][0], targets[i][1]);
            if (currentDistance < distance) {
                distance = currentDistance;
                index = i;
            }

        }
        return targets[index];
    }

    private double getDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
