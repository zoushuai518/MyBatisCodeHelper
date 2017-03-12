package com.ccnode.codegenerator.datasourceToolWindow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bruce.ge
 * @Date 2017/3/9
 * @Description
 */
public class DatasourceState {
    private List<NewDatabaseInfo> databaseInfos = new ArrayList<>();


    public List<NewDatabaseInfo> getDatabaseInfos() {
        return databaseInfos;
    }

    public void setDatabaseInfos(List<NewDatabaseInfo> databaseInfos) {
        this.databaseInfos = databaseInfos;
    }
}
