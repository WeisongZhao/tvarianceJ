package com.HIT.weisongzhao;

import javax.swing.JDialog
;

import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

public class AboutTVJ_ extends JDialog implements PlugIn {
	private String defaultMessage = "(c) 2022 HIT";
	private WalkBar_TVJ walk = new WalkBar_TVJ(this.defaultMessage, true, false, true);

	@Override
	public void run(String arg) {
		this.walk.fillAbout("t-variance ImageJ plugin", "05/21/2022 updated", "t axial variance for calcium signal profiling<br>v0.1.3",
				"School of Instrumentation Science and Engineering","Harbin Institute of Technology",
				"Weisong Zhao",
				"<p style=\"text-align:left\">"
				+ "<b>Usage:</b><br>It is a simple FIJI/ImageJ plugin for t-axial variance calculation assisting in calcium signal profiling. It will highlight the regions that have calcium signal transients."
				+ "<br><br><b>Open source:</b><br>https://github.com/WeisongZhao/tvarianceJ"
				+ "");
		
		this.walk.showAbout_TVJ();

	}

	public static void main(String[] args) {

		Class<?> clazz = AboutTVJ_.class;

		// start ImageJ
		new ImageJ();

		IJ.runPlugIn(clazz.getName(), "");
	}

}