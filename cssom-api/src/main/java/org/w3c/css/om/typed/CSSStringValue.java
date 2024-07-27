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

import org.w3c.api.DOMTypeException;

/**
 * Represents CSS strings.
 */
public interface CSSStringValue extends CSSStyleValue {

	/**
	 * Gets the value.
	 * 
	 * @return the value.
	 */
	String getValue();

	/**
	 * Sets the value.
	 * 
	 * @param value the value.
	 * @throws DOMTypeException if the value is empty or {@code null}.
	 */
	void setValue(String value) throws DOMTypeException;

}
