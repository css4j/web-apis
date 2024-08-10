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
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.css.DocumentCSS;
import org.w3c.dom.css.ViewCSS;
import org.w3c.dom.events.DocumentEvent;
import org.w3c.dom.events.EventTarget;

public interface SVGSVGElement extends SVGElement, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable,
		SVGLocatable, SVGFitToViewBox, SVGZoomAndPan, EventTarget, DocumentEvent, ViewCSS, DocumentCSS {
	SVGAnimatedLength getX();

	SVGAnimatedLength getY();

	SVGAnimatedLength getWidth();

	SVGAnimatedLength getHeight();

	String getContentScriptType();

	void setContentScriptType(String contentScriptType) throws DOMException;

	String getContentStyleType();

	void setContentStyleType(String contentStyleType) throws DOMException;

	SVGRect getViewport();

	float getPixelUnitToMillimeterX();

	float getPixelUnitToMillimeterY();

	float getScreenPixelToMillimeterX();

	float getScreenPixelToMillimeterY();

	boolean getUseCurrentView();

	void setUseCurrentView(boolean useCurrentView) throws DOMException;

	SVGViewSpec getCurrentView();

	float getCurrentScale();

	void setCurrentScale(float currentScale) throws DOMException;

	SVGPoint getCurrentTranslate();

	int suspendRedraw(int max_wait_milliseconds);

	void unsuspendRedraw(int suspend_handle_id) throws DOMException;

	void unsuspendRedrawAll();

	void forceRedraw();

	void pauseAnimations();

	void unpauseAnimations();

	boolean animationsPaused();

	float getCurrentTime();

	void setCurrentTime(float seconds);

	NodeList getIntersectionList(SVGRect rect, SVGElement referenceElement);

	NodeList getEnclosureList(SVGRect rect, SVGElement referenceElement);

	boolean checkIntersection(SVGElement element, SVGRect rect);

	boolean checkEnclosure(SVGElement element, SVGRect rect);

	void deselectAll();

	SVGNumber createSVGNumber();

	SVGLength createSVGLength();

	SVGAngle createSVGAngle();

	SVGPoint createSVGPoint();

	SVGMatrix createSVGMatrix();

	SVGRect createSVGRect();

	SVGTransform createSVGTransform();

	SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);

	Element getElementById(String elementId);
}
