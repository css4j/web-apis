/*
 * Interfaces defined by CSS Typed Object Model draft
 *  (https://www.w3.org/TR/css-typed-om-1/).
 * Copyright © 2018-2023 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/*
 * SPDX-License-Identifier: W3C-20150513
 */
package org.w3c.css.om.typed;

/**
 * Numeric values that can be expressed as a single unit (or a naked number or
 * percentage).
 */
public interface CSSUnitValue extends CSSNumericValue {

	/**
	 * Gets the numeric value in the units represented by this object.
	 * 
	 * @return the numeric value.
	 */
	double getValue();

	/**
	 * Set the numeric value in the units represented by this object.
	 * 
	 * @param value the numeric value.
	 */
	void setValue(double value);

	/**
	 * Gets the unit string.
	 * 
	 * @return the unit string.
	 */
	String getUnit();

}
