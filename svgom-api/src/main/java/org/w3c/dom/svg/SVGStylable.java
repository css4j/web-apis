/*
 * Copyright (c) 2010 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.w3c.dom.svg;

import org.w3c.css.om.CSSStyleDeclaration;
import org.w3c.css.om.typed.CSSStyleValue;
import org.w3c.dom.css.CSSValue;

/**
 * This interface is implemented on all objects corresponding to SVG elements
 * that can have <code>style</code>, <code>class</code> and presentation
 * attributes specified on them.
 */
public interface SVGStylable {

	/**
	 * Gets the attribute {@code class} on this element.
	 * 
	 * @return the attribute {@code class}.
	 */
	SVGAnimatedString getClassName();

	/**
	 * Gets the inline style of this element.
	 * 
	 * @return the inline style.
	 */
	CSSStyleDeclaration getStyle();

	/**
	 * Returns the base value of a given presentation attribute as an object.
	 * 
	 * @param name the presentation attribute.
	 * @return the given presentation attribute as a {@code CSSValue}, {@code null}
	 *         if no value was defined for the given attribute or this
	 *         implementation does not support the {@code CSSValue} API.
	 */
	@Deprecated
	default CSSValue getPresentationAttribute(String name) {
		return null;
	}

	/**
	 * Returns the base value of a given presentation attribute as an object.
	 * 
	 * @param name the presentation attribute.
	 * @return the given presentation attribute as a {@code CSSStyleValue},
	 *         {@code null} if no value was defined for the given attribute or this
	 *         implementation does not support the {@code CSSStyleValue} API.
	 */
	default CSSStyleValue getPresentationAttributeValue(String name) {
		return null;
	}

}
