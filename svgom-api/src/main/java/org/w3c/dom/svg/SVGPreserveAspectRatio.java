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

/**
 * Represents the <code>preserveAspectRatio</code> attribute.
 */
public interface SVGPreserveAspectRatio {
	// Alignment Types

	/**
	 * Some other value.
	 */
	short SVG_PRESERVEASPECTRATIO_UNKNOWN = 0;

	/**
	 * The none keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_NONE = 1;

	/**
	 * The xMinYMin keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMINYMIN = 2;

	/**
	 * The xMidYMin keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3;

	/**
	 * The xMaxYMin keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4;

	/**
	 * The xMinYMid keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMINYMID = 5;

	/**
	 * The xMidYMid keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMIDYMID = 6;

	/**
	 * The xMaxYMid keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMAXYMID = 7;

	/**
	 * The xMinYMax keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMINYMAX = 8;

	/**
	 * The xMidYMax keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9;

	/**
	 * The xMaxYMax keyword.
	 */
	short SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10;

	// Meet-or-slice Types

	/**
	 * Some other value.
	 */
	short SVG_MEETORSLICE_UNKNOWN = 0;

	/**
	 * The meet keyword.
	 */
	short SVG_MEETORSLICE_MEET = 1;

	/**
	 * The slice keyword.
	 */
	short SVG_MEETORSLICE_SLICE = 2;

	/**
	 * Get the alignment keyword part of the ‘preserveAspectRatio’ value.
	 * 
	 * @return the alignment keyword part of the ‘preserveAspectRatio’ value.
	 */
	short getAlign();

	void setAlign(short align) throws DOMException;

	/**
	 * Get the meet-or-slice keyword part of the ‘preserveAspectRatio’ value.
	 * 
	 * @return the meet-or-slice keyword part of the ‘preserveAspectRatio’ value.
	 */
	short getMeetOrSlice();

	void setMeetOrSlice(short meetOrSlice) throws DOMException;

}
