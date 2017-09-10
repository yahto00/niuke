import com.google.common.collect.FluentIterable;
import com.google.common.io.Files;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;
import java.util.*;

/**
 * alibaba 测验
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int totalCount = Integer.parseInt(reader.readLine());
            assert (totalCount >= 2);
            double[] data = new double[totalCount];
            for (int i = 0; i < totalCount; i++) {
                data[i] = Double.parseDouble(reader.readLine());
            }
            System.out.println(findMin(totalCount, data));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static double findMin(int totalCount, double[] data) {
        double leftNum = data[0];
        double rightNum = data[1];
        double difference = rightNum - leftNum;
        double minNum = leftNum > rightNum ? rightNum : leftNum;
        for (int i = 2; i < totalCount; i++) {
            if (data[i] - minNum > difference) {
                leftNum = minNum;
                rightNum = data[i];
                difference = data[i] - minNum;
            }
            if (data[i] < minNum) {
                minNum = data[i];
            }
        }
        return difference;
    }
}