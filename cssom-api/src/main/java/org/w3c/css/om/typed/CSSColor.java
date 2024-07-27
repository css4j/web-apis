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
 * Represents the CSS color() function.
 */
public interface CSSColor extends CSSColorValue {

	/**
	 * Gets the name of the color space.
	 * 
	 * @return the color space.
	 */
	CSSKeywordValue getColorSpace();

	/**
	 * Sets the color space.
	 * 
	 * @param cs the color space.
	 */
	void setColorSpace(String cs);

	/**
	 * Gets the channels (except alpha).
	 * 
	 * @return the channels.
	 */
	CSSStyleValueList<? extends CSSNumericValue> getChannels();

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
