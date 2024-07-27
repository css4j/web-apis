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
 * Represents the CSS lch() function.
 */
public interface CSSLCH extends CSSColorValue {

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
	 * Gets the value of the {@code c} component.
	 * 
	 * @return the {@code c} component.
	 */
	CSSNumericValue getC();

	/**
	 * Sets the {@code c} component as a percentage.
	 * 
	 * @param c the {@code c} component as a percentage.
	 */
	void setC(double c);

	/**
	 * Sets the {@code c} component.
	 * 
	 * @param c the {@code c} component.
	 * @throws DOMSyntaxException if the component is not a &lt;percentage&gt;
	 */
	void setC(CSSNumericValue c) throws DOMSyntaxException;

	/**
	 * Gets the value of the {@code h} component.
	 * 
	 * @return the {@code h} component.
	 */
	CSSNumericValue getH();

	/**
	 * Sets the {@code h} component as an angle in degrees.
	 * 
	 * @param h the {@code h} component in degrees.
	 */
	void setH(double h);

	/**
	 * Sets the {@code h} component.
	 * 
	 * @param h the {@code h} component.
	 * @throws DOMSyntaxException if the component is not an &lt;angle&gt;
	 */
	void setH(CSSNumericValue h) throws DOMSyntaxException;

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
