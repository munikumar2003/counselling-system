package com.example.demo.data;

import com.example.demo.model.TrendData;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TrendAnalysisData {

    public List<TrendData> getTrendData(String college, String branch, String category) {
        // In a real application, this data would be fetched from a database based on the provided parameters.
        // The prediction would be the result of a machine learning model.
        TrendData td1 = new TrendData();
        td1.setYear("2020");
        td1.setClosing_rank(1250);

        TrendData td2 = new TrendData();
        td2.setYear("2021");
        td2.setClosing_rank(1180);

        TrendData td3 = new TrendData();
        td3.setYear("2022");
        td3.setClosing_rank(1320);

        TrendData td4 = new TrendData();
        td4.setYear("2023");
        td4.setClosing_rank(1150);

        TrendData td5 = new TrendData();
        td5.setYear("2024");
        td5.setClosing_rank(1080);
        td5.setPredicted(true);

        return Arrays.asList(td1, td2, td3, td4, td5);
    }
}
