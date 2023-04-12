package com.finalproject.adephagia.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.function.Function;

import static com.finalproject.adephagia.util.LengthUnit.*;
import static com.finalproject.adephagia.util.SingularUnit.*;
import static com.finalproject.adephagia.util.TemperatureUnit.*;
import static com.finalproject.adephagia.util.VolumetricUnit.*;
import static com.finalproject.adephagia.util.WeightUnit.*;

public class ConversionValues {
    private final Map<Unit, Function<Float, Float>> conversionMap = Map.of(
            M, ConversionValues::meterToMeter,
            IN, ConversionValues::inchesToMeter,
            FT, ConversionValues::footToMeter,
            YRD, ConversionValues::yardToMeter,
            MI, ConversionValues::mileToMeter,
            SLICE, ConversionValues::sliceToPiece,
            PIECE, ConversionValues::peiceToPiece,
            F, ConversionValues::fahrenheitToCelsius,
            C, ConversionValues::celsiusToCelsius
            K, ConversionValues::kelvinToCelsius,
            L, ConversionValues::literToLiter,
            FL_OZ, ConversionValues::fluidOunceToLiter,
            PINT, ConversionValues::pintToLiter,
            QUART, ConversionValues::quartToLiter,
            GAL, ConversionValues::gallonToLiter,
            CUP, ConversionValues::cupToLiter,
            TBSP, ConversionValues::tablespoonToLiter,
            TSP, ConversionValues::teaspoonToLiter,
            PINCH, ConversionValues::pinchToLiter
            DASH, ConversionValues::dashToLiter,
            DUSTING, ConversionValues::dustingToLiter,
            G, ConversionValues::gramToGram,
            OZ, ConversionValues::ounceToGram,
            LB, ConversionValues::poundtoGram,
            ST, ConversionValues::stoneToGram,
            T, ConversionValues::tonToGram
    );

    public static Float meterToMeter(Float quantity) {
        return quantity;
    }

    public static Float inchesToMeter(Float quantity) {
        return BigDecimal.valueOf(quantity).divide(BigDecimal.valueOf(39.37), RoundingMode.CEILING).floatValue();
    }
}