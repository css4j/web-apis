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

import org.w3c.dom.css.CSSValue;

/**
 * This interface is implemented on all objects corresponding to SVG elements
 * that can have <code>style</code>, <code>class</code> and presentation
 * attributes specified on them.
 */
public interface SVGStylable extends SVGStylableP<CSSValue> {

	/**
	 * Returns the base value of a given presentation attribute as an object.
	 * 
	 * @param name the presentation attribute.
	 * @return the given presentation attribute as an object.
	 */
	@Override
	@Deprecated
	default CSSValue getPresentationAttribute(String name) {
		return null;
	}

}
