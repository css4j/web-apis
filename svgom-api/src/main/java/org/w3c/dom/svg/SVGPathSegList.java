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

public interface SVGPathSegList {
	int getNumberOfItems();

	void clear() throws DOMException;

	SVGPathSeg initialize(SVGPathSeg newItem) throws DOMException, SVGException;

	SVGPathSeg getItem(int index) throws DOMException;

	SVGPathSeg insertItemBefore(SVGPathSeg newItem, int index) throws DOMException, SVGException;

	SVGPathSeg replaceItem(SVGPathSeg newItem, int index) throws DOMException, SVGException;

	SVGPathSeg removeItem(int index) throws DOMException;

	SVGPathSeg appendItem(SVGPathSeg newItem) throws DOMException, SVGException;
}
