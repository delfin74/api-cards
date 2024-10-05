/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cards.cards;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public class AmexRateStrategy implements RateStrategy{
    @Override
    public double calculateRate(LocalDate expirationDate, double amount) {
        double rate = expirationDate.getMonthValue() * 0.1;
        return amount * (rate / 100);
    }
}
