import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class CucumberTestResults {
    public static void main(String[] args) {
        log.info("Reading cucumber test results");
        Document html;
        try {
            html = Jsoup.parse(new File(System.getProperty("user.dir") + File.separator + "target" +
                    File.separator + "cucumber-reports" + File.separator + "cucumber-html-reports" +
                    File.separator + "overview-features.html"), "ISO-8859-1");
            Element table = html.body().getElementById("tablesorter");
            if (table != null) {
                log.info("Cucumber test results table is present");
                table.attr("border", "1px");
                table.getElementsByClass("header dont-sort").attr("bgcolor", "#66CCEE");
                table.getElementsByClass("passed").attr("bgcolor", "#92DD96");
                table.getElementsByClass("failed").attr("bgcolor", "#F2928C");
                table.getElementsByClass("skipped").attr("bgcolor", "#8AF");
                table.getElementsByClass("pending").attr("bgcolor", "#F5F28F");
                table.getElementsByClass("undefined").attr("bgcolor", "#F5B975");
                table.getElementsByClass("total").attr("bgcolor", "lightgray");
                table.getElementsByClass("passed").attr("bgcolor", "#92DD96");
                table.getElementsByClass("failed").attr("bgcolor", "#F2928C");
                table.getElementsByClass("total").attr("bgcolor", "lightgray");
                table.getElementsByClass("tagname").select("a").removeAttr("href");
                File theDir = new File(System.getProperty("user.dir") + File.separator + "target" +
                        File.separator + "temp");
                if (!theDir.exists()) {
                    theDir.mkdirs();
                }
                File file = new File(System.getProperty("user.dir") + File.separator + "target" +
                        File.separator + "temp" + File.separator + "CucumberTestResults.txt");
                if (file.createNewFile()) {
                    log.info("CucumberTestResults file created: " + file.getName());
                    FileWriter myWriter = new FileWriter(System.getProperty("user.dir") + File.separator + "target" +
                            File.separator + "temp" + File.separator + "CucumberTestResults.txt");
                    myWriter.write(String.valueOf(table));
                    myWriter.close();
                } else {
                    log.info("CucumberTestResults file already exists.");
                    FileWriter myWriter = new FileWriter(System.getProperty("user.dir") + File.separator + "target" +
                            File.separator + "temp" + File.separator + "CucumberTestResults.txt");
                    myWriter.write(String.valueOf(table));
                    myWriter.close();
                }
                log.info("CucumberTestResults set successfully");
            }
        } catch (IOException e) {
            System.setProperty("CucumberTestResults", "Failed to capture Cucumber Test Results");
            log.error("Error : " + e);
        }
    }
}
