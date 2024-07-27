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
 * Represents the CSS rgb()/rgba() functions.
 */
public interface CSSRGB extends CSSColorValue {

	/**
	 * Gets the value of the {@code r} component.
	 * 
	 * @return the {@code r} component.
	 */
	CSSNumericValue getR();

	/**
	 * Sets the {@code r} component as a percentage.
	 * 
	 * @param r the {@code r} component as a percentage.
	 */
	void setR(double r);

	/**
	 * Sets the {@code r} component.
	 * 
	 * @param r the {@code r} component.
	 * @throws DOMSyntaxException if the component is not a &lt;number&gt; or
	 *                         &lt;percentage&gt;
	 */
	void setR(CSSNumericValue r) throws DOMSyntaxException;

	/**
	 * Gets the value of the {@code g} component.
	 * 
	 * @return the {@code g} component.
	 */
	CSSNumericValue getG();

	/**
	 * Sets the {@code g} component as a percentage.
	 * 
	 * @param g the {@code g} component as a percentage.
	 */
	void setG(double g);

	/**
	 * Sets the {@code g} component.
	 * 
	 * @param g the {@code g} component.
	 * @throws DOMSyntaxException if the component is not a &lt;number&gt; or
	 *                         &lt;percentage&gt;
	 */
	void setG(CSSNumericValue g) throws DOMSyntaxException;

	/**
	 * Gets the value of the {@code b} component.
	 * 
	 * @return the {@code b} component.
	 */
	CSSNumericValue getB();

	/**
	 * Sets the {@code b} component as a percentage.
	 * 
	 * @param b the {@code b} component as a percentage.
	 */
	void setB(double b);

	/**
	 * Sets the {@code b} component.
	 * 
	 * @param b the {@code b} component.
	 * @throws DOMSyntaxException if the component is not a &lt;number&gt; or
	 *                         &lt;percentage&gt;
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
