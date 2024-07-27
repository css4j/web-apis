/*

 Copyright (c) 2005-2023, Carlos Amengual.

 Licensed under a BSD-style License. You can find the license here:
 https://css4j.github.io/LICENSE.txt

 */
/*
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.w3c.css.om.typed;

/**
 * A CSS <code>counter()</code> function.
 */
public interface CSSCounterValue extends CSSStyleValue {

	/**
	 * Get the name of this counter.
	 * 
	 * @return the name of this counter.
	 */
	String getName();

	/**
	 * Get the counter style.
	 * 
	 * @return the counter style, or <code>null</code> if style is the default.
	 */
	CSSStyleValue getCounterStyle();

	/**
	 * Get the separator.
	 * <p>
	 * If no separator was set, returns the empty string.
	 * </p>
	 * 
	 * @return the separator.
	 */
	default String getSeparator() {
		return "";
	}

}
