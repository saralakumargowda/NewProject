package org.yantra.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenrsJava implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.listenerdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Folder/img.png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Random r=new Random();
		int number = r.nextInt(100);
		TakesScreenshot ts = (TakesScreenshot) BaseClass.listenerdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Folder/img"+number+".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
	}

	}
