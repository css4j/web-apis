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

public interface SVGPreserveAspectRatio {
	// Alignment Types
	short SVG_PRESERVEASPECTRATIO_UNKNOWN = 0;
	short SVG_PRESERVEASPECTRATIO_NONE = 1;
	short SVG_PRESERVEASPECTRATIO_XMINYMIN = 2;
	short SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3;
	short SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4;
	short SVG_PRESERVEASPECTRATIO_XMINYMID = 5;
	short SVG_PRESERVEASPECTRATIO_XMIDYMID = 6;
	short SVG_PRESERVEASPECTRATIO_XMAXYMID = 7;
	short SVG_PRESERVEASPECTRATIO_XMINYMAX = 8;
	short SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9;
	short SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10;
	// Meet-or-slice Types
	short SVG_MEETORSLICE_UNKNOWN = 0;
	short SVG_MEETORSLICE_MEET = 1;
	short SVG_MEETORSLICE_SLICE = 2;

	short getAlign();

	void setAlign(short align) throws DOMException;

	short getMeetOrSlice();

	void setMeetOrSlice(short meetOrSlice) throws DOMException;
}
