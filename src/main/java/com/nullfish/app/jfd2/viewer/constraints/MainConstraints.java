/*
 * Created on 2004/12/29
 *
 */
package com.nullfish.app.jfd2.viewer.constraints;

import com.nullfish.app.jfd2.JFDComponent;
import com.nullfish.app.jfd2.ui.container2.ContainerPosition;
import com.nullfish.app.jfd2.viewer.FileViewerConstraints;

/**
 * @author shunji
 *
 */
public class MainConstraints extends FileViewerConstraints {
	public static final String NAME = "main";
	
	/**
	 * @param name
	 */
	public MainConstraints() {
		super(NAME);
	}

	
	/**
	 * 
	 * @param jfd
	 * @return
	 */
	public ContainerPosition getPosition(JFDComponent component) {
		return ContainerPosition.MAIN_PANEL;
	}
}
