package com.HIT.weisongzhao;

import javax.swing.JDialog
;

import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

public class AboutTVJ_ extends JDialog implements PlugIn {
	private String defaultMessage = "(c) 2021 	HIT";
	private WalkBar_TVJ walk = new WalkBar_TVJ(this.defaultMessage, true, false, true);

	@Override
	public void run(String arg) {
		this.walk.fillAbout("t-variance ImageJ plugin", " 06/04/2021", "t axial variance for calcium signal profiling<br>v0.1.3",
				"School of Instrumentation Science and Engineering<br/>Harbin Institute of Technology",
				"Weisong Zhao (zhaoweisong950713@163.com)", "2020",
				"<p style=\"text-align:left\">"
				+ "<b>Publications:</b>"
				+ "<br> XXXXXXXXXXXXXXXXXXXXXXX"
				+ "<br><br><b>References:</b>"
				+ "<br>[1] D. Sage, L. Donati, F. Soulez, D. Fortun, G. Schmit, A. Seitz, R. Guiet, C. Vonesch, and M. Unser, \"DeconvolutionLab2: An open-source software for deconvolution microscopy,\" Methods vol. 115, no. 28, 2017."				
				+ "<br><br><b>Acknowledgements:</b><br>This plugin is built on the top of DeconvolutionLab2 [1]"
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