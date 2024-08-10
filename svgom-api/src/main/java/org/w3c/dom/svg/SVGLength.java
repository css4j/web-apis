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

public interface SVGLength {
	// Length Unit Types
	short SVG_LENGTHTYPE_UNKNOWN = 0;
	short SVG_LENGTHTYPE_NUMBER = 1;
	short SVG_LENGTHTYPE_PERCENTAGE = 2;
	short SVG_LENGTHTYPE_EMS = 3;
	short SVG_LENGTHTYPE_EXS = 4;
	short SVG_LENGTHTYPE_PX = 5;
	short SVG_LENGTHTYPE_CM = 6;
	short SVG_LENGTHTYPE_MM = 7;
	short SVG_LENGTHTYPE_IN = 8;
	short SVG_LENGTHTYPE_PT = 9;
	short SVG_LENGTHTYPE_PC = 10;

	short getUnitType();

	float getValue();

	void setValue(float value) throws DOMException;

	float getValueInSpecifiedUnits();

	void setValueInSpecifiedUnits(float valueInSpecifiedUnits) throws DOMException;

	String getValueAsString();

	void setValueAsString(String valueAsString) throws DOMException;

	void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits);

	void convertToSpecifiedUnits(short unitType);
}
