package calculator.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.logging.Logger;

public class TestListeners implements ITestListener {

    final Logger logger = Logger.getGlobal();

    @Override
    public void onTestStart(ITestResult result) {
        logger.info(String.format("On Test Start:  %s", result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info(String.format("On Test Success:  %s", result.getName()));
        System.out.println("On Test Success" + result.getName());
    }
}
