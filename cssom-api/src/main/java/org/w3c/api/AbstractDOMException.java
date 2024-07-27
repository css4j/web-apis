/*
 * Interfaces defined by CSS Typed Object Model draft
 *  (https://www.w3.org/TR/css-typed-om-1/).
 * Copyright © 2018-2023 W3C® (MIT, ERCIM, Keio, Beihang).
 * https://www.w3.org/Consortium/Legal/2015/copyright-software-and-document
 */
/*
 * SPDX-License-Identifier: W3C-20150513
 */
package org.w3c.api;

import org.w3c.dom.DOMException;

/**
 * Abstract DOM exception in Web APIs.
 */
public class AbstractDOMException extends DOMException {

	private static final long serialVersionUID = 1L;

	protected AbstractDOMException(short code, String message) {
		super(code, message);
	}

	protected AbstractDOMException(short code, Throwable cause) {
		super(code, null);
		initCause(cause);
	}

	protected AbstractDOMException(short code, String message, Throwable cause) {
		super(code, message);
		initCause(cause);
	}

}
