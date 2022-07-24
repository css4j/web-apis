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

/**
 * Declares the different Path Segment Types corresponding to a single command
 * within a path data specification.
 */
public interface SVGPathSeg {
	// Path Segment Types

	/**
	 * The unit type is not one of predefined types. It is invalid to attempt to
	 * define a new value of this type or to attempt to switch an existing value to
	 * this type.
	 */
	public static final short PATHSEG_UNKNOWN = 0;

	/**
	 * {@code closepath} ({@code z}) path data command.
	 */
	public static final short PATHSEG_CLOSEPATH = 1;

	/**
	 * {@code absolute moveto} ({@code M}) path data command.
	 */
	public static final short PATHSEG_MOVETO_ABS = 2;

	/**
	 * {@code relative moveto} ({@code m}) path data command.
	 */
	public static final short PATHSEG_MOVETO_REL = 3;

	/**
	 * {@code absolute lineto} ({@code L}) path data command.
	 */
	public static final short PATHSEG_LINETO_ABS = 4;

	/**
	 * {@code relative lineto} ({@code l}) path data command.
	 */
	public static final short PATHSEG_LINETO_REL = 5;

	/**
	 * {@code absolute cubic Bézier curveto} ({@code C}) path data command.
	 */
	public static final short PATHSEG_CURVETO_CUBIC_ABS = 6;

	/**
	 * {@code relative cubic Bézier curveto} ({@code c}) path data command.
	 */
	public static final short PATHSEG_CURVETO_CUBIC_REL = 7;

	/**
	 * {@code absolute quadratic Bézier curveto} ({@code Q}) path data command.
	 */
	public static final short PATHSEG_CURVETO_QUADRATIC_ABS = 8;

	/**
	 * {@code relative quadratic Bézier curveto} ({@code q}) path data command.
	 */
	public static final short PATHSEG_CURVETO_QUADRATIC_REL = 9;

	/**
	 * {@code absolute arcto} ({@code A}) path data command.
	 */
	public static final short PATHSEG_ARC_ABS = 10;

	/**
	 * {@code relative arcto} ({@code a}) path data command.
	 */
	public static final short PATHSEG_ARC_REL = 11;

	/**
	 * {@code absolute horizontal lineto} ({@code H}) path data command.
	 */
	public static final short PATHSEG_LINETO_HORIZONTAL_ABS = 12;

	/**
	 * {@code relative horizontal lineto} ({@code h}) path data command.
	 */
	public static final short PATHSEG_LINETO_HORIZONTAL_REL = 13;

	/**
	 * {@code absolute vertical lineto} ({@code V}) path data command.
	 */
	public static final short PATHSEG_LINETO_VERTICAL_ABS = 14;

	/**
	 * {@code relative vertical lineto} ({@code v}) path data command.
	 */
	public static final short PATHSEG_LINETO_VERTICAL_REL = 15;

	/**
	 * {@code absolute smooth cubic curveto} ({@code S}) path data command.
	 */
	public static final short PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = 16;

	/**
	 * {@code relative smooth cubic curveto} ({@code s}) path data command.
	 */
	public static final short PATHSEG_CURVETO_CUBIC_SMOOTH_REL = 17;

	/**
	 * {@code absolute smooth quadratic curveto} ({@code T}) path data command.
	 */
	public static final short PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = 18;

	/**
	 * {@code relative smooth quadratic curveto} ({@code t}) path data command.
	 */
	public static final short PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = 19;

	/**
	 * Gets the type of the path segment as specified by one of the constants
	 * declared on this interface.
	 * 
	 * @return the type of the path segment.
	 */
	public short getPathSegType();

	/**
	 * Gets the type of the path segment, specified by the corresponding
	 * one-character command name.
	 * 
	 * @return the type of the path segment.
	 */
	public String getPathSegTypeAsLetter();
}
