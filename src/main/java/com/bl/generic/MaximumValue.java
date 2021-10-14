package com.bl.generic;

public class MaximumValue {
	/**
	 * Find Integer maximum value
	 *//*
	public Integer findMax(Integer value1, Integer value2, Integer value3) {
		Integer max = value1;
		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		System.out.println("Maximum Integer number is " + max);
		return max;
	}

	*//**
	 * Find float maximum value
	 *//*
	public Float findMax(Float value1, Float value2, Float value3) {
		// TODO Auto-generated method stub
		Float max = value1;
		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		System.out.println("Maximum Integer number is " + max);
		return max;
	}

	public String findMax(String value1, String value2, String value3) {
		// TODO Auto-generated method stub
		String max = value1;
		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		System.out.println("Maximum Integer number is " + max);
		return max;
	}*/
	
	 /**
     * Generic Method
     */
    public <T extends Comparable<T>> T findMax(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        System.out.println("Maximum Integer number is " + max);
        return max;
    }
    public static void main(String[] args) {
		MaximumValue max = new MaximumValue();
		max.findMax(2.3, 1.3, 2.5);
	}
}
