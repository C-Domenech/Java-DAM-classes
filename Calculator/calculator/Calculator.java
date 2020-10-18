/*
 * Copyright (C) 2020 Cristina Domenech <linkedin.com/in/c-domenech/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.cdomenech.calculator;

/**
 *
 * @author Cristina Domenech <linkedin.com/in/c-domenech/>
 */
public class Calculator {
    /**
     * All the methods that calculate the operations given by the user
     * 
     * @param op1 first operator
     * @param op2 second operator
     * @return result of the operation
     */
    public double add(double op1, double op2) {
        return (op1 + op2);
    }

    public double substract(double op1, double op2) {
        return (op1 - op2);
    }

    public double multiply(double op1, double op2) {
        return (op1 * op2);
    }

    public double divide(double op1, double op2) {
        return (op1 / op2);
    }
    /**
     * Methods that only need one operator
     * 
     * @param op operator
     * @return result of the operation
     */
    public double percentage(double op) {
        return (op / 100);
    }

    public double squareRoot(double op) {
        return (Math.sqrt(op));
    }

    public double square(double op) {
        return (Math.pow(op, 2));
    }

    public double fraction(double op) {
        return (1 / op);
    }
}
