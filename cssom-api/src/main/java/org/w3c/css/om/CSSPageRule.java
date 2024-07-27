/*
 * This software extends interfaces defined by CSS Object Model draft
 *  (https://www.w3.org/TR/cssom-1/).
 * Copyright © 2016 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/*
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om;

/**
 * A CSS {@literal @}page rule.
 *
 */
public interface CSSPageRule extends CSSRule {

	/**
	 * Get a serialization of the associated list of CSS page selectors.
	 * 
	 * @return a serialization of the page selectors.
	 */
	String getSelectorText();

	/**
	 * Sets the page selectors associated to this rule.
	 * 
	 * @param selectorText a parsable serialization of page selectors.
	 */
	void setSelectorText(String selectorText);

}
