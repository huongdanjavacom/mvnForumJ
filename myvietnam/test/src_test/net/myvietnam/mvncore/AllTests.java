/*
 * $Header: /cvsroot/mvnforum/myvietnam/test/src_test/net/myvietnam/mvncore/AllTests.java,v 1.1 2010/07/09 06:16:46 minhnn Exp $
 * $Author: minhnn $
 * $Revision: 1.1 $
 * $Date: 2010/07/09 06:16:46 $
 *
 * ====================================================================
 *
 * Copyright (C) 2002-2010 by MyVietnam.net
 *
 * All copyright notices regarding MyVietnam and MyVietnam CoreLib
 * MUST remain intact in the scripts and source code.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * Correspondence and Marketing Questions can be sent to:
 * info at MyVietnam net
 *
 * @author: Minh Nguyen
 */
package net.myvietnam.mvncore;

import net.myvietnam.mvncore.filter.DisableHtmlTagFilterTest;
import net.myvietnam.mvncore.util.MailUtilTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    MailUtilTest.class, 
    DisableHtmlTagFilterTest.class
})
public class AllTests {
    
}
