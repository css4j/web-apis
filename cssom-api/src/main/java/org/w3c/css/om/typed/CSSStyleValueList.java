/*
 * Based on css4j's CSSValueList interface.
 */
/*
 * SPDX-License-Identifier: W3C-19980720
 */
package org.w3c.css.om.typed;

/**
 * Typed OM has no list interface, so let's invent one.
 *
 */
public interface CSSStyleValueList<E extends CSSStyleValue> extends CSSStyleValue, Iterable<E> {

	/**
	 * The number of values in this list.
	 * 
	 * @return the number of items in this list.
	 */
	int getLength();

	/**
	 * Retrieve a <code>CSSValue</code> by ordinal index.
	 * 
	 * @param index the index in this list.
	 * @return the value at <code>index</code>, or <code>null</code> if
	 *         <code>index</code> is less than zero, or greater or equal to the list
	 *         length.
	 */
	E item(int index);

}
