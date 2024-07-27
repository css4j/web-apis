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

import org.w3c.css.om.view.MediaQueryList;

/**
 * A style sheet.
 */
public interface CSSStyleSheet extends org.w3c.dom.css.CSSStyleSheet {

	/**
	 * Gets the collection of all CSS rules contained within the style sheet.
	 *
	 * @return the list of all CSS rules contained within the style sheet.
	 */
	@Override
	CSSRuleList getCssRules();

	/**
	 * Get the destination media for this sheet.
	 *
	 * @return the media query list.
	 */
	@Override
	MediaQueryList getMedia();

	/**
	 * Create a CSS style declaration compatible with this implementation.
	 *
	 * @return a CSS style declaration.
	 */
	CSSStyleDeclaration createStyleDeclaration();

}
