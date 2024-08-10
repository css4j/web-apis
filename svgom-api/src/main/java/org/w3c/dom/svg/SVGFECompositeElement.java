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

public interface SVGFECompositeElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {
	// Composite Operators
	short SVG_FECOMPOSITE_OPERATOR_UNKNOWN = 0;
	short SVG_FECOMPOSITE_OPERATOR_OVER = 1;
	short SVG_FECOMPOSITE_OPERATOR_IN = 2;
	short SVG_FECOMPOSITE_OPERATOR_OUT = 3;
	short SVG_FECOMPOSITE_OPERATOR_ATOP = 4;
	short SVG_FECOMPOSITE_OPERATOR_XOR = 5;
	short SVG_FECOMPOSITE_OPERATOR_ARITHMETIC = 6;

	SVGAnimatedString getIn1();

	SVGAnimatedString getIn2();

	SVGAnimatedEnumeration getOperator();

	SVGAnimatedNumber getK1();

	SVGAnimatedNumber getK2();

	SVGAnimatedNumber getK3();

	SVGAnimatedNumber getK4();
}
