/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cards.cards;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author Daniel
 */
@RestController
@RequestMapping("/api/v1")
public class RateController {
     // Endpoint para consultar la tasa de una operación
    @PostMapping("/calculate-rate")
    public RateResponse calculateRate(@RequestBody CreditCardRequest request) {
        // Elegir la estrategia según la marca de la tarjeta
        RateStrategy rateStrategy = getRateStrategy(request.getBrand());

        // Si no existe una estrategia para la marca, lanzar excepción
        if (rateStrategy == null) {
            throw new IllegalArgumentException("Invalid card brand");
        }

        // Calcular la tasa usando la estrategia
        double rate = rateStrategy.calculateRate(LocalDate.now(), request.getAmount());

        // Devolver el resultado en un objeto de respuesta
        return new RateResponse(rate);
    }

    // Método auxiliar para obtener la estrategia de tasa según la marca
    private RateStrategy getRateStrategy(String brand) {
        switch (brand.toUpperCase()) {
            case "VISA":
                return new VisaRateStrategy();
            case "NARA":
                return new NaraRateStrategy();
            case "AMEX":
                return new AmexRateStrategy();
            default:
                return null; // Marca no soportada
        }
    }
}
