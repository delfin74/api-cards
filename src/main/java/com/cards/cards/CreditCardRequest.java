/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cards.cards;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author Daniel
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardRequest {
    private String brand;  // Marca de la tarjeta (VISA, NARA, AMEX)
    private double amount; // Importe de la operación
}
