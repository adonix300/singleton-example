package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source)  {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer num : source) {
            if (num >= treshold) {
                result.add(num);
                logger.log("Проходит: " + num);
            } else {
                logger.log("Не проходит: " + num);
            }
        }
        return result;
    }
}
