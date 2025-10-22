package com.example.demo.data;

import com.example.demo.model.WaitTimeData;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class WaitTimeAnalysisData {

    public List<WaitTimeData> getWaitTimeData(String college, String branch, String category, int userRank) {
        // In a real application, this data would be fetched from a database based on the provided parameters.
        // The prediction would be the result of a machine learning model.
        WaitTimeData wtd1 = new WaitTimeData();
        wtd1.setCollege("IIT Delhi");
        wtd1.setBranch("Computer Science");
        wtd1.setCategory("General");
        wtd1.setUserRank(1500);
        wtd1.setOpeningRank(45);
        wtd1.setClosingRank(1200);
        wtd1.setExpectedRound(1);
        wtd1.setProbability(85);
        wtd1.setWaitTime("Round 1");
        wtd1.setRiskLevel("low");

        WaitTimeData wtd2 = new WaitTimeData();
        wtd2.setCollege("NIT Trichy");
        wtd2.setBranch("Computer Science");
        wtd2.setCategory("General");
        wtd2.setUserRank(1500);
        wtd2.setOpeningRank(800);
        wtd2.setClosingRank(1800);
        wtd2.setExpectedRound(2);
        wtd2.setProbability(70);
        wtd2.setWaitTime("Round 2-3");
        wtd2.setRiskLevel("medium");

        WaitTimeData wtd3 = new WaitTimeData();
        wtd3.setCollege("BITS Pilani");
        wtd3.setBranch("Computer Science");
        wtd3.setCategory("General");
        wtd3.setUserRank(1500);
        wtd3.setOpeningRank(1200);
        wtd3.setClosingRank(2500);
        wtd3.setExpectedRound(1);
        wtd3.setProbability(90);
        wtd3.setWaitTime("Round 1");
        wtd3.setRiskLevel("low");

        return Arrays.asList(wtd1, wtd2, wtd3);
    }
}
