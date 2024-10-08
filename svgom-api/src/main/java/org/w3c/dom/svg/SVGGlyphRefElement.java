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

public interface SVGGlyphRefElement extends SVGElement, SVGURIReference, SVGStylable {
	String getGlyphRef();

	void setGlyphRef(String glyphRef) throws DOMException;

	String getFormat();

	void setFormat(String format) throws DOMException;

	float getX();

	void setX(float x) throws DOMException;

	float getY();

	void setY(float y) throws DOMException;

	float getDx();

	void setDx(float dx) throws DOMException;

	float getDy();

	void setDy(float dy) throws DOMException;
}
