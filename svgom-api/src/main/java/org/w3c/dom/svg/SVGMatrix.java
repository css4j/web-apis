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
 * Many of SVG's graphics operations utilize 2x3 matrices of the form:
 * 
 * <pre>
 * [a c e]
 * [b d f]
 * </pre>
 * 
 * <p>
 * which, when expanded into a 3x3 matrix for the purposes of matrix arithmetic,
 * become:
 * </p>
 * 
 * <pre>
 * [a c e]
 * [b d f]
 * [0 0 1]
 * </pre>
 */
public interface SVGMatrix {

	/**
	 * @return the {@code a} component of the matrix.
	 */
	float getA();

	/**
	 * Set the {@code a} component of the matrix.
	 * 
	 * @param a the {@code a} component of the matrix.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR on an attempt to change the
	 *                      value of a read only attribute.
	 */
	void setA(float a) throws DOMException;

	/**
	 * @return the {@code b} component of the matrix.
	 */
	float getB();

	/**
	 * Set the {@code b} component of the matrix.
	 * 
	 * @param b the {@code b} component of the matrix.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR on an attempt to change the
	 *                      value of a read only attribute.
	 */
	void setB(float b) throws DOMException;

	/**
	 * @return the {@code c} component of the matrix.
	 */
	float getC();

	/**
	 * Set the {@code c} component of the matrix.
	 * 
	 * @param c the {@code c} component of the matrix.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR on an attempt to change the
	 *                      value of a read only attribute.
	 */
	void setC(float c) throws DOMException;

	/**
	 * @return the {@code d} component of the matrix.
	 */
	float getD();

	/**
	 * Set the {@code d} component of the matrix.
	 * 
	 * @param d the {@code d} component of the matrix.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR on an attempt to change the
	 *                      value of a read only attribute.
	 */
	void setD(float d) throws DOMException;

	/**
	 * @return the {@code e} component of the matrix.
	 */
	float getE();

	/**
	 * Set the {@code e} component of the matrix.
	 * 
	 * @param e the {@code e} component of the matrix.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR on an attempt to change the
	 *                      value of a read only attribute.
	 */
	void setE(float e) throws DOMException;

	/**
	 * @return the {@code f} component of the matrix.
	 */
	float getF();

	/**
	 * Set the {@code f} component of the matrix.
	 * 
	 * @param f the {@code f} component of the matrix.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR on an attempt to change the
	 *                      value of a read only attribute.
	 */
	void setF(float f) throws DOMException;

	/**
	 * Performs matrix multiplication. This matrix is post-multiplied by another
	 * matrix, returning the resulting new matrix.
	 * 
	 * @param secondMatrix the matrix which is post-multiplied to this matrix.
	 * @return the resulting matrix.
	 */
	SVGMatrix multiply(SVGMatrix secondMatrix);

	/**
	 * @return the inverse matrix.
	 * @throws SVGException SVG_MATRIX_NOT_INVERTABLE if this matrix is not
	 *                      invertible.
	 */
	SVGMatrix inverse() throws SVGException;

	/**
	 * Post-multiplies a translation transformation on the current matrix and
	 * returns the resulting matrix.
	 * 
	 * @param x the distance to translate along the x-axis.
	 * @param y the distance to translate along the y-axis.
	 * @return the resulting matrix.
	 */
	SVGMatrix translate(float x, float y);

	/**
	 * Post-multiplies a uniform scale transformation on the current matrix and
	 * returns the resulting matrix.
	 * 
	 * @param scaleFactor the scale factor in both X and Y.
	 * @return the resulting matrix.
	 */
	SVGMatrix scale(float scaleFactor);

	/**
	 * Post-multiplies a non-uniform scale transformation on the current matrix and
	 * returns the resulting matrix.
	 * 
	 * @param scaleFactorX the scale factor in X.
	 * @param scaleFactorY the scale factor in Y.
	 * @return the resulting matrix.
	 */
	SVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY);

	/**
	 * Post-multiplies a rotation transformation on the current matrix and returns
	 * the resulting matrix.
	 * 
	 * @param angle the rotation angle.
	 * @return the resulting matrix.
	 */
	SVGMatrix rotate(float angle);

	/**
	 * Post-multiplies a rotation transformation on the current matrix and returns
	 * the resulting matrix. The rotation angle is determined by taking {@code (+/-)
	 * atan(y/x)}. The direction of the vector {@code (x, y)} determines whether the
	 * positive or negative angle value is used.
	 * 
	 * @param x the X coordinate of the vector {@code (x, y)}. Must not be zero.
	 * @param y the Y coordinate of the vector {@code (x, y)}. Must not be zero.
	 * @return the resulting matrix.
	 * @throws SVGException SVG_INVALID_VALUE_ERR if one of the parameters is an
	 *                      invalid value.
	 */
	SVGMatrix rotateFromVector(float x, float y) throws SVGException;

	/**
	 * Post-multiplies the transformation {@code [-1 0 0 1 0 0]} and returns the
	 * resulting matrix.
	 * 
	 * @return the resulting matrix.
	 */
	SVGMatrix flipX();

	/**
	 * Post-multiplies the transformation {@code [1 0 0 -1 0 0]} and returns the
	 * resulting matrix.
	 * 
	 * @return the resulting matrix.
	 */
	SVGMatrix flipY();

	/**
	 * Post-multiplies a skewX transformation on the current matrix and returns the
	 * resulting matrix.
	 * 
	 * @param angle the skew angle.
	 * @return the resulting matrix.
	 */
	SVGMatrix skewX(float angle);

	/**
	 * Post-multiplies a skewY transformation on the current matrix and returns the
	 * resulting matrix.
	 * 
	 * @param angle the skew angle.
	 * @return the resulting matrix.
	 */
	SVGMatrix skewY(float angle);

}
