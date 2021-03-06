/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum OperationType {
    SUM, //Represents the sum operator
    SUBTRACT, //Represents the subtract operator
    MULTIPLY, //Represents the multiply operator
    DIVIDE; //Represents the divide operator

    private static TreeMap<String, OperationType> valueMap = new TreeMap<String, OperationType>();
    private String value;

    static {
        SUM.value = "SUM";
        SUBTRACT.value = "SUBTRACT";
        MULTIPLY.value = "MULTIPLY";
        DIVIDE.value = "DIVIDE";

        valueMap.put("SUM", SUM);
        valueMap.put("SUBTRACT", SUBTRACT);
        valueMap.put("MULTIPLY", MULTIPLY);
        valueMap.put("DIVIDE", DIVIDE);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationType fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OperationType values to list of string values
     * @param toConvert The list of OperationType values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<OperationType> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (OperationType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 