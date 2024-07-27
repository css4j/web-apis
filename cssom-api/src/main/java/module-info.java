/*
 * Copyright (c) 2018-2023 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 * 
 * Other copyrights:
 * Copyright (c) 2020-2024, Carlos Amengual
 */

/**
 * CSS Typed OM Java binding.
 */
module org.w3c.css.om {

	exports org.w3c.api;
	exports org.w3c.css.om;
	exports org.w3c.css.om.typed;
	exports org.w3c.css.om.unit;
	exports org.w3c.css.om.view;

	requires jdk.xml.dom;
	requires transitive java.xml;

}
