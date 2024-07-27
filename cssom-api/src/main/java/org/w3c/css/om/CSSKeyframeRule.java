/*
 * This software extends interfaces defined by CSS Animations Level 1
 *  (https://drafts.csswg.org/css-animations/).
 * Copyright © 2018 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/*
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om;

/**
 * The CSSKeyframeRule interface represents the style rule for a single key.
 *
 */
public interface CSSKeyframeRule extends CSSRule {

	/**
	 * Gets the keyframe selector as a comma-separated list of percentage values.
	 * 
	 * @return the keyframe selector.
	 */
	String getKeyText();

	/**
	 * Get the style that is declared by this rule.
	 *
	 * @return the style declaration.
	 */
	CSSStyleDeclaration getStyle();

}