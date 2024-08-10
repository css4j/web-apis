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

public interface SVGTextPathElement extends SVGTextContentElement, SVGURIReference {
	// textPath Method Types
	short TEXTPATH_METHODTYPE_UNKNOWN = 0;
	short TEXTPATH_METHODTYPE_ALIGN = 1;
	short TEXTPATH_METHODTYPE_STRETCH = 2;
	// textPath Spacing Types
	short TEXTPATH_SPACINGTYPE_UNKNOWN = 0;
	short TEXTPATH_SPACINGTYPE_AUTO = 1;
	short TEXTPATH_SPACINGTYPE_EXACT = 2;

	SVGAnimatedLength getStartOffset();

	SVGAnimatedEnumeration getMethod();

	SVGAnimatedEnumeration getSpacing();
}
