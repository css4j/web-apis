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
import org.w3c.dom.css.RGBColor;

/**
 * Corresponds to color value definition for properties ‘stop-color’,
 * ‘flood-color’ and ‘lighting-color’.
 */
@Deprecated(forRemoval = true)
public interface SVGColor extends CSSValue {

	// Color Types
	short SVG_COLORTYPE_UNKNOWN = 0;
	short SVG_COLORTYPE_RGBCOLOR = 1;
	short SVG_COLORTYPE_RGBCOLOR_ICCCOLOR = 2;
	short SVG_COLORTYPE_CURRENTCOLOR = 3;

	short getColorType();

	default RGBColor getRGBColor() {
		return null;
	}

	@SuppressWarnings("removal")
	default SVGICCColor getICCColor() {
		return null;
	}

	void setRGBColor(String rgbColor) throws SVGException;

	void setRGBColorICCColor(String rgbColor, String iccColor) throws SVGException;

	void setColor(short colorType, String rgbColor, String iccColor) throws SVGException;

}
