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
 * A list of {@link SVGPoint} objects.
 */
public interface SVGPointList {

	/**
	 * The number of items in the list.
	 * 
	 * @return The number of items.
	 */
	int getNumberOfItems();

	/**
	 * Clears all existing current items from the list, with the result being an
	 * empty list.
	 * 
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this list is read only.
	 */
	void clear() throws DOMException;

	/**
	 * Clear this list and add the given value to it.
	 * 
	 * @param newItem the value.
	 * @return the value.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this list is read only.
	 */
	SVGPoint initialize(SVGPoint newItem) throws DOMException, SVGException;

	/**
	 * Get the specified item from the list.
	 * 
	 * @param index The index of the item from the list which is to be returned. The
	 *              first item is number 0.
	 * @return the specified item from the list.
	 * @throws DOMException INDEX_SIZE_ERR if the index number is greater than or
	 *                      equal to numberOfItems.
	 */
	SVGPoint getItem(int index) throws DOMException;

	/**
	 * Inserts a new item into the list at the specified position.
	 * <p>
	 * The first item is number 0. If newItem is already in a list, it is removed
	 * from its previous list before it is inserted into this list. The inserted
	 * item is the item itself and not a copy. If the item is already in this list,
	 * note that the index of the item to insert before is before the removal of the
	 * item.
	 * </p>
	 * 
	 * @param newItem The item which is to be inserted into the list.
	 * @param index   The index of the item before which the new item is to be
	 *                inserted. The first item is number 0. If the index is equal to
	 *                0, then the new item is inserted at the front of the list. If
	 *                the index is greater than or equal to numberOfItems, then the
	 *                new item is appended to the end of the list.
	 * @return The inserted item.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this list is read only.
	 */
	SVGPoint insertItemBefore(SVGPoint newItem, int index) throws DOMException, SVGException;

	/**
	 * Replaces an existing item in the list with a new item.
	 * <p>
	 * If newItem is already in a list, it is removed from its previous list before
	 * it is inserted into this list. The inserted item is the item itself and not a
	 * copy. If the item is already in this list, note that the index of the item to
	 * replace is before the removal of the item.
	 * </p>
	 * 
	 * @param newItem The item which is to be inserted into the list.
	 * @param index   The index of the item which is to be replaced. The first item
	 *                is number 0.
	 * @return The inserted item.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this list is read only,
	 *                      INDEX_SIZE_ERR if the index number is greater than or
	 *                      equal to numberOfItems.
	 */
	SVGPoint replaceItem(SVGPoint newItem, int index) throws DOMException, SVGException;

	/**
	 * Removes an existing item from the list.
	 * 
	 * @param index The index of the item which is to be removed. The first item is
	 *              number 0.
	 * @return The removed item.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this list is read only,
	 *                      INDEX_SIZE_ERR if the index number is greater than or
	 *                      equal to numberOfItems.
	 */
	SVGPoint removeItem(int index) throws DOMException;

	/**
	 * Inserts a new item at the end of the list.
	 * <p>
	 * If newItem is already in a list, it is removed from its previous list before
	 * it is inserted into this list. The inserted item is the item itself and not a
	 * copy.
	 * </p>
	 * 
	 * @param newItem The item which is to be appended.
	 * @return the new item.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if this list is read only.
	 */
	SVGPoint appendItem(SVGPoint newItem) throws DOMException, SVGException;

}
