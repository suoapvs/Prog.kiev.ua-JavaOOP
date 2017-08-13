package com.yurii.salimov.lesson12.task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/**
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 * @version 1.0
 */
public final class Server {

    private final String filePath;
    private final String reportPath;

    public Server(final String filePath, final String reportPath) throws FileNotFoundException {
        this.filePath = filePath;
        this.reportPath = reportPath;
        final File file = new File(this.filePath);
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(filePath);
        }
    }

    public void getStatusConnectionReport() throws InterruptedException, IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append(new Date())
                .append("\r\nServer - status:\r\n");
        for (String address : getAddressList()) {
            int status = getStatusServer(address);
            sb.append(address)
                    .append(" - ")
                    .append((status == 0 ? "reachable\r\n" : "unreachable\r\n"));
        }
        Files.write(this.reportPath, sb);
    }

    private int getStatusServer(final String address) throws InterruptedException, IOException {
        final Runtime runtime = Runtime.getRuntime();
        final Process process = runtime.exec("ping " + address);
        return process.waitFor();
    }

    public List<String> getAddressList() throws FileNotFoundException {
        final String addresses = Files.read(this.filePath).replace("https://", "").replace("http://", "");
        return Arrays.asList(addresses.split("\n"));
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getReportPath() {
        return reportPath;
    }
}
