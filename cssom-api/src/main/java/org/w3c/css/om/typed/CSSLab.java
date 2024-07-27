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

import org.w3c.api.DOMSyntaxException;

/**
 * Represents the CSS lab() function.
 */
public interface CSSLab extends CSSColorValue {

	/**
	 * Gets the value of the {@code l} component.
	 * 
	 * @return the {@code l} component.
	 */
	CSSNumericValue getL();

	/**
	 * Sets the {@code l} component as a percentage.
	 * 
	 * @param l the {@code l} component as a percentage.
	 */
	void setL(double l);

	/**
	 * Sets the {@code l} component.
	 * 
	 * @param l the {@code l} component.
	 * @throws DOMSyntaxException if the component is not a &lt;percentage&gt;
	 */
	void setL(CSSNumericValue l) throws DOMSyntaxException;

	/**
	 * Gets the value of the {@code a} component.
	 * 
	 * @return the {@code a} component.
	 */
	CSSNumericValue getA();

	/**
	 * Sets the {@code a} component.
	 * 
	 * @param a the {@code a} component.
	 */
	void setA(double a);

	/**
	 * Sets the {@code a} component.
	 * 
	 * @param a the {@code a} component.
	 * @throws DOMSyntaxException if the component is not a &lt;number&gt;
	 */
	void setA(CSSNumericValue a) throws DOMSyntaxException;

	/**
	 * Gets the value of the {@code b} component.
	 * 
	 * @return the {@code b} component.
	 */
	CSSNumericValue getB();

	/**
	 * Sets the {@code b} component.
	 * 
	 * @param b the {@code b} component.
	 */
	void setB(double b);

	/**
	 * Sets the {@code b} component.
	 * 
	 * @param b the {@code b} component.
	 * @throws DOMSyntaxException if the component is not a &lt;number&gt;
	 */
	void setB(CSSNumericValue b) throws DOMSyntaxException;

	/**
	 * Gets the value of the {@code alpha} component.
	 * 
	 * @return the {@code alpha} component.
	 */
	CSSNumericValue getAlpha();

	/**
	 * Sets the alpha channel as a percentage.
	 * 
	 * @param alpha the alpha channel as a percentage.
	 */
	void setAlpha(double alpha);

	/**
	 * Sets the alpha channel.
	 * 
	 * @param alpha the alpha channel.
	 * @throws DOMSyntaxException if alpha is not a percentage.
	 */
	void setAlpha(CSSNumericValue alpha) throws DOMSyntaxException;

}
