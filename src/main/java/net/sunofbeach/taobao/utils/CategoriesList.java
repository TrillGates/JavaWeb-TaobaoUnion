package net.sunofbeach.taobao.utils;



import net.sunofbeach.taobao.beans.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class CategoriesList {

    private static CategoriesList categoriesList = null;

    public static CategoriesList getInstance() {
        if (categoriesList == null) {
            categoriesList = new CategoriesList();
        }
        return categoriesList;
    }

    private CategoriesList() {
        sData.add(new CategoryItem(9660, "推荐"));
        sData.add(new CategoryItem(9649, "食品"));
        sData.add(new CategoryItem(9654, "男装"));
        sData.add(new CategoryItem(9658, "女装"));
        sData.add(new CategoryItem(9652, "内衣"));
        sData.add(new CategoryItem(9650, "母婴"));
        sData.add(new CategoryItem(9656, "数码家电"));
        sData.add(new CategoryItem(9653, "美妆个护"));
        sData.add(new CategoryItem(9651, "运动户外"));
        sData.add(new CategoryItem(9648, "鞋包配饰"));
        sData.add(new CategoryItem(9655, "家居家装"));
    }

    private static List<CategoryItem> sData = new ArrayList<>();

    public static List<CategoryItem> getsData() {
        return sData;
    }
}
