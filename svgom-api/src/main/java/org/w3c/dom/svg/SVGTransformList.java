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

public interface SVGTransformList {
	int getNumberOfItems();

	void clear() throws DOMException;

	SVGTransform initialize(SVGTransform newItem) throws DOMException, SVGException;

	SVGTransform getItem(int index) throws DOMException;

	SVGTransform insertItemBefore(SVGTransform newItem, int index) throws DOMException, SVGException;

	SVGTransform replaceItem(SVGTransform newItem, int index) throws DOMException, SVGException;

	SVGTransform removeItem(int index) throws DOMException;

	SVGTransform appendItem(SVGTransform newItem) throws DOMException, SVGException;

	SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);

	SVGTransform consolidate();
}
