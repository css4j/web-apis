/*
 * This software extends interfaces defined by CSSOM View Module
 * (https://www.w3.org/TR/cssom-view-1/).
 * Copyright © 2016 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 * 
 * Copyright © 2017-2024, Carlos Amengual.
 */
/*
 * SPDX-License-Identifier: W3C-20150513
 */

package org.w3c.css.om.view;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.stylesheets.MediaList;

/**
 * Based on W3C's <a href=
 * "https://www.w3.org/TR/cssom-view-1/#the-mediaquerylist-interface">MediaQueryList
 * interface</a>.
 * <p>
 * For backwards compatibility, it extends the deprecated <code>MediaList</code>
 * interface.
 * </p>
 */
public interface MediaQueryList extends MediaList, EventTarget {

	/**
	 * Get the serialized form of this media query list.
	 * 
	 * @return the serialized form of this media query list.
	 */
	String getMedia();

	/**
	 * Get the serialized form of this media query list.
	 * 
	 * @return the serialized form of this media query list.
	 * @deprecated use {@link #getMedia()}.
	 */
	@Deprecated
	@Override
	default String getMediaText() {
		return getMedia();
	}

	/**
	 * Sets the <code>media</code> attribute, which the current specification
	 * defines to be read-only.
	 * 
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR: Raised if this media list
	 *                      is read-only.
	 */
	@Deprecated
	@Override
	default void setMediaText(String mediaText) throws DOMException {
		throw new DOMException(DOMException.NO_MODIFICATION_ALLOWED_ERR, "This is a read-only attribute.");
	}

	/**
	 * Deletes a medium from this list, which the current specification does not
	 * support.
	 * 
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR: Raised if this media list
	 *                      is read-only.
	 */
	@Deprecated
	@Override
	default void deleteMedium(String oldMedium) throws DOMException {
		throw new DOMException(DOMException.NO_MODIFICATION_ALLOWED_ERR,
				"Media query lists cannot be modified this way.");
	}

	/**
	 * Appends a medium to this list, which the current specification does not
	 * support.
	 * 
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR: Raised if this media list
	 *                      is read-only.
	 */
	@Deprecated
	@Override
	default void appendMedium(String newMedium) throws DOMException {
		throw new DOMException(DOMException.NO_MODIFICATION_ALLOWED_ERR,
				"Media query lists cannot be modified this way.");
	}

}
