package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BalancedPredictor;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Maccoy");
        Customer danielek = new IndividualYoungCustomer("Daniel Craig");
        Customer nft = new CorporateCustomer("NFT");
        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should buy: " + stevenShouldBuy);
        String danielekShouldBuy = danielek.predict();
        System.out.println("Daniel should buy " + danielekShouldBuy);
        String nftShouldBuy = nft.predict();
        System.out.println("Nft should buy: " + nftShouldBuy);
        //Then
        assertEquals("[Aggressive Predictor} Buy stock of XYZ", stevenShouldBuy);
        assertEquals("[Conservative predictor] Buy debentures of XYZ",danielekShouldBuy);
        assertEquals("[Balanced Predictor] Buy shared units of Fund XYZ",nftShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Maccoy");
        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should buy: " + stevenShouldBuy);
        steven.setBuyPredictor(new BalancedPredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should buy: " + stevenShouldBuy);
        //Then
        assertEquals("[Balanced Predictor] Buy shared units of Fund XYZ",stevenShouldBuy);
    }

}