package com.ruipeng.utils;

/**
 * Created by ruipeng on 2018/5/11.
 */
public enum FileType {
    DIR("dir"), File("file");

    private String value;

    FileType(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return this.value;
    }
}
