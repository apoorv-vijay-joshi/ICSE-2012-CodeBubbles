/********************************************************************************/
/*										*/
/*		ConcreteToken.java						*/
/*										*/
/*	Python Bubbles Base actual token representation 			*/
/*										*/
/********************************************************************************/
/*	Copyright 2009 Brown University -- Steven P. Reiss		      */
/*********************************************************************************
 *  Copyright 2011, Brown University, Providence, RI.				 *
 *										 *
 *			  All Rights Reserved					 *
 *										 *
 * This program and the accompanying materials are made available under the	 *
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, *
 * and is available at								 *
 *	http://www.eclipse.org/legal/epl-v10.html				 *
 *										 *
 ********************************************************************************/
/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on Nov 22, 2004
 *
 * @author Fabio Zadrozny
 */

package edu.brown.cs.bubbles.pybase.symbols;

/**
 * A concrete token is created for representing modules.
 *
 * E.g.: if there is a module called foo.bar.config, a concrete token for with rep: config
 * and parentPackage foo.bar.config is created.
 *
 * @author Fabio Zadrozny
 */
public final class ConcreteToken extends AbstractToken {



/**
 * @param rep The representation for this token
 * @param doc the document that contains the token
 * @param parentPackage the parent package for the token (in this case, the module itself)
 * @param type the type for this token
 */
public ConcreteToken(String rep,String doc,String args,String parentPackage,TokenType type)
{
   super(rep,doc,args,parentPackage,type);
}

} // end of class ConcreteToken


/* end of ConcreteToken.java */
