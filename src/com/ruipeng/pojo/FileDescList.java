package com.ruipeng.pojo;

import java.util.List;

/**
 * Created by ruipeng on 2018/5/11.
 */
public class FileDescList {
    private List<FileDesc> result;

    public FileDescList() {
    }

    public FileDescList(List<FileDesc> result) {
        this.result = result;
    }

    public List<FileDesc> getResult() {
        return result;
    }

    public void setResult(List<FileDesc> result) {
        this.result = result;
    }
}
