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

public interface SVGRenderingIntent {
	// Rendering Intent Types
	short RENDERING_INTENT_UNKNOWN = 0;
	short RENDERING_INTENT_AUTO = 1;
	short RENDERING_INTENT_PERCEPTUAL = 2;
	short RENDERING_INTENT_RELATIVE_COLORIMETRIC = 3;
	short RENDERING_INTENT_SATURATION = 4;
	short RENDERING_INTENT_ABSOLUTE_COLORIMETRIC = 5;
}
