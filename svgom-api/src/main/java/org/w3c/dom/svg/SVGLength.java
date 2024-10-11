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

import org.w3c.css.om.unit.CSSUnit;
import org.w3c.dom.DOMException;

/**
 * Represents a value that can be a &lt;length&gt;, &lt;percentage&gt; or
 * &lt;number&gt;.
 */
public interface SVGLength {

	// Length Unit Types
	short SVG_LENGTHTYPE_UNKNOWN = 0;
	short SVG_LENGTHTYPE_NUMBER = 1;
	short SVG_LENGTHTYPE_PERCENTAGE = 2;
	short SVG_LENGTHTYPE_EMS = 3;
	short SVG_LENGTHTYPE_EXS = 4;
	short SVG_LENGTHTYPE_PX = 5;
	short SVG_LENGTHTYPE_CM = 6;
	short SVG_LENGTHTYPE_MM = 7;
	short SVG_LENGTHTYPE_IN = 8;
	short SVG_LENGTHTYPE_PT = 9;
	short SVG_LENGTHTYPE_PC = 10;

	/**
	 * Get the unit type according to {@link CSSUnit}.
	 * <p>
	 * Optional attribute.
	 * </p>
	 * 
	 * @return the CSS unit type.
	 */
	default short getCSSUnitType() {
		return CSSUnit.CSS_INVALID;
	}

	/**
	 * The type of the value as specified by one of the SVG_LENGTHTYPE_* constants
	 * defined on this interface.
	 * 
	 * @return the SVG unit type.
	 */
	default short getUnitType() {
		short svgUnit;
		switch (getCSSUnitType()) {
		case CSSUnit.CSS_NUMBER:
			svgUnit = SVGLength.SVG_LENGTHTYPE_NUMBER;
			break;
		case CSSUnit.CSS_PX:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PX;
			break;
		case CSSUnit.CSS_EM:
			svgUnit = SVGLength.SVG_LENGTHTYPE_EMS;
			break;
		case CSSUnit.CSS_EX:
			svgUnit = SVGLength.SVG_LENGTHTYPE_EXS;
			break;
		case CSSUnit.CSS_IN:
			svgUnit = SVGLength.SVG_LENGTHTYPE_IN;
			break;
		case CSSUnit.CSS_CM:
			svgUnit = SVGLength.SVG_LENGTHTYPE_CM;
			break;
		case CSSUnit.CSS_MM:
			svgUnit = SVGLength.SVG_LENGTHTYPE_MM;
			break;
		case CSSUnit.CSS_PC:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PC;
			break;
		case CSSUnit.CSS_PT:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PT;
			break;
		case CSSUnit.CSS_PERCENTAGE:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PERCENTAGE;
			break;
		default:
			svgUnit = SVGLength.SVG_LENGTHTYPE_UNKNOWN;
			break;
		}
		return svgUnit;
	}

	/**
	 * Gets the SVGLength's value in user units.
	 * 
	 * @return the value in user units.
	 */
	float getValue();

	/**
	 * Sets the SVGLength's value in user units.
	 * 
	 * @param value the value in user units.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if the object is read-only.
	 */
	void setValue(float value) throws DOMException;

	/**
	 * Gets the numeric factor of the SVGLength's value.
	 * 
	 * @return the numeric value in the current unit.
	 */
	float getValueInSpecifiedUnits();

	/**
	 * Sets the numeric factor of the SVGLength's value.
	 * 
	 * @param valueInSpecifiedUnits the value in the current unit.
	 * @throws DOMException NO_MODIFICATION_ALLOWED_ERR if the object is read-only.
	 */
	void setValueInSpecifiedUnits(float valueInSpecifiedUnits) throws DOMException;

	/**
	 * Gets the SVGLength's value as a string.
	 * 
	 * @return the value as a string.
	 */
	String getValueAsString();

	/**
	 * Sets the SVGLength's value as a string.
	 * 
	 * @param valueAsString the length value as a string.
	 * @throws DOMException SYNTAX_ERR if the value is not a valid length.
	 *                      NO_MODIFICATION_ALLOWED_ERR if the object is read-only.
	 * 
	 */
	void setValueAsString(String valueAsString) throws DOMException;

	/**
	 * Sets the SVGLength's value in a typed manner.
	 * 
	 * @param cssUnitType           the unit type according to {@link CSSUnit}.
	 * @param valueInSpecifiedUnits the value in the given unit.
	 * @throws DOMException NOT_SUPPORTED_ERR if the unit is not supported or
	 *                      invalid. NO_MODIFICATION_ALLOWED_ERR if the object is
	 *                      read-only.
	 */
	default void newValueSpecifiedCSSUnits(short cssUnitType, float valueInSpecifiedUnits)
			throws DOMException {
		short svgUnit;
		switch (getCSSUnitType()) {
		case CSSUnit.CSS_NUMBER:
			svgUnit = SVGLength.SVG_LENGTHTYPE_NUMBER;
			break;
		case CSSUnit.CSS_PX:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PX;
			break;
		case CSSUnit.CSS_EM:
			svgUnit = SVGLength.SVG_LENGTHTYPE_EMS;
			break;
		case CSSUnit.CSS_EX:
			svgUnit = SVGLength.SVG_LENGTHTYPE_EXS;
			break;
		case CSSUnit.CSS_IN:
			svgUnit = SVGLength.SVG_LENGTHTYPE_IN;
			break;
		case CSSUnit.CSS_CM:
			svgUnit = SVGLength.SVG_LENGTHTYPE_CM;
			break;
		case CSSUnit.CSS_MM:
			svgUnit = SVGLength.SVG_LENGTHTYPE_MM;
			break;
		case CSSUnit.CSS_PC:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PC;
			break;
		case CSSUnit.CSS_PT:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PT;
			break;
		case CSSUnit.CSS_PERCENTAGE:
			svgUnit = SVGLength.SVG_LENGTHTYPE_PERCENTAGE;
			break;
		default:
			throw new DOMException(DOMException.NOT_SUPPORTED_ERR, "Unsupported CSS unit: "
					+ cssUnitType);
		}
		newValueSpecifiedUnits(svgUnit, valueInSpecifiedUnits);
	}

	/**
	 * Sets the SVGLength's value in a typed manner.
	 * 
	 * @param unitType              the unit type according to the {@code SVGLength}
	 *                              constants.
	 * @param valueInSpecifiedUnits the value in the given unit.
	 * @throws DOMException NOT_SUPPORTED_ERR if the unit is not supported or
	 *                      invalid. NO_MODIFICATION_ALLOWED_ERR if the object is
	 *                      read-only.
	 */
	void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits)
			throws DOMException;

	/**
	 * Converts this SVGLength's value to a specific unit.
	 * 
	 * @param unitType the unit type according to the {@code SVGLength} constants.
	 * @throws DOMException NOT_SUPPORTED_ERR if the unit is not supported or
	 *                      invalid. NO_MODIFICATION_ALLOWED_ERR if the object is
	 *                      read-only.
	 */
	void convertToSpecifiedUnits(short unitType) throws DOMException;

}
