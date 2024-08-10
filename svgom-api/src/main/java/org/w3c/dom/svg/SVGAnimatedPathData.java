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
 * Implemented by elements which have a {@code d} attribute which holds SVG path
 * data.
 */
public interface SVGAnimatedPathData {

	/**
	 * Gets the base contents of the {@code d} attribute.
	 * <p>
	 * The base (<i>i.e.</i>, static) contents of the {@code d} attribute are
	 * provided in a form which matches one-for-one with SVG's syntax. Thus, if the
	 * {@code d} attribute has an "absolute moveto (M)" and an "absolute arcto (A)"
	 * command, then {@code pathSegList} will have two entries: a
	 * {@link SVGPathSeg#PATHSEG_MOVETO_ABS PATHSEG_MOVETO_ABS} and a
	 * {@link SVGPathSeg#PATHSEG_ARC_ABS PATHSEG_ARC_ABS}.
	 * </p>
	 * 
	 * @return the base contents of the {@code d} attribute.
	 */
	SVGPathSegList getPathSegList();

	/**
	 * Gets the normalized contents of the {@code d} attribute.
	 * <p>
	 * The base (<i>i.e.</i>, static) contents of the {@code d} attribute are
	 * provided in a form where all path data commands are expressed in terms of the
	 * following subset of {@link SVGPathSeg} types:
	 * {@link SVGPathSeg#PATHSEG_MOVETO_ABS PATHSEG_MOVETO_ABS} ({@code M}),
	 * {@link SVGPathSeg#PATHSEG_LINETO_ABS PATHSEG_LINETO_ABS} ({@code L}),
	 * {@link SVGPathSeg#PATHSEG_CURVETO_CUBIC_ABS PATHSEG_CURVETO_CUBIC_ABS}
	 * ({@code C}) and {@link SVGPathSeg#PATHSEG_CLOSEPATH PATHSEG_CLOSEPATH}
	 * ({@code z}).
	 * </p>
	 * <p>
	 * Thus, if the {@code d} attribute has an "absolute moveto (M)" and an
	 * "absolute arcto (A)" command, then {@code normalizedpathSegList} will have
	 * one {@code PATHSEG_MOVETO_ABS} entry followed by a series of
	 * {@code PATHSEG_LINETO_ABS} entries which approximate the arc. This alternate
	 * representation is available to provide a simpler interface to developers who
	 * would benefit from a more limited set of commands.
	 * </p>
	 * <p>
	 * The only valid {@code SVGPathSeg} types are {@code PATHSEG_MOVETO_ABS}
	 * ({@code M}), {@code PATHSEG_LINETO_ABS} ({@code L}),
	 * {@code PATHSEG_CURVETO_CUBIC_ABS} ({@code C}) and {@code PATHSEG_CLOSEPATH}
	 * ({@code z}).
	 * </p>
	 * 
	 * @return the normalized contents of the {@code d} attribute.
	 */
	SVGPathSegList getNormalizedPathSegList();

	/**
	 * Gets the current animated contents of the {@code d} attribute.
	 * <p>
	 * The current animated contents of the {@code d} attribute are provided in a
	 * form which matches one-for-one with SVG's syntax. If the given attribute or
	 * property is being animated, contains the current animated value of the
	 * attribute or property, and both the object itself and its contents are read
	 * only. If the given attribute or property is not currently being animated,
	 * gives the same value as {@link #getPathSegList()}.
	 * </p>
	 * 
	 * @return the current animated contents of the {@code d} attribute.
	 */
	SVGPathSegList getAnimatedPathSegList();

	/**
	 * Gets the normalized current animated contents of the {@code d} attribute.
	 * <p>
	 * The current animated contents of the {@code d} attribute are provided in a
	 * form where all path data commands are expressed in terms of the following
	 * subset of {@link SVGPathSeg} types: {@link SVGPathSeg#PATHSEG_MOVETO_ABS
	 * PATHSEG_MOVETO_ABS} ({@code M}), {@link SVGPathSeg#PATHSEG_LINETO_ABS
	 * PATHSEG_LINETO_ABS} ({@code L}), {@link SVGPathSeg#PATHSEG_CURVETO_CUBIC_ABS
	 * PATHSEG_CURVETO_CUBIC_ABS} ({@code C}) and
	 * {@link SVGPathSeg#PATHSEG_CLOSEPATH PATHSEG_CLOSEPATH} ({@code z}).
	 * </p>
	 * <p>
	 * If the given attribute or property is being animated, contains the current
	 * animated value of the attribute or property, and both the object itself and
	 * its contents are read only. If the given attribute or property is not
	 * currently being animated, contains the same value as
	 * {@link #getNormalizedPathSegList()}.
	 * </p>
	 * 
	 * @return the normalized current animated contents of the {@code d} attribute.
	 */
	SVGPathSegList getAnimatedNormalizedPathSegList();

}
