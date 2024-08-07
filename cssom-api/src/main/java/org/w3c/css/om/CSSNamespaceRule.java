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
 * Namespace rule. @see
 * <a href="https://www.w3.org/TR/cssom-1/#the-cssnamespacerule-interface">The
 * <code>CSSNamespaceRule</code> Interface</a>.
 */
public interface CSSNamespaceRule extends CSSRule {

	/**
	 * Get the namespace URI defined by this rule.
	 * 
	 * @return the namespace URI.
	 */
	String getNamespaceURI();

	/**
	 * Get the prefix for the declared namespace.
	 * 
	 * @return the namespace prefix.
	 */
	String getPrefix();

}