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

package org.w3c.dom.smil;

/**
 * Control the behavior of an animated element.
 */
public interface ElementTimeControl {

	/**
	 * Creates a begin instance time for the current time which is added to the list
	 * of begin instance times.
	 * <p>
	 * Note: modern versions of this method do not return any value.
	 * </p>
	 * 
	 * @return {@code true}. The return value should be ignored.
	 */
	boolean beginElement();

	/**
	 * Creates a begin instance time for the current time plus or minus the passed
	 * offset which is added to the list of begin instance times.
	 * <p>
	 * Note: modern versions of this method do not return any value.
	 * </p>
	 * 
	 * @param offset the offset in seconds at which to begin the element.
	 * @return {@code true}. The return value should be ignored.
	 */
	boolean beginElementAt(float offset);

	/**
	 * Creates an end instance time for the current time which is added to the list
	 * of end instance times.
	 * <p>
	 * Note: modern versions of this method do not return any value.
	 * </p>
	 * 
	 * @return {@code true}. The return value should be ignored.
	 */
	boolean endElement();

	/**
	 * Creates an end instance time for the current time plus or minus the passed
	 * offset which is added to the list of end instance times.
	 * <p>
	 * Note: modern versions of this method do not return any value.
	 * </p>
	 * 
	 * @param offset
	 * @return {@code true}. The return value should be ignored.
	 */
	boolean endElementAt(float offset);
}
