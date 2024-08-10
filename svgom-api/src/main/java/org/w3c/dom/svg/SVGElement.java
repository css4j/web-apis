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

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

public interface SVGElement extends Element {

	/**
	 * Gets the {@code id} content attribute.
	 * 
	 * @return the value of the {@code id} attribute, or the empty string if none.
	 */
	String getId();

	/**
	 * Sets the {@code id} content attribute.
	 * 
	 * @param id the value of the {@code id} attribute.
	 * @throws DOMException
	 */
	void setId(String id) throws DOMException;

	String getXMLbase();

	void setXMLbase(String xmlbase) throws DOMException;

	/**
	 * Gets the nearest ancestor {@code svg} element.
	 * 
	 * @return the nearest ancestor {@code svg} element, or {@code null} if the
	 *         current element is the outermost {@code svg} element.
	 */
	SVGSVGElement getOwnerSVGElement();

	/**
	 * Get the element that provides the SVG viewport for this element.
	 * 
	 * @return the nearest ancestor element that establishes an SVG viewport, or
	 *         {@code null} if the current element is the outermost svg element.
	 */
	SVGElement getViewportElement();
}
