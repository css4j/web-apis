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
 * Implemented by all the numeric CSS values.
 */
public interface CSSNumericValue extends CSSStyleValue {

	enum CSSNumericBaseType {
		/** &lt;length&gt; */
		length,
		/** &lt;angle&gt; */
		angle,
		/** &lt;time&gt; */
		time,
		/** &lt;frequency&gt; */
		frequency,
		/** &lt;resolution&gt; */
		resolution,
		/** &lt;flex&gt; */
		flex,
		/** &lt;percentage&gt; */
		percent
	}

	/**
	 * A "map" from types to powers.
	 */
	interface CSSNumericType {

		/**
		 * Get the powers of length in the value.
		 * 
		 * @return the powers of length.
		 */
		int getLength();

		/**
		 * Get the powers of angle in the value.
		 * 
		 * @return the powers of angle.
		 */
		int getAngle();

		/**
		 * Get the powers of time in the value.
		 * 
		 * @return the powers of time.
		 */
		int getTime();

		/**
		 * Get the powers of frequency in the value.
		 * 
		 * @return the powers of frequency.
		 */
		int getFrequency();

		/**
		 * Get the powers of resolution in the value.
		 * 
		 * @return the powers of resolution.
		 */
		int getResolution();

		/**
		 * Get the powers of flex in the value.
		 * 
		 * @return the powers of flex.
		 */
		int getFlex();

		/**
		 * Get the powers of percent in the value.
		 * 
		 * @return the powers of percent.
		 */
		int getPercent();

		/**
		 * Get the percent-hint.
		 * 
		 * @return the percent-hint.
		 */
		CSSNumericValue.CSSNumericBaseType getPercentHint();
	}

	/**
	 * Converts this value into one in the given unit.
	 * 
	 * @param unit the unit.
	 * @return the new converted value,
	 */
	CSSUnitValue to(String unit);

	/**
	 * A representation of the type of this value.
	 * 
	 * @return a representation of the type of this value.
	 */
	CSSNumericType type();

}
