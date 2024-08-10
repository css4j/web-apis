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
 * Represents rectangular geometry.
 * <p>
 * Rectangles are defined as consisting of a (x,y) coordinate pair identifying a
 * minimum X value, a minimum Y value, and a width and height, which are usually
 * constrained to be non-negative.
 * </p>
 */
public interface SVGRect {

	/**
	 * The minimum X value.
	 * 
	 * @return the minimum X value in user units.
	 */
	float getX();

	/**
	 * Sets the minimum X value.
	 * 
	 * @param x the minimum X value in user units.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if the rectangle corresponds
	 *                      to a read only attribute or when the object itself is
	 *                      read only.
	 */
	void setX(float x) throws DOMException;

	/**
	 * The minimum Y value.
	 * 
	 * @return the minimum Y value in user units.
	 */
	float getY();

	/**
	 * Sets the minimum Y value.
	 * 
	 * @param y the minimum Y value in user units.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if the rectangle corresponds
	 *                      to a read only attribute or when the object itself is
	 *                      read only.
	 */
	void setY(float y) throws DOMException;

	/**
	 * The width.
	 * 
	 * @return the width in user units.
	 */
	float getWidth();

	/**
	 * Sets the width of the rectangle.
	 * 
	 * @param width the width in user units.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if the rectangle corresponds
	 *                      to a read only attribute or when the object itself is
	 *                      read only.
	 */
	void setWidth(float width) throws DOMException;

	/**
	 * The height.
	 * 
	 * @return the height in user units.
	 */
	float getHeight();

	/**
	 * Sets the height of the rectangle.
	 * 
	 * @param height the height in user units.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if the rectangle corresponds
	 *                      to a read only attribute or when the object itself is
	 *                      read only.
	 */
	void setHeight(float height) throws DOMException;

}
