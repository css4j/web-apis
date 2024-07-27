/*
 * This software extends interfaces defined by CSS Object Model
 *  (https://www.w3.org/TR/cssom-1/).
 * Copyright © 2016 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/* 
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om;

import org.w3c.dom.DOMException;

/**
 * A CSS style rule.
 * 
 */
public interface CSSStyleRule extends CSSRule {

	/**
	 * Get a parsable serialization of the selector(s).
	 * 
	 * @return a parsable serialization of the selector list.
	 */
	String getSelectorText();

	/**
	 * Parse the given string and set the selector list according to it.
	 * 
	 * @param selectorText a text representation of a selector list, according to
	 *                     CSS syntax.
	 * @throws DOMException
	 */
	void setSelectorText(String selectorText) throws DOMException;

	/**
	 * Get the style that is declared by this rule.
	 *
	 * @return the style declaration.
	 */
	CSSStyleDeclaration getStyle();

}
