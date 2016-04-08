package com.github.impl;


import sun.nio.ch.ThreadPool;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yangzhenwei on 15/7/24.
 */
public class Mytest1 implements Runnable {

    public static ExecutorService servicePool = Executors.newFixedThreadPool(100);

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100000; i++) {

            Mytest1 test = new Mytest1();
            servicePool.submit(test);
        }

    }

    @Override
    public void run() {

        try {
            URL url = new URL("http://10.100.142.24:8092/order/get_refunds_by_filter?order_clause=last_operate_date&count=15&page=8&isASC=true&orderfilter=%7B%0A++%22uids%22+%3A+null%2C%0A++%22status%22+%3A+%5B+20%2C+41+%5D%2C%0A++%22commit_begin_time%22+%3A+null%2C%0A++%22departmentIdlist%22+%3A+%5B+301%2C+315%2C+153%2C+154%2C+156%2C+157%2C+158%2C+217%2C+218%2C+219%2C+220%2C+160%2C+161%2C+162%2C+222%2C+223%2C+319%2C+163%2C+164%2C+165%2C+224%2C+225%2C+226%2C+275%2C+282%2C+283%2C+300%2C+293%2C+291%2C+318%2C+327%2C+326%2C+193%2C+194%2C+197%2C+198%2C+199%2C+200%2C+201%2C+216%2C+206%2C+227%2C+228%2C+229%2C+230%2C+231%2C+232%2C+234%2C+235%2C+237%2C+239%2C+240%2C+242%2C+243%2C+244%2C+245%2C+246%2C+247%2C+248%2C+250%2C+251%2C+253%2C+255%2C+325%2C+260%2C+262%2C+264%2C+266%2C+207%2C+208%2C+209%2C+210%2C+211%2C+212%2C+213%2C+214%2C+215%2C+265+%5D%2C%0A++%22commit_end_time%22+%3A+null%2C%0A++%22review_begin_time%22+%3A+null%2C%0A++%22review_end_time%22+%3A+null%2C%0A++%22operater_id%22+%3A+null%2C%0A++%22flag%22+%3A+0%2C%0A++%22refund_begin_time%22+%3A+null%2C%0A++%22refund_end_time%22+%3A+null%2C%0A++%22audit_operater%22+%3A+110060727%2C%0A++%22totalNumSall%22+%3A+null%2C%0A++%22totalNumBig%22+%3A+null%2C%0A++%22auditNum%22+%3A+null%2C%0A++%22totalNum%22+%3A+null%2C%0A++%22type%22+%3A+null%2C%0A++%22refundIds%22+%3A+null%2C%0A++%22opstatus%22+%3A+null%2C%0A++%22logisticsStatus%22+%3A+null%2C%0A++%22departmentIdList%22+%3A+%5B+301%2C+315%2C+153%2C+154%2C+156%2C+157%2C+158%2C+217%2C+218%2C+219%2C+220%2C+160%2C+161%2C+162%2C+222%2C+223%2C+319%2C+163%2C+164%2C+165%2C+224%2C+225%2C+226%2C+275%2C+282%2C+283%2C+300%2C+293%2C+291%2C+318%2C+327%2C+326%2C+193%2C+194%2C+197%2C+198%2C+199%2C+200%2C+201%2C+216%2C+206%2C+227%2C+228%2C+229%2C+230%2C+231%2C+232%2C+234%2C+235%2C+237%2C+239%2C+240%2C+242%2C+243%2C+244%2C+245%2C+246%2C+247%2C+248%2C+250%2C+251%2C+253%2C+255%2C+325%2C+260%2C+262%2C+264%2C+266%2C+207%2C+208%2C+209%2C+210%2C+211%2C+212%2C+213%2C+214%2C+215%2C+265+%5D%0A%7D");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url
                    .openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "text/xml");

            OutputStream outputStream = httpURLConnection.getOutputStream();

            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(outputStream));

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("wlnmyr is very nice");
            stringBuffer.append("myr is a good man");

            bufferedWriter.write(stringBuffer.toString());
            bufferedWriter.flush();
            bufferedWriter.close();

//            InputStream inputStream = httpURLConnection.getInputStream();
//
//            BufferedReader bufferedReader = new BufferedReader(
//                    new InputStreamReader(inputStream));
//
//            String line = null;
//
//            while ((line = bufferedReader.readLine()) != null) {
//
//                System.out.println(line);
//            }

        }catch (Exception e){

        }


    }
}
