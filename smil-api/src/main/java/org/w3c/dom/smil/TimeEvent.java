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

import org.w3c.dom.events.Event;
import org.w3c.dom.views.AbstractView;

/**
 * Provides specific contextual information associated with Time events.
 */
public interface TimeEvent extends Event {

	/**
	 * Get the {@code AbstractView} from which this event was initialized.
	 */
	AbstractView getView();

	/**
	 * Get some detail information about the {@code Event}, depending on the type of
	 * event.
	 * 
	 * @return a detail information about this event.
	 */
	int getDetail();

	/**
	 * Initialize this event.
	 * <p>
	 * This method may only be called before this event has been dispatched via the
	 * {@code dispatchEvent} method, though it may be called multiple times during
	 * that phase if necessary. If called multiple times, the final invocation takes
	 * precedence.
	 * </p>
	 * 
	 * @param typeArg   the event type.
	 * @param viewArg   the event AbstractView.
	 * @param detailArg the event's detail.
	 */
	void initTimeEvent(String typeArg, AbstractView viewArg, int detailArg);
}
