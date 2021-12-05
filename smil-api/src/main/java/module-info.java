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
 * Copyright (c) 2020-2021 Carlos Amengual
 */

/**
 * Synchronized Multimedia Integration Language (SMIL) Java binding.
 * <p>
 * This module contains the Java binding for a subset of an
 * <a href="https://www.w3.org/TR/smil-boston-dom/java-binding.zip">old SMIL
 * version</a>. It has been adapted for compatibility with the subset of SMIL
 * that Apache Batik (and hence EchoSVG) uses (it uses the SMIL packages at the
 * <a href=
 * "http://archive.apache.org/dist/xml/commons/xml-commons-external-1.3.04-src.zip">{@code xml-apis-ext-1.3.04}</a>
 * package).
 * </p>
 */
module org.w3c.dom.smil {
	exports org.w3c.dom.smil;

	requires transitive java.xml;
}
