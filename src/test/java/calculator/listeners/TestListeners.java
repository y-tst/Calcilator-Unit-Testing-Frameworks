package calculator.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;
import java.util.logging.Logger;

public class TestListeners implements ITestListener {

    final Logger logger = Logger.getGlobal();

    @Override
    public void onTestStart(ITestResult result) {
        logger.info(String.format("Input parameters: %s %s", result.getName(), Arrays.asList(result.getParameters())));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info(String.format("Successful performing of the operation:  %s", Thread.currentThread().getId()));
    }
}
