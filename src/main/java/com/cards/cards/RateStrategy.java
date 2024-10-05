/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cards.cards;

import java.time.LocalDate;

/**
 *
 * @author Daniel
 */
public interface RateStrategy {
    double calculateRate(LocalDate expirationDate, double amount);
}
