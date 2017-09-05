/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package CH.ifa.draw.test.standard;

import java.awt.Point;

import junit.framework.TestCase;

// JUnitDoclet begin import
import CH.ifa.draw.figures.RectangleFigure;
import CH.ifa.draw.standard.SingleFigureEnumerator;
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase SingleFigureEnumeratorTest is generated by
 * JUnitDoclet to hold the tests for SingleFigureEnumerator.
 * @see CH.ifa.draw.standard.SingleFigureEnumerator
 */
// JUnitDoclet end javadoc_class
public class SingleFigureEnumeratorTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private SingleFigureEnumerator singlefigureenumerator;
	// JUnitDoclet end class

	/**
	 * Constructor SingleFigureEnumeratorTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public SingleFigureEnumeratorTest(String name) {
		// JUnitDoclet begin method SingleFigureEnumeratorTest
		super(name);
		// JUnitDoclet end method SingleFigureEnumeratorTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public CH.ifa.draw.standard.SingleFigureEnumerator createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new CH.ifa.draw.standard.SingleFigureEnumerator(new RectangleFigure(new Point(10, 10), new Point(100, 100)));
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		singlefigureenumerator = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		singlefigureenumerator = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method hasNextFigure()
	/**
	 * Method testHasNextFigure is testing hasNextFigure
	 * @see CH.ifa.draw.standard.SingleFigureEnumerator#hasNextFigure()
	 */
	// JUnitDoclet end javadoc_method hasNextFigure()
	public void testHasNextFigure() throws Exception {
		// JUnitDoclet begin method hasNextFigure
		// JUnitDoclet end method hasNextFigure
	}

	// JUnitDoclet begin javadoc_method nextFigure()
	/**
	 * Method testNextFigure is testing nextFigure
	 * @see CH.ifa.draw.standard.SingleFigureEnumerator#nextFigure()
	 */
	// JUnitDoclet end javadoc_method nextFigure()
	public void testNextFigure() throws Exception {
		// JUnitDoclet begin method nextFigure
		// JUnitDoclet end method nextFigure
	}

	// JUnitDoclet begin javadoc_method reset()
	/**
	 * Method testReset is testing reset
	 * @see CH.ifa.draw.standard.SingleFigureEnumerator#reset()
	 */
	// JUnitDoclet end javadoc_method reset()
	public void testReset() throws Exception {
		// JUnitDoclet begin method reset
		// JUnitDoclet end method reset
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

}
