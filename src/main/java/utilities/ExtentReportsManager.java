package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            String reportPath = ConfigReader.getProperty("report.path")
                    + "/ExtentReport.html";

            ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);

            extent = new ExtentReports();

            extent.attachReporter(reporter);

            extent.setSystemInfo("Framework", "Selenium TestNG");

        }

        return extent;
    }

}