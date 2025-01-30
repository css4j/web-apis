/*
 * Copyright © 2023 W3C®.
 * 
 * This software or document includes material copied from or derived from
 * https://svgwg.org/specs/animations/
 *
 * [1] https://www.w3.org/copyright/software-license-2023/
 */

// SPDX-License-Identifier: W3C-20150513

package org.w3c.dom.svg;

/**
 * Represents SVG elements whose rendering is defined by geometry with an
 * equivalent path, and which can be filled and stroked.
 */
public interface SVGGeometryElement extends SVGGraphicsElement {

	/**
	 * Gets the read-only {@code pathLength} attribute, which is the author's
	 * computation of the total length of the path, in user units.
	 * <p>
	 * The {@code pathLength} attribute has no effect on percentage
	 * distance-along-a-path calculations.
	 * </p>
	 * 
	 * @return the total length of the path, in user units.
	 */
	SVGAnimatedNumber getPathLength();

	/**
	 * Get the length of the path.
	 * 
	 * @return the length of the path, in user units.
	 */
	float getTotalLength();

	/**
	 * Gets the point at a given distance along the path.
	 * <p>
	 * When getPointAtLength(distance) is called, the following steps are run:
	 * </p>
	 * <ol>
	 * <li>If current element is a non-rendered element, and the UA is not able to
	 * compute the total length of the path, then throw an InvalidStateError.</li>
	 * <li>Let length be the user agent's computed value for the total length of the
	 * path, in user units.
	 * <p>
	 * As with getTotalLength, this does not take into account the
	 * {@code pathLength} attribute.
	 * </p>
	 * </li>
	 * <li>Clamp distance to [0, length].</li>
	 * <li>Let (x, y) be the point on the path at distance distance.</li>
	 * <li>Return a newly created, detached DOMPoint object representing the point
	 * (x, y).</li>
	 * </ol>
	 * </p>
	 * 
	 * @param distance the distance.
	 * @return the point at a given distance along the path.
	 */
	SVGPoint getPointAtLength(float distance);

}
