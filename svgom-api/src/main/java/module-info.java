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
 * 
 * Later modifications:
 * Copyright (c) 2020-2025 Carlos Amengual
 */

/**
 * Scalable Vector Graphics (SVG) Java binding.
 * <p>
 * This is a Java binding for an old version of the SVG DOM API (SVGOM). It is
 * compatible with modern Typed OM but also with the legacy SVGOM API used by
 * Apache Batik (which uses the SVGOM packages at the <a href=
 * "http://archive.apache.org/dist/xml/commons/xml-commons-external-1.3.04-src.zip">{@code xml-apis-ext-1.3.04}</a>
 * package), that seem to be a mixture of the
 * <a href="http://www.w3.org/TR/2000/CR-SVG-20000802/java-binding.zip">SVG
 * 1.0</a> and
 * <a href="http://www.w3.org/TR/2011/REC-SVG11-20110816/java-binding.zip">SVG
 * 1.1</a> bindings.
 * </p>
 * <p>
 * Some method signatures were modified so they match the implementations in
 * Apache Batik.
 * </p>
 */
module org.w3c.dom.svg {

	exports org.w3c.dom.svg;

	requires transitive jdk.xml.dom;
	requires transitive org.w3c.dom.smil;
	requires transitive org.w3c.css.om;

}
