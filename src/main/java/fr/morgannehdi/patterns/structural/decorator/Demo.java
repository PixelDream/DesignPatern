package fr.morgannehdi.patterns.structural.decorator;

import fr.morgannehdi.patterns.structural.decorator.decorators.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {

    public static final String OUTPUT_TXT = "OutputDemo.txt";

    public static void main(String[] args) {
        try {
            createDirectoryIfNotExist();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(OUTPUT_TXT)
                )
        );

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(OUTPUT_TXT);

        System.out.println("\n- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("\n- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("\n- Decoded --------------");
        System.out.println(encoded.readData());
    }

    private static void createDirectoryIfNotExist() throws IOException {
        File yourFile = new File(OUTPUT_TXT);
        yourFile.createNewFile(); // if file already exists will do nothing
        FileOutputStream oFile = new FileOutputStream(yourFile, false);
    }
}