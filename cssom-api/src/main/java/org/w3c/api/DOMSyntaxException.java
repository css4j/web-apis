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
 * Syntax exception in Web APIs.
 */
public class DOMSyntaxException extends AbstractDOMException {

	private static final long serialVersionUID = 1L;

	public DOMSyntaxException(String message) {
		super(DOMException.SYNTAX_ERR, message);
	}

	public DOMSyntaxException(Throwable cause) {
		super(DOMException.SYNTAX_ERR, cause);
	}

	public DOMSyntaxException(String message, Throwable cause) {
		super(DOMException.SYNTAX_ERR, message, cause);
	}

}
