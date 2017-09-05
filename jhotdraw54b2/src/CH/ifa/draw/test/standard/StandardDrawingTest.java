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

import CH.ifa.draw.standard.StandardDrawing;
import junit.framework.TestCase;
// JUnitDoclet begin import
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
 * TestCase StandardDrawingTest is generated by
 * JUnitDoclet to hold the tests for StandardDrawing.
 * @see CH.ifa.draw.standard.StandardDrawing
 */
// JUnitDoclet end javadoc_class
public class StandardDrawingTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private StandardDrawing standarddrawing;
	// JUnitDoclet end class

	/**
	 * Constructor StandardDrawingTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public StandardDrawingTest(String name) {
		// JUnitDoclet begin method StandardDrawingTest
		super(name);
		// JUnitDoclet end method StandardDrawingTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public CH.ifa.draw.standard.StandardDrawing createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new CH.ifa.draw.standard.StandardDrawing();
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
		standarddrawing = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		standarddrawing = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method addDrawingChangeListener()
	/**
	 * Method testAddDrawingChangeListener is testing addDrawingChangeListener
	 * @see CH.ifa.draw.standard.StandardDrawing#addDrawingChangeListener(CH.ifa.draw.framework.DrawingChangeListener)
	 */
	// JUnitDoclet end javadoc_method addDrawingChangeListener()
	public void testAddDrawingChangeListener() throws Exception {
		// JUnitDoclet begin method addDrawingChangeListener
		// JUnitDoclet end method addDrawingChangeListener
	}

	// JUnitDoclet begin javadoc_method removeDrawingChangeListener()
	/**
	 * Method testRemoveDrawingChangeListener is testing removeDrawingChangeListener
	 * @see CH.ifa.draw.standard.StandardDrawing#removeDrawingChangeListener(CH.ifa.draw.framework.DrawingChangeListener)
	 */
	// JUnitDoclet end javadoc_method removeDrawingChangeListener()
	public void testRemoveDrawingChangeListener() throws Exception {
		// JUnitDoclet begin method removeDrawingChangeListener
		// JUnitDoclet end method removeDrawingChangeListener
	}

	// JUnitDoclet begin javadoc_method drawingChangeListeners()
	/**
	 * Method testDrawingChangeListeners is testing drawingChangeListeners
	 * @see CH.ifa.draw.standard.StandardDrawing#drawingChangeListeners()
	 */
	// JUnitDoclet end javadoc_method drawingChangeListeners()
	public void testDrawingChangeListeners() throws Exception {
		// JUnitDoclet begin method drawingChangeListeners
		// JUnitDoclet end method drawingChangeListeners
	}

	// JUnitDoclet begin javadoc_method orphan()
	/**
	 * Method testOrphan is testing orphan
	 * @see CH.ifa.draw.standard.StandardDrawing#orphan(CH.ifa.draw.framework.Figure)
	 */
	// JUnitDoclet end javadoc_method orphan()
	public void testOrphan() throws Exception {
		// JUnitDoclet begin method orphan
		// JUnitDoclet end method orphan
	}

	// JUnitDoclet begin javadoc_method add()
	/**
	 * Method testAdd is testing add
	 * @see CH.ifa.draw.standard.StandardDrawing#add(CH.ifa.draw.framework.Figure)
	 */
	// JUnitDoclet end javadoc_method add()
	public void testAdd() throws Exception {
		// JUnitDoclet begin method add
		// JUnitDoclet end method add
	}

	// JUnitDoclet begin javadoc_method figureInvalidated()
	/**
	 * Method testFigureInvalidated is testing figureInvalidated
	 * @see CH.ifa.draw.standard.StandardDrawing#figureInvalidated(CH.ifa.draw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureInvalidated()
	public void testFigureInvalidated() throws Exception {
		// JUnitDoclet begin method figureInvalidated
		// JUnitDoclet end method figureInvalidated
	}

	// JUnitDoclet begin javadoc_method fireDrawingTitleChanged()
	/**
	 * Method testFireDrawingTitleChanged is testing fireDrawingTitleChanged
	 * @see CH.ifa.draw.standard.StandardDrawing#fireDrawingTitleChanged()
	 */
	// JUnitDoclet end javadoc_method fireDrawingTitleChanged()
	public void testFireDrawingTitleChanged() throws Exception {
		// JUnitDoclet begin method fireDrawingTitleChanged
		// JUnitDoclet end method fireDrawingTitleChanged
	}

	// JUnitDoclet begin javadoc_method figureRequestUpdate()
	/**
	 * Method testFigureRequestUpdate is testing figureRequestUpdate
	 * @see CH.ifa.draw.standard.StandardDrawing#figureRequestUpdate(CH.ifa.draw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestUpdate()
	public void testFigureRequestUpdate() throws Exception {
		// JUnitDoclet begin method figureRequestUpdate
		// JUnitDoclet end method figureRequestUpdate
	}

	// JUnitDoclet begin javadoc_method handles()
	/**
	 * Method testHandles is testing handles
	 * @see CH.ifa.draw.standard.StandardDrawing#handles()
	 */
	// JUnitDoclet end javadoc_method handles()
	public void testHandles() throws Exception {
		// JUnitDoclet begin method handles
		// JUnitDoclet end method handles
	}

	// JUnitDoclet begin javadoc_method displayBox()
	/**
	 * Method testDisplayBox is testing displayBox
	 * @see CH.ifa.draw.standard.StandardDrawing#displayBox()
	 */
	// JUnitDoclet end javadoc_method displayBox()
	public void testDisplayBox() throws Exception {
		// JUnitDoclet begin method displayBox
		// JUnitDoclet end method displayBox
	}

	// JUnitDoclet begin javadoc_method basicDisplayBox()
	/**
	 * Method testBasicDisplayBox is testing basicDisplayBox
	 * @see CH.ifa.draw.standard.StandardDrawing#basicDisplayBox(java.awt.Point, java.awt.Point)
	 */
	// JUnitDoclet end javadoc_method basicDisplayBox()
	public void testBasicDisplayBox() throws Exception {
		// JUnitDoclet begin method basicDisplayBox
		// JUnitDoclet end method basicDisplayBox
	}

	// JUnitDoclet begin javadoc_method lock()
	/**
	 * Method testLock is testing lock
	 * @see CH.ifa.draw.standard.StandardDrawing#lock()
	 */
	// JUnitDoclet end javadoc_method lock()
	public void testLock() throws Exception {
		// JUnitDoclet begin method lock
		// JUnitDoclet end method lock
	}

	// JUnitDoclet begin javadoc_method unlock()
	/**
	 * Method testUnlock is testing unlock
	 * @see CH.ifa.draw.standard.StandardDrawing#unlock()
	 */
	// JUnitDoclet end javadoc_method unlock()
	public void testUnlock() throws Exception {
		// JUnitDoclet begin method unlock
		// JUnitDoclet end method unlock
	}

	// JUnitDoclet begin javadoc_method setTitle()
	/**
	 * Method testSetGetTitle is testing setTitle
	 * and getTitle together by setting some value
	 * and verifying it by reading.
	 * @see CH.ifa.draw.standard.StandardDrawing#setTitle(java.lang.String)
	 * @see CH.ifa.draw.standard.StandardDrawing#getTitle()
	 */
	// JUnitDoclet end javadoc_method setTitle()
	public void testSetGetTitle() throws Exception {
		// JUnitDoclet begin method setTitle getTitle
		java.lang.String[] tests = { "", " ", "a", "A", "�", "�", "0123456789", "012345678901234567890", "\n", null };

		for (int i = 0; i < tests.length; i++) {
			standarddrawing.setTitle(tests[i]);
			assertEquals(tests[i], standarddrawing.getTitle());
		}
		// JUnitDoclet end method setTitle getTitle
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
