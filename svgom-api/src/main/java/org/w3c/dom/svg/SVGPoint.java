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
 * An <code>(x, y)</code> coordinate pair.
 * <p>
 * When used in matrix operations, an SVGPoint is treated as a vector of the
 * form:
 * </p>
 * 
 * <pre>
 * [x]
 * [y]
 * [1]
 * </pre>
 */
public interface SVGPoint {

	/**
	 * Get the x coordinate.
	 * 
	 * @return the x coordinate.
	 */
	float getX();

	/**
	 * Sets the x coordinate.
	 * 
	 * @param x the x coordinate.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this value is read only.
	 */
	void setX(float x) throws DOMException;

	/**
	 * Get the y coordinate.
	 * 
	 * @return the y coordinate.
	 */
	float getY();

	/**
	 * Sets the y coordinate.
	 * 
	 * @param y the y coordinate.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this value is read only.
	 */
	void setY(float y) throws DOMException;

	/**
	 * Applies a 2x3 matrix transformation on this SVGPoint object and returns a
	 * new, transformed SVGPoint object.
	 * 
	 * @param matrix the matrix.
	 * @return a new SVGPoint object.
	 */
	SVGPoint matrixTransform(SVGMatrix matrix);

}
