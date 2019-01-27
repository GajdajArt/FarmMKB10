package com.example.gajdaj.farmtest.implementation.store;

import android.content.Context;

import com.example.gajdaj.farmtest.R;
import com.example.gajdaj.farmtest.model.entity.Section;
import com.example.gajdaj.farmtest.model.store.MKB10Store;
import com.opencsv.CSVReader;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

public class MKB10csvStoreImpl implements MKB10Store {

    private InputStream inputStream;

    private final Context context;

    private List<String[]> rows;
    private Iterator<String[]> rowsIterator;

    @Inject
    public MKB10csvStoreImpl(Context context) {
        this.context = context;
        inputStream = context.getResources().openRawResource(R.raw.mkb10);
    }

    @NotNull
    @Override
    public List<Section> getMKBList() {
        rows = parse();
        rowsIterator = rows.iterator();

        List<String> parentsId = new ArrayList<>();

        List<Section> resultList = new ArrayList<>();

        if (rows != null && !rows.isEmpty()) {
            resultList = createList();
        } else  {
            throw new NullPointerException();
        }

        return resultList;
    }

    private Section createSection(String[] row) {
        return new Section(row[2], row[3], null);
    }

    private List<Section> createList() {
        List<Section> resultList = new ArrayList<>();

        while (rowsIterator.hasNext()) {
            String[] row = rowsIterator.next();

            Section section = createSection(row);
            section.setList(createList());
            resultList.add(section);        }

        return resultList;
    }

    private List<String[]> parse(){
        List<String[]> resultList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        CSVReader csvReader = new CSVReader(reader);
        try {
            resultList = csvReader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            String csvLine;
//            while ((csvLine = reader.readLine()) != null) {
//                String[] row = csvLine.split(",");
//                resultList.add(row);
//            }
//        }
//        catch (IOException ex) {
//            throw new RuntimeException("Error in reading CSV file: "+ex);
//        }
//        finally {
//            try {
//                inputStream.close();
//            }
//            catch (IOException e) {
//                throw new RuntimeException("Error while closing input stream: "+e);
//            }
//        }
        return resultList;
    }
}
