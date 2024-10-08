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

public interface SVGFEConvolveMatrixElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	// Edge Mode Values
	short SVG_EDGEMODE_UNKNOWN = 0;
	short SVG_EDGEMODE_DUPLICATE = 1;
	short SVG_EDGEMODE_WRAP = 2;
	short SVG_EDGEMODE_NONE = 3;

	SVGAnimatedInteger getOrderX();

	SVGAnimatedInteger getOrderY();

	SVGAnimatedNumberList getKernelMatrix();

	SVGAnimatedNumber getDivisor();

	SVGAnimatedNumber getBias();

	SVGAnimatedInteger getTargetX();

	SVGAnimatedInteger getTargetY();

	SVGAnimatedEnumeration getEdgeMode();

	SVGAnimatedNumber getKernelUnitLengthX();

	SVGAnimatedNumber getKernelUnitLengthY();

	SVGAnimatedBoolean getPreserveAlpha();
}
