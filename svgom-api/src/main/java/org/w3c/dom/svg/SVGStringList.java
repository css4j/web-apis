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

public interface SVGStringList {
	int getNumberOfItems();

	void clear() throws DOMException;

	String initialize(String newItem) throws DOMException, SVGException;

	String getItem(int index) throws DOMException;

	String insertItemBefore(String newItem, int index) throws DOMException, SVGException;

	String replaceItem(String newItem, int index) throws DOMException, SVGException;

	String removeItem(int index) throws DOMException;

	String appendItem(String newItem) throws DOMException, SVGException;
}
