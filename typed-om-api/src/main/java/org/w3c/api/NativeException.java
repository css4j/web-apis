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

/**
 * Native exception in Web APIs.
 */
public class NativeException extends Exception {

	private static final long serialVersionUID = 1L;

	public NativeException() {
	}

	public NativeException(String message) {
		super(message);
	}

	public NativeException(Throwable cause) {
		super(cause);
	}

	public NativeException(String message, Throwable cause) {
		super(message, cause);
	}

	public NativeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
