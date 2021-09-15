package com.bumblebee.week8;

/*
* You have an old grocery shop that instead of scanning their sold proudcts once sold, they type in the prices,
* which leaves room for mistyping sold prices. Given 4 lists:
* soldItems = ["eggs", "milk", "apple"],
* soldPrices = [1.00, 2.50, 2.1],
* productsAvailable = ["eggs", "lemons", "milk", "apple"],
* productPrices = [1.01, 0.5, 2.50, 2.1], Find the number of items with mistyped prices
* */

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FindMistypedProducts {
    @Test
    public void test1(){
        String[] soldItems1 = {"eggs", "milk", "apple"};
        Double[] soldPrices1 = {1.00, 2.50, 2.1};
        String[] productsAvailable1 = {"eggs", "lemons", "milk", "apple"};
        Double[] productPrices1 = {1.01, 0.5, 2.50, 2.1};
        List<String> soldItems = Arrays.asList(soldItems1);
        List<Double> soldPrices = Arrays.asList(soldPrices1);
        List<String> productsAvailable = Arrays.asList(productsAvailable1);
        List<Double> productPrices = Arrays.asList(productPrices1);
        Assert.assertEquals(1,findMistypedPrices(soldItems, soldPrices, productsAvailable,productPrices));
    }

    private int findMistypedPrices(List<String> soldItems, List<Double> soldPrices, List<String> productsAvailable, List<Double> productPrices) {
        int count = 0;
        Map<String, Double> map = new HashMap<>();
        for(int i=0; i<productPrices.size(); i++){
            map.put(productsAvailable.get(i),productPrices.get(i));
        }
        for (int i = 0; i < soldItems.size(); i++) {
            if(map.containsKey(soldItems.get(i))){
                if(!map.get(soldItems.get(i)).equals(soldPrices.get(i))) count++;
            }
        }
        return count;
    }
}

