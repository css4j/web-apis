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

public interface SVGFilterElement
		extends SVGElement, SVGURIReference, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGUnitTypes {
	SVGAnimatedEnumeration getFilterUnits();

	SVGAnimatedEnumeration getPrimitiveUnits();

	SVGAnimatedLength getX();

	SVGAnimatedLength getY();

	SVGAnimatedLength getWidth();

	SVGAnimatedLength getHeight();

	SVGAnimatedInteger getFilterResX();

	SVGAnimatedInteger getFilterResY();

	void setFilterRes(int filterResX, int filterResY);
}
