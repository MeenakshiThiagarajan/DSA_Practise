package com.bumblebee.dunzo;

import java.util.List;

public class MudConcrete {

    public int returnMaxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
        int n = wallPositions.size();
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            int hDiff = Math.abs((wallHeights.get(i + 1) - wallHeights.get(i)));
            int gapLen = wallPositions.get(i + 1) - wallPositions.get(i) - 1;
            int localMax = 0;
            if (gapLen > hDiff) {
                int low = Math.max(wallHeights.get(i + 1), wallHeights.get(i)) + 1;
                int remGap = gapLen - hDiff - 1;
                localMax = low + remGap / 2;
            } else {
                localMax = Math.min(wallHeights.get(i + 1), wallHeights.get(i)) + gapLen;
            }
            result = Math.max(result, localMax);
        }
        return result;
    }

}
